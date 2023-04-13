package Mirea.FIfteenth;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n + 1];
        for(int i = 1; i < n + 1; i++){
            array[i] = 1;
        }
        int sum = (n + 1) * n / 2;
        if(!isPrime(sum)){
            if(sum % 2 == 1 && !isPrime(sum - 2)){
                array[3] = 3;
                sum -= 3;
            }
            for(int i = 2; i < n + 1; i++){
                if(isPrime(i) && isPrime(sum - i)){
                    array[i] = 2;
                    break;
                }
            }
        }
        for(int i = 1; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static boolean isPrime(int n){
        for(int i = 2; i * i < n + 1; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

}
