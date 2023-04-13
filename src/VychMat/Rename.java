package VychMat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rename {
    static  List<Double> xses = new ArrayList<>();
    static List<Double> yxes = new ArrayList<>();
    static int steps = 0;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        methodRunge();
    }
    public static void methodRunge(){
        double x0 = sc.nextDouble(), y0 = sc.nextDouble(), h = sc.nextDouble();
        steps = sc.nextInt();
        nextXAndY(x0, y0, h, 0);
        for(int i = 0; i < xses.size(); i++){
            System.out.println("X: " + xses.get(i) + " Y: " + yxes.get(i));
        }
    }
    public static  void methodTrap(){
        double x0 = sc.nextDouble(), y0 = sc.nextDouble(), h = sc.nextDouble();
        steps = sc.nextInt();
        trap(x0, y0, h, 0);
        for(int i = 0; i < xses.size(); i++){
            System.out.println("X: " + xses.get(i) + " Y: " + yxes.get(i));
        }
    }

    public static void nextXAndY(double befX, double befY, double h, int step){
        if(step == steps){
            return;
        }
        double x = befX + h;
        double k1 = f(befX, befY), k2 = f(befX + h/2, befY + h*k1/2), k3 = f(befX + h/2, befY + h*k2/2), k4 = f(befX + h, befY + h * k3);
        double y = befY + h/6*(k1 + 2 * k2 + 2 * k3 + k4);
        System.out.println("K1: " + k1 + " K2: " + k2 + " K3: " + k3 + " K4: " + k4);
        xses.add(x);
        yxes.add(y);
        nextXAndY(x, y, h, step + 1);

    }

    public static void trap(double befX, double befY, double h, int step){
        if(step == steps){
            return;
        }
        double x = befX + h;
        double y = befY + h/2*(f(befX, befY) + f(x, befY + h *f(befX, befY)));
        xses.add(x);
        yxes.add(y);
        trap(x, y, h, step + 1);
    }

    public static double f(double x, double y){
        return x*x + 2.2 / 2 * y;
    }
}
