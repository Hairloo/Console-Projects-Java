package Tests;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Map<A, Integer> map = new HashMap<>();
        A a = new A(1, 3);
        A b = new A(2, 5);
        map.put(a, 4);
        map.put(b, 5);
        b = null;
        System.gc();
        for(Map.Entry<A, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey());
        }
    }
    private static void compare(int [] o1, int [] o2){
        double a = (Math.sqrt(o1[0] * o1[0] + o1[1] * o1[1]) - Math.sqrt(o2[0] * o2[0] + o2[1] * o2[1]));
        System.out.println(a > 0 ? "o1 win" : "o2 win");
    }
}

class A{
    int a;
    int b;

    public A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
