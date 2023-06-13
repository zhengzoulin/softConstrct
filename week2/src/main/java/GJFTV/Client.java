package GJFTV;

public class Client {

    public static void main(String[] args) {
        Television tv = new XiaoMiTelevision();
        TVIterator i=tv.createIterator();
        System.out.println("电视机频道：");
        while(!i.isLast())
        {
            System.out.println(i.currentChannel().toString());
            i.next();
        }

        i.previous();//
        System.out.println("\n上一个："+i.currentChannel().toString());
        i.previous();//
        System.out.println("上一个："+i.currentChannel().toString());
        i.next();//
        System.out.println("下一个："+i.currentChannel().toString());
    }
}

//抽象聚合类
 interface Television {
    TVIterator createIterator();
}

//具体聚合类
 class XiaoMiTelevision implements Television{
    public Object[] obj = {"CCTV-1", "CCTV-2", "CCTV-3", "CCTV-4"};
    public TVIterator createIterator()
    {
        return new XiaoMiIterator(this);
    }
}

//抽象迭代器类
 interface TVIterator {
    void setChannel(int i);
    void next();
    void previous();
    boolean isLast();
    Object currentChannel();
    boolean isFirst();
}

//具体迭代器类
 class XiaoMiIterator implements TVIterator{
    private int currentIndex = 0;
    private XiaoMiTelevision xiaomi;
    public XiaoMiIterator(XiaoMiTelevision xiaomi) {
        this.xiaomi=xiaomi;
    }
    public void next() {
        if (currentIndex < xiaomi.obj.length) {
            currentIndex++;
        }
    }
    public void previous() {
        if (currentIndex > 0) {
            currentIndex--;
        }
    }
    public void setChannel(int i) {
        if (i >= 0 && i <= xiaomi.obj.length) {
            currentIndex = i;
        }
    }
    public Object currentChannel() {
        return xiaomi.obj[currentIndex];
    }

    public boolean isFirst() {
        return currentIndex == 0;
    }

    public boolean isLast() {
        return currentIndex == xiaomi.obj.length;
    }
}
