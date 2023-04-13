package Mirea.Twelth;

import java.util.Arrays;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int [] as = new int[a];
        int [] bs = new int[b];
        for(int i = 0; i < a; i++){
            as[i] = sc.nextInt();
        }
        for(int i = 0; i < b; i++){
            bs[i] = sc.nextInt();
        }
        Arrays.sort(as);
        Arrays.sort(bs);
        int count = 0;
        int left = 0;
        for(int i = 0; i < b; i++){
            int temp = binSearchNearest((int)Math.pow(2, bs[i]), as, left);
            if(temp != -1){
                as[temp] -= (int)Math.pow(2, bs[i]);
                count++;
                left = temp;
            }
            else {
                break;
            }
        }
        System.out.println(count);
    }
    public static int binSearchNearest(int target, int [] nums, int left){
        if(nums[nums.length - 1] < target){
            return -1;
        }
        int retInd = 0;
        int right = nums.length;
        int mid = nums.length / 2;
        while(left <= right){
            if(nums[mid] < target){
                left = mid + 1;
            }
            if(nums[mid] >= target){
                retInd = mid;
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return retInd;
    }
}
