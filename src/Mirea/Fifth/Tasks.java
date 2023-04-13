package Mirea.Fifth;

import java.util.*;
import java.util.regex.Pattern;


public class Tasks {
    public static int count = 0;
    public static HashMap<Integer, Integer>  dividers = new HashMap<>();
    public static int k, s;
    public static int a, b;
    public static List<String> combinations = new ArrayList<>();


    public static List<Integer> results = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println(task11Rec());
        task9();
    }

    public static void task1(){
        int n = sc.nextInt();
        task1Rec(1, 0, n);
    }

    public static void task1Rec(int step, int count, int n){
        for(int i = 0; i < step; i++){
            if(count == n){
                return;
            }
            System.out.print(step + " ");
            count++;
        }
        task1Rec(++step, count, n);
    }

    public static void task2(){
        int n = sc.nextInt();
        task2Rec(1, n);
    }
    public static void task2Rec(int count, int n){
        System.out.print(count + " ");
        if(count != n){
            task2Rec(++count, n);
        }
    }

    public static void task3(){
        int a = sc.nextInt(),b = sc.nextInt();
        if(a < b){
            task2Rec(a, b);
        }
        else{
            task3Rec(a, b);
        }

    }

    public static void task3Rec(int count, int n){
        System.out.print(count + " ");
        if(count != n){
            task3Rec(--count, n);
        }
    }
    public static void task4(){
        k = sc.nextInt();
        s = sc.nextInt();
        for(int i = 1; i < 10; i++){
            task4Rec(1, i);
        }
        System.out.println("Result is: " + count);
        //List<Integer> list = new ArrayList<>();

//        int count2 = 0;
//        for(int i = (int)Math.pow(10, k - 1); i < Math.pow(10, k); i++){
//            if(sumInt(i) == s){
//                //list.add(i);
//                count2++;
//            }
//        }
//        //System.out.println("List ->" + list);
//        System.out.println("Result is: " + count2);

    }
    public static int sumInt(int k){
        String str = Integer.toString(k);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i) - '0';
        }
        return sum;
    }
    public static void task4Rec(int step, int sum){
        if(sum == s && step == k){
            count++;
        }
        if(step + 1 <= k){
            for(int i = 0; i < 10; i++){
                task4Rec(step + 1, sum + i);
            }
        }
    }

    public static void task5(){
        int num = sc.nextInt();
        System.out.println("Sum in number is: " + task5Rec(num));
    }
    public static int task5Rec(int num){
        if(num / 10 == 0){
            return num;
        }
        return num % 10 + task5Rec(num / 10);
    }

    public static void task6(){
        int num = sc.nextInt();
        System.out.println(!task6Rec(num, 2) || num == 2 ? "YES" : "NO");
    }

    public static boolean task6Rec(int num, int div){
        if(div > Math.sqrt(num) + 1){
            return false;
        }
        return num % div == 0 || task6Rec(num, div + 1);
    }

    public static void task7(){
        int num = sc.nextInt();
        task7Rec(num < 0 ? -num : num, 2);
        List<Integer []> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> iterator : dividers.entrySet()){
            list.add(new Integer[]{iterator.getKey(), iterator.getValue()});
        }
        list.sort(Comparator.comparingInt(o -> o[0]));
        System.out.print("Factoring the number " + num + ": " + (num < 0 ? "-1 * " : ""));
        for(Integer [] arr : list){
            System.out.print(arr[0] + "^" + arr[1] + " * ");
        }
        System.out.print("\b\b\b");
    }

    public static void task7Rec(int num, int div){
        if(div > Math.sqrt(num) + 1){
            dividers.merge(num, 1, Integer::sum);
            return;
        }
        if(num % div == 0){
            dividers.merge(div, 1, Integer::sum);
            task7Rec(num / div, 2);
        }
        else{
            task7Rec(num, div + 1);
        }
    }



    public static void task8(){
        String str = sc.nextLine();
        System.out.println(task8Rec(str) ? "YES" : "NO");
    }

    public static boolean task8Rec(String str){
        if(str.length() < 2){
            return true;
        }
        return str.charAt(0) == str.charAt(str.length() - 1) && task8Rec(str.substring(1, str.length() - 1));
    }

    public static void task9(){
        a = sc.nextInt();
        b = sc.nextInt();
        task9Rec("", 0, 0);
        System.out.println("Combinations count: " + combinations.size());
        System.out.println(combinations);
    }
    public static void task9Rec(String str, int countZer, int countOne){
        if(a + b == countOne + countZer){
            combinations.add(str);
            return;
        }
        if((str.length() == 0 || str.charAt(str.length() - 1) == '1') && countZer < a){
            task9Rec(str + "0", countZer + 1, countOne);
        }
        if(countOne < b){
            task9Rec(str + "1", countZer, countOne + 1);
        }
    }


    public static void task10(){
        int num = sc.nextInt();
        task10Rec(num, 0);
    }

    public static void task10Rec(int num, int result){
        if(num / 10 == 0){
            System.out.println(result * 10 + num);
            return;
        }
        task10Rec(num / 10, result * 10 + num % 10);
    }

    public static int task11Rec(){
        if(sc.hasNextLine()){
            String a = sc.nextLine();
            if(!a.isEmpty()){
                int u = Integer.parseInt(a);
                if(u == 0){
                    if(Integer.parseInt(sc.nextLine()) == 0){
                        return 0;
                    }
                }
                return (u == 1 ? 1 : 0) + task11Rec();
            }
            else{
                return 0;
            }
        }
        return 0;
    }


    public static void task12Rec(){
        if (sc.hasNextLine()) {
            int u = Integer.parseInt(sc.nextLine());
            if (u == 0) {
                return;
            }
            if(u % 2 == 1){
                System.out.println(u);
            }
            task12Rec();
        }
    }

    public static void task13Rec(){
        if(sc.hasNextLine()){
            int u = Integer.parseInt(sc.nextLine());
            if(u == 0){
                return;
            }
            System.out.println(u);
            if(sc.hasNextLine()){
                u = Integer.parseInt(sc.nextLine());
                if(u == 0){
                    return;
                }
                task13Rec();
            }
        }
    }


    public static void task14(){
        int num = sc.nextInt();
        task14Rec(num);
    }

    public static void task14Rec(int num){
        if(num / 10 != 0){
            task14Rec(num / 10);
        }
        System.out.print(num % 10 + " ");
    }
    public static void task15(){
        int a = sc.nextInt();
        task15Rec(a);
    }

    public static void task15Rec(int num){
        System.out.print(num % 10 + " ");
        if(num / 10 == 0){
            return;
        }
        task15Rec(num / 10);
    }


    public static int [] task16Rec(int max){
        int u = Integer.parseInt(sc.nextLine());
        if(u == 0){
            return new int[]{max, 0};
        }
        int [] res;
        res = task16Rec(Math.max(max, u));
        if(u == res[0]){
            res[1]++;
        }
        return res;
    }

    public static int task17Rec(){
        int u = Integer.parseInt(sc.nextLine());
        if(u == 0){
            return u;
        }
        int maxPrev = task17Rec();
        return Math.max(maxPrev, u);
    }


}
