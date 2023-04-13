package Tinkoff;

import java.sql.SQLOutput;
import java.util.*;

public class Tinkoff {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        swapPairs();
    }
    public static String task1(int[] l) {
        ArrayList<int[]> arr = new ArrayList<>();

        for(int i = 0; i < l.length; i++){
            for(int j = 2; j < Math.abs(l[i]) + 1; j++){
                if(Math.abs(l[i]) % j == 0 && isSimple(j)){
                    boolean need = true;
                    for(int k = 0; k < arr.size(); k++){
                        if(arr.get(k)[0] == j){
                            arr.get(k)[1] += l[i];
                            need = false;
                        }
                    }
                    if(need){
                        arr.add(new int[]{j, l[i]});
                    }
                }
            }
        }
        for(int i = 0; i < arr.size(); i++){
            for(int j = 1; j < arr.size(); j++){
                if(arr.get(j)[0] < arr.get(j - 1)[0]){

                    Collections.swap(arr, j, j - 1);
                }
            }
        }
        String finalStr = "";
        for(int[] a : arr){
            finalStr += "(" + a[0] + " " + a[1] + ")";
        }
        return finalStr;
    }
    public static boolean isSimple(int num){
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void task2(){
        //Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int numOfQue = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean need = false;
        for(int i = 0; i < str.length(); i++){
            if(arr.contains(str.charAt(i) - '0') && str.charAt(i) != '?'){
                i--;
                arr.clear();
            }
            else{
                if(str.charAt(i) == '?'){
                    numOfQue++;
                }
                else{
                    arr.add(str.charAt(i) - '0');
                }
            }
            if(10 - arr.size() == numOfQue || arr.size() == 10){
                System.out.println("YES");
                need = true;
                break;
            }
        }
        if(!need){
            System.out.println("NO");
        }

    }
    public static void task3(){
        //Scanner sc = new Scanner(System.in);
        String right = "inf";
        String left = "inf";
        String a = sc.nextLine();
        ArrayList<String[]> arr = new ArrayList<>();
        for(int i = 0; i < Integer.parseInt(a); i++){
            String[] newArr = new String[2];
            String need = sc.nextLine();
            newArr[0] = need.split(" ")[0];
            newArr[1] = need.split(" ")[1];
            arr.add(newArr);
        }
        for(int i = 0; i < arr.size(); i++){
            if(right == "inf" && arr.get(i)[1].length() == 1){
                right = Integer.toString(-Integer.parseInt(arr.get(i)[0]) - 1);
            }
            else if(left == "inf" && arr.get(i)[1].length() == 2){
                left = Integer.toString(-Integer.parseInt(arr.get(i)[0]));
            }
            else {
                if (arr.get(i)[1].length() == 2) {
                    left = Integer.toString(Integer.parseInt(left) + Integer.parseInt(arr.get(i)[0]));
                }
                else {
                    right = Integer.toString(Integer.parseInt(left) - Integer.parseInt(arr.get(i)[0]));
                }
            }

        }
        System.out.println(right + left);
    }
    public static void task4(){
        //Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i < len; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] sums = new int[len];
        for(int i = 0; i < len; i++){
            int curSum = 0;
            for(int j = 0; j < len; j++){
                curSum += arr[j] - (arr[j] % arr[i]);
            }
            sums[i] = curSum;
        }
        int maxS = 0;
        for(int i = 0; i < sums.length; i++){
            if(sums[i] > maxS){
                maxS = sums[i];
            }
        }
        System.out.println(maxS);
    }
    public static void task5(){
        //Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), y = sc.nextDouble();
        int count = 0;
        for(int i = 1; x < y; i++){
            x = x * 0.7 + x;
            count = i;
        }
        System.out.println(count);
    }
    public static void task6(){

        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] sums = new int[len];
        for (int i = 0; i < len; i++) {
            int curSum = 0;
            for (int j = 0; j < len; j++) {
                curSum += arr[j] - (arr[j] % arr[i]);
            }
            sums[i] = curSum;
        }
        int maxS = 0;
        for (int i = 0; i < sums.length; i++) {
            if (sums[i] > maxS) {
                maxS = sums[i];
            }
        }
        System.out.println(maxS);
    }
    public static void task7(){
        int[] arr = new int[sc.nextInt() - 1];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        outer:
        for(int i = 0;;i++){
            for(int j = 0; j < arr.length; j++){
                if(i % (j + 2) != arr[j]){
                    continue outer;
                }
            }
            System.out.println(i);
            break;
        }
    }
    public static void task8(){
        String need = sc.nextLine();
        int a = Integer.parseInt(need.split(" ")[0]), b = Integer.parseInt(need.split(" ")[1]);
        String[] arr = new String[a];
        for(int i = 0; i < a; i++){
            arr[i] = sc.nextLine();
        }
        int c = Integer.parseInt(sc.nextLine());
        ArrayList<String> variants = new ArrayList<>();
        rec(variants, 0, 0, b - 1, a - 1, arr, "");
        Collections.sort(variants);
        System.out.println(variants.get(c - 1));

    }
    public static void rec(ArrayList<String> var, int col, int str, int maxCol, int maxStr, String[] arr, String current){
        if(col == maxCol && maxStr == str){
            var.add(current + arr[str].charAt(col));
        }
        else{
            if(col == maxCol){
                rec(var, col, str + 1, maxCol, maxStr, arr, current + arr[str].charAt(col));
            }
            else if(str == maxStr){
                rec(var, col + 1, str, maxCol, maxStr, arr, current + arr[str].charAt(col));
            }
            else{
                rec(var, col, str + 1, maxCol, maxStr, arr, current + arr[str].charAt(col));
                rec(var, col + 1, str, maxCol, maxStr, arr, current + arr[str].charAt(col));
            }
        }
    }

    public static void mobile(){
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        if(d > b){
            System.out.println(a + (d - b) * c);
        }
        else {
            System.out.println(a);
        }
    }

    public static void rulet(){
        int a = sc.nextInt();
        double n = Math.log(a) / Math.log(2);
        if(n != (int)n){
            System.out.println((int)n + 1);
        }
        else {
            System.out.println((int)n);
        }
    }

    public static void paperWithNums(){
        int n = sc.nextInt(), k = sc.nextInt();
        long sum = 0;
        Queue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                int index1 = -1;
                int index2 = -1;
                for(int i = 0; i < o1.length(); i++){
                    if(o1.charAt(i) != '9'){
                        index1 = i;
                        break;
                    }
                }
                for(int i = 0; i < o2.length(); i++){
                    if(o2.charAt(i) != '9'){
                        index2 = i;
                        break;
                    }
                }
                if(index1 == -1){
                    return 1;
                }
                else if(index2 == -1){
                    return -1;
                }
                return (int)(((9 - (o2.charAt(index2) - '0')) * Math.pow(10, o2.length() - index2 - 1)) - ((9 - (o1.charAt(index1) - '0')) * Math.pow(10, o1.length() - index1 - 1)));
            }
        });
        for(int i = 0; i < n; i++){
            queue.add(Integer.toString(sc.nextInt()));
        }
        for(int i = 0; i < k; i++){
            String as = queue.poll();
            int index = -1;
            for(int j = 0; j < as.length(); j++){
                if(as.charAt(j) != '9'){
                    index = j;
                    break;
                }
            }
            if(index != -1){
                sum += (int)(((9 - (as.charAt(index) - '0')) * Math.pow(10, as.length() - index - 1)));
                queue.add(as.substring(0, index) + '9' + as.substring(index + 1));
                index = 0;
            }
            else {
                queue.add(as);
            }
        }
        System.out.println(sum);
    }

    public static void howMuchNewTests(){
        long l = sc.nextLong(), r = sc.nextLong();
        String ls = Long.toString(l), rs = Long.toString(r);
        int raz1 = ls.length(), raz2 = rs.length();
        int maxNumL = 0;
        for(char c : ls.toCharArray()){
            maxNumL = Math.max(maxNumL, c - '0');
        }
        int minNumR = 9;
        for(char c : rs.toCharArray()){
            minNumR = Math.min(minNumR, c - '0');
        }
        int tests = 0;
        if(raz1 != raz2){
            tests = 10 - maxNumL + minNumR;
            tests += (raz2 - raz1 - 1) * 10;
        }
        else {
            tests = (int)(r - l) / (int)Math.pow(10, raz1 - 1) + 1;
        }
        System.out.println(tests);
    }

    public static void swapPairs(){
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int odd = -1, even = -1;
        for(int i = 1; i < arr.length + 1; i++){
            if(i % 2 == 1 && arr[i - 1] % 2 == 0){
                if(odd != -1){
                    System.out.println("-1 -1");
                    return;
                }
                odd = i;
            }
            if(i % 2 == 0 && arr[i - 1] == 1){
                if(even != -1){
                    System.out.println("-1 -1");
                    return;
                }
                even = i;
            }
        }
        if (even != -1 && odd != -1) {
            System.out.println(odd + " " + even);
        }
        else {
            System.out.println("-1 -1");
        }
    }
}



