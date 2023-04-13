package Mirea.Eight;

import java.util.Arrays;

public class Olimp {
    public static int solve1(int n){
        return (n / 2) - ((n % 2)^1);
    }

    public static double solve2(int [] arr){
        return (double)Arrays.stream(arr).sum() / (arr.length * 100);
    }

    public static int solve3(int k, int n, int w){
        return (2 * k + k * (w - 1)) * w / 2 - n;
    }
    public static void main(String[] args) {
        System.out.println(solve3(3,17,4));
    }
}
