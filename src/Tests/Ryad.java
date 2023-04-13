package Tests;

public class Ryad {
    double sum = 0;
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.print("sqrt(" + i + ") - 2sqrt(" + (i + 1) + ") + sqrt(" + (i + 2) + ") + ");
        }

    }

    public static double func(int n){
        return Math.sqrt(n) - 2 * Math.sqrt(n + 1) + Math.sqrt(n + 2);
    }
}
