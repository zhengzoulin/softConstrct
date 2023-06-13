public class shapeDemo {
    public static  void main(String[] args) throws Exception {
        Shape shape1,shape2,shape3;
        try{
             shape1=ShapeFactory.shapeCreate("圆形");
             shape2=ShapeFactory.shapeCreate("矩形");
             shape3=ShapeFactory.shapeCreate("三角形");
            shape1.draw();
            shape1.erase();
            shape2.draw();
            shape2.erase();
            shape3.draw();
            shape3.erase();
        }catch (Exception e){
            System.out.println("error");
        }

    }


}
abstract class Shape{
    public abstract void draw();
    public abstract void erase();

}
class ShapeFactory{
    public static Shape shapeCreate(String shapeType)   {
        Shape shape = null;
        if(shapeType.equals("圆形")){
             shape=new Cirle();
        }
        if(shapeType.equals("矩形")){
             shape=new Rectangle();
        }
        if(shapeType.equals("三角形")){
             shape=new Triangle();
        }
        
        return shape;
    }
}

class Cirle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");

    }

    @Override
    public void erase() {
        System.out.println("擦除圆形");
    }
}
class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制矩形");

    }

    @Override
    public void erase() {
        System.out.println("擦除矩形");
    }
}
class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制三角形");

    }

    @Override
    public void erase() {
        System.out.println("擦除三角形");
    }
}

