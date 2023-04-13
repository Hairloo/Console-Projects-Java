package Samsung;

import java.util.Scanner;

public class Fraction {
    private int numerator;
    private int denumerator = 1;
    public Fraction(){

    }
    public Fraction(int numerator, int denumerator){
        if(denumerator == 0){
            System.out.println("divide by zero");
            return;
        }
        this.numerator = numerator;
        this.denumerator = denumerator;
        reduce();
    }
    public void add(int n){
        numerator = n * denumerator + numerator;
        reduce();
    }
    public void divide(Fraction fraction){
        if(denumerator == 0){
            System.out.println("divide by zero");
            return;
        }
        numerator = numerator * fraction.denumerator;
        denumerator = denumerator * fraction.numerator;
        reduce();
    }
    public void multiply(int n){
        denumerator = denumerator * n;
        reduce();
    }
    public void substract(int n){
        numerator = numerator - n * denumerator;
        reduce();
    }
    public void add(Fraction fraction) {
        numerator = numerator * fraction.denumerator + fraction.numerator * denumerator;
        denumerator = denumerator * fraction.denumerator;
        reduce();
    }
    public void substract(Fraction fraction) {
        numerator = numerator * fraction.denumerator - fraction.numerator * denumerator;
        denumerator = denumerator * fraction.denumerator;
        reduce();
    }
    public void multiply(Fraction fraction) {
        numerator = numerator * fraction.numerator;
        denumerator = denumerator * fraction.denumerator;
        reduce();
    }

    public void print(){
        System.out.println(numerator + "/" + numerator);
    }
    public String toString(){
        return numerator + "/" + denumerator;
    }
    public void nextFraction() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        if (d == 0) {
            System.out.println("Знаменатель не может быть нулевым!");
            return;
        }
        numerator = n;
        denumerator = d;
        reduce();
    }
    private void reduce(){
        int maxDiv = 1;
        for(int i = 1; i < Math.abs(Math.min(numerator, denumerator)); i++){
            if(numerator % i == 0 && denumerator % i == 0){
                maxDiv = i;
            }
        }
        numerator = numerator / maxDiv;
        denumerator = denumerator / maxDiv;
    }
    private int getGCD(int a, int b) { return b==0 ? a : getGCD(b, a%b); }

}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Num:");
        int a = sc.nextInt();
        System.out.println("Denum:");
        int b = sc.nextInt();
        Fraction fr = new Fraction(1, 2);
        Fraction fr1 = new Fraction(12, 8);
        Fraction fr2 = new Fraction(5, 6);
        Fraction fr3 = new Fraction(1, 16);
        Fraction fr4 = new Fraction(3, 4);
        Fraction fr5 = new Fraction(4, 6);
        fr.add(fr1);
        fr.substract(fr2);
        fr4.divide(fr5);
        fr3.substract(fr4);
        fr.divide(fr3);
        System.out.println(fr);
    }
}
