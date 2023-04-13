package Samsung;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Thd {
    public static void mail(String[] args) {
        Acc firstAcc = new Acc(100);
        Check ch1 = new Check(80, firstAcc);
        Check ch2 = new Check(90, firstAcc);
        ch1.start();
        ch2.start();
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Check ch3 = new Check(90, firstAcc);
        ch3.start();
    }

}

class Check extends Thread{
    private double price;
    private Acc current;
    public Check(int price, Acc acc){
        this.price = price;
        current = acc;
    }

    @Override
    public void run() {
        debiting();
    }

    public boolean debiting(){
        if(check()){
            try{
                Thread.sleep((long)(500 * (Math.random() % 5)));
            }
            catch (Exception e){
                e.printStackTrace();
            }
            current.acc -= price;
            System.out.println("Деньги списаны");
            System.out.println(current.acc);
            return true;
        }
        else{
            System.out.println("Денег не достаточно");
            System.out.println(current.acc);
            return false;
        }
    }
    private boolean check(){
        return price <= current.acc;
    }
}
class Acc{


    public double acc;


    public Acc(double acc){
        this.acc = acc;
    }
}




class MyHouse {
    private int count;
    public MyHouse(int count){
        this.count = count;
    }
    private boolean pizzaArrived = false;
    public void eatPizza() {
        synchronized (this) {
            while (!pizzaArrived) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
        }
        System.out.println("yumyum...");
    }
    public void pizzaGuy() {
        synchronized (this) {
            pizzaArrived = true;
            notifyAll();
        }
    }
}

class Test1{
    MyHouse myHouse;
    List<MyHouse> array = new ArrayList<>();
    class MyThread extends Thread {
        @Override
        public void run() {
            super.run();
            myHouse.eatPizza();
        }
    }

    public static void main(String[] args) {
        Test1 test = new Test1();
        for(int i = 1; i <= 5; i++){
            test.array.add(new MyHouse(i));
        }

        Collections.shuffle(test.array);

        MyThread thread = test.new MyThread();
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        test.myHouse.pizzaGuy();
    }
}
