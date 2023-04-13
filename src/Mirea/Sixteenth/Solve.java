package Mirea.Sixteenth;

import java.math.BigInteger;
import java.util.Scanner;

public class Solve {
    public final static BigInteger MOD = new BigInteger("1000000007");
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("1000").pow(1000000);
        System.out.println(bigInteger.remainder(new BigInteger("10000007")));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        BigInteger sum = new BigInteger("0");
        String strK = Integer.toString(k);
        for(int i = 1; i <= n; i++){
            sum = sum.add(new BigInteger(Integer.toString(i)).pow(k));
        }
        System.out.println(sum.remainder(MOD));
    }

    public void solve(){

    }

//    public long recPower(int val, int p){
//        long s = 1, v = val, c = p;
//        while(c != 0){
//            if(c % 2 == 1){
//                s = (s * v) % MOD;
//            }
//            c >>= 1;
//            v = (v * v) % MOD;
//        }
//        return s % MOD;
//    }

}
