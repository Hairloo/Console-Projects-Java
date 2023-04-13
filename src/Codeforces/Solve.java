package Codeforces;

import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            if(m <= n / k){
                System.out.println(m);
                continue;
            }
            double secMaxVal = (double)(m - n / k) / (k - 1);
            System.out.println((int)((int)secMaxVal != secMaxVal ? n/k - (int)secMaxVal - 1 : n/k - secMaxVal));
        }
    }
}
