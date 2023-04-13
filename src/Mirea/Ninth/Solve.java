package Mirea.Ninth;

import java.util.Scanner;

public class Solve {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(solve2());
    }

    public static int solve1(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nmax = 0;
        int nmin = Integer.MAX_VALUE;
        int mmin = Integer.MAX_VALUE;
        for(int i = 0;i < n; i++){
            int ns = sc.nextInt();
            nmax = Math.max(nmax, ns);
            nmin = Math.min(nmin, ns);
        }
        for(int i = 0; i < m; i++){
            mmin = Math.min(mmin, sc.nextInt());
        }
        return nmax / 2 >= nmin && nmax < mmin ? nmax : -1;
    }
    public static int solve2(){
        String str = sc.nextLine();
        StringBuilder builder  = new StringBuilder();
        try {
            builder.append(str.charAt(str.length() - 2));
        }
        catch (Exception e){

        }
        builder.append(str.charAt(str.length() - 1));
        return Integer.parseInt(builder.toString()) % 4 == 0 ? 4 : 0;
    }

    public static void solve3(){

    }
}
