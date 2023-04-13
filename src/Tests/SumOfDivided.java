package Tests;


import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


class Tinkoff{
    public static void main(String[] args) {


    }


}

































class Printer{
    public static void print(int[] a){
        for(int i = 0; i < a.length; i++){
            if(i  == 0){
                System.out.print("[" + a[i]);
            }
            else{
                System.out.print("," + a[i]);
                if(i == a.length - 1){
                    System.out.print("]");
                }
            }
        }
    }
    public static void print(double[] a){
        for(int i = 0; i < a.length; i++){
            if(i  == 0){
                System.out.print("[" + a[i]);
            }
            else{
                System.out.print("," + a[i]);
                if(i == a.length - 1){
                    System.out.print("]");
                }
            }
        }
    }
    public static void print(int a){
        System.out.println(a);
    }
    public static void print(double a){
        System.out.println(a);
    }
}



class Rect{
    private int s; int w, h;
    Rect(int w, int h){
        this.w = w;
        this.h = h;
        s = w * h;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }
}



class CheTakoe{
    public static void onTrial(){
        System.out.println("determinant");
    }
    public static void beNice(){

    }
}

interface Foo{ int x = 10;}

class SumOfDivided {


}




