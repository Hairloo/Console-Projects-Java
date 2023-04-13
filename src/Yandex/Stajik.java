package Yandex;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Stajik {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(task1(arr));*/
        int arr[]= new int[1000];
        for(int i = -500; i < 499; i++){
            arr[i + 500] = i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Time for task: " + taskFromAndroidInt(new int[]{-2,-1,0,1,2,3}));
        System.out.println("Time for task: " + taskFromAndroidIntEasy(arr));
    }
    public static String task1(int[] arr){

        //[1,4,5,2,3,9,8,11,0] => "0-5,8-9,11"
        //[1,4] => "1,4"
        String result = "";
        ArrayList<String> needArr = new ArrayList<>();
        int right = arr[0];
        int left = arr[0];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i = 1; i < arr.length; i++){
            if(right + 1 == arr[i]){
                right = arr[i];
            }
            else if(right + 1 != arr[i]){
                if(right == left){
                    needArr.add(Integer.toString(right));
                }
                else if(right - left == 1){
                    needArr.add(Integer.toString(left));
                    needArr.add(Integer.toString(right));
                }
                else{
                    needArr.add(left + "-" + right);
                }
                right = arr[i];
                left = arr[i];
            }
        }
        if(right == left){
            needArr.add(Integer.toString(right));
        }
        else if(right - left == 1){
            needArr.add(Integer.toString(left));
            needArr.add(Integer.toString(right));
        }
        else{
            needArr.add(left + "-" + right);
        }
        for(int i = 0; i < needArr.size(); i++){
            if(i != needArr.size() - 1){
                result += needArr.get(i) + ",";
            }
            else{
                result += needArr.get(i);
            }

        }
        return result;
    }

    public static long taskFromAndroidInt(int [] arr){
        Date date = new Date();
        long millis = date.getTime();
        int right = arr.length - 1;
        int left = 0;
        int[] newArr = new int[arr.length];
        int count = arr.length - 1;
        while(right >= left){
            newArr[count] = (int)Math.pow(Math.max(Math.abs(arr[right]), Math.abs(arr[left])), 2);
            count--;
            if(Math.max(Math.abs(arr[right]), Math.abs(arr[left])) == arr[right]){
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println(Arrays.toString(newArr));
        Date date1 = new Date();
        long millis1 = date1.getTime();
        return millis1 - millis;
    }

    public static long taskFromAndroidIntEasy(int [] arr){
        Date date = new Date();
        long millis = date.getTime();
        for(int i = 0; i < arr.length;i++){
            arr[i] = (int)Math.pow(arr[i], 2);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Date date1 = new Date();
        long millis1 = date1.getTime();
        return millis1 - millis;
    }




}
