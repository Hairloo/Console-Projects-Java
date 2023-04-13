package Tests;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Hair {
    static Scanner in = new Scanner(System.in);
//    public static void main(String[] args) {
//        boolean b1 = true, b2 = false;
//        int i1 = 1, i2 = 2;
//        System.out.println((i1 ^ i2) < 4);
//    }

    public static long sumFloat(double n){
        // 0.7874;
        //cout << "Im here" << endl;
        int i = 10;
        long sum = 0;
        while ((n - 0.000000000000000001) > 0) {
            n -= (long)n;
            n *= i;
            sum += (long)n;
        }
        return sum;
    }
    public static long [] sortArray(double[] arr, int n){
        long [] newArr = new long[n];
        for(int i = 0; i < n; i++){
            //cout << arr[i] - int(arr[i]) << endl;
            newArr[i] = sumFloat(arr[i]);
        }
        for(int i = 0; i < n; i++){
            for(int j = 1; j < n; j++){
                long dop2 = Math.max(newArr[j - 1], newArr[j]);
                newArr[j] = Math.min(newArr[j - 1], newArr[j]);
                newArr[j - 1] = dop2;
                double dop = sumFloat(arr[j - 1]) > sumFloat(arr[j]) ? arr[j - 1] : arr[j];
                arr[j] = sumFloat(arr[j - 1]) < sumFloat(arr[j]) ? arr[j - 1] : arr[j];
                arr[j - 1] = dop;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.println(i + 1 + ". " + arr[i] + " ==> " + newArr[i]);
        }
        return newArr;
    }
    public static int task25(){
        System.out.println("Enter length of array: ");
        int n = Integer.parseInt(in.nextLine());
        double [] arr = new double[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter " + (i + 1) + " number: ");
            double d = Double.parseDouble(in.nextLine());
            arr[i] = d;
        }
        //cout << arr[0] << " " << " " << arr[1] << " " << arr[2];
        sortArray(arr, n);

        return 0;
    }
    public static void main(String[] args) throws IOException
    {
        HashSet <String> hashSet = new HashSet<>();
        hashSet.add("Привет");
        System.out.println("Привет");;
    }

    public static void readAndPrintLine() throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true)
        {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        isr.close();
    }

    public static void arrayMap(){

    }
}
