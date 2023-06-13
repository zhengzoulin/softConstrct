package Strategy;

public class Client {
    public static void main(String args[])
    {
        MyPlan mp1=new MyPlan(new BicycleTravelStrategy());
        mp1.travelMethod();

        MyPlan mp2=new MyPlan(new AirplaneStrategy());
        mp2.travelMethod();

        MyPlan mp3=new MyPlan(new TrainStrategy());
        mp3.travelMethod();
    }
}

class MyPlan
{
    private TravelStrategy ts;
    public MyPlan(TravelStrategy ts)
    {
        this.ts=ts;
    }
    public void travelMethod()
    {
        ts.travelMethod();
    }
}
interface TravelStrategy
{

     void travelMethod();

}
class AirplaneStrategy implements  TravelStrategy
{

    @Override
    public void travelMethod() {
        System.out.println("飞机旅游！");
    }
}

class TrainStrategy implements  TravelStrategy
{
    @Override
    public void travelMethod() {
        System.out.println("火车旅游！");
    }
}


class BicycleTravelStrategy implements  TravelStrategy
{
    @Override
    public void travelMethod() {
        System.out.println("自行车旅游！");
    }
}
