package Bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        Product productA=new ProductA();
        Coler coler=new Blue();
        productA.setName("产品A");
        productA.setColer(coler);
        productA.Operation();
    }
}


interface  Coler{
    public void OperationImp(String name);

}
abstract class Product{
    private String name;
    protected Coler coler;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setColer(Coler coler){
        this.coler=coler;
    }

    public abstract void Operation();

}

class Red implements Coler{

    @Override
    public void OperationImp(String name) {
        System.out.println(name+"：红色");
    }
}

class Blue implements Coler{

    @Override
    public void OperationImp(String name) {
        System.out.println(name+"：蓝色");
    }
}

class black implements Coler{

    @Override
    public void OperationImp(String name) {
        System.out.println(name+"：黑色");
    }
}
class ProductA extends Product{
    @Override
    public void Operation() {
        coler.OperationImp(this.getName());
    }
}

