package singleton;

public class Client {
    public static void main(String[] args) {
        LoadBalancer m1,m2,m3,m4,m5;
        m1=LoadBalancer.getInstance(1);
        m2=LoadBalancer.getInstance(2);
        m3=LoadBalancer.getInstance(3);
        m4=LoadBalancer.getInstance(4);
        m5=LoadBalancer.getInstance(5);
        m1.print();
        m2.print();
        m3.print();
        m4.print();
        m5.print();

    }
}
class LoadBalancer {
    private static LoadBalancer[] instances;
    private static int maxInstances = 2;

    private int id;

    private  LoadBalancer(int id) {
        this.id = id;
    }
    public static LoadBalancer getInstance(int id) {
        if (instances == null) {
            instances = new LoadBalancer[maxInstances];
            for (int i = 0; i < maxInstances; i++) {
                instances[i] = new LoadBalancer(i);
            }
        }
        return instances[id % maxInstances];
    }
    public void print(){
        System.out.println("请求至服务器A：server:"+id);
    }
}
