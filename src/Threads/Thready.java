package Threads;

import java.util.Collection;
import java.util.Iterator;

class Test{
    public static void main(String[] args) {
        Thready thready = new Thready();
        thready.start();
        thready.start();
    }
}

public class Thready extends Thread{

    @Override
    public void run() {
        System.out.println("Thread was started");
    }
}
