package observer;

import java.util.*;

interface Subject    //抽象主题
{
    public void addObserver(Observer obs);
    public void cry();
}

interface Observer    //抽象观察者
{
    public void response();
}

class Cat implements Subject    //具体主题
{
    private ArrayList<Observer> list;

    public Cat() {
        list = new ArrayList<Observer>();
    }

    public void addObserver(Observer obs) {
        list.add(obs);
    }

    public void cry() {
        System.out.println("汤姆大叫一声！");
        for (Object obj : list) {
            ((Observer) obj).response();
        }
    }
}

class Mouse implements Observer    //具体观察者
{

    private String name;

    public Mouse(String name, Subject subject) {
        this.name = name;
        subject.addObserver(this);
    }

    public void response() {
        System.out.println(this.name + "拼命逃跑！");
    }
}

class Master implements Observer     //具体观察者
{
    private String name;

    public Master(String name, Subject subject) {
        this.name = name;
        subject.addObserver(this);
    }

    public void response() {

        System.out.println(this.name + "从美梦中惊醒！");
    }
}

class Client    //客户端测试类
{
    public static void main(String args[])
    {

        Subject cat = new Cat();
        Observer mouse , master;
        mouse = new Mouse("杰瑞", cat);
        master = new Master("老主人", cat);
        cat.cry();
    }
}