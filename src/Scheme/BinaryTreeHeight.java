package Scheme;

import java.util.Scanner;

public class BinaryTreeHeight {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        input();
    }
    static void input(){
        System.out.println("Input number of nodes: ");
        int n = sc.nextInt();
        System.out.println("Input root node number: ");
        int rootNum = sc.nextInt() - 1;
        int [][] arr = new int[n][n];
        for (int i = 0; i < n - 1; i++){
            System.out.println("Input another link: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a - 1][b - 1] = 1;
            arr[b - 1][a - 1] = 1;
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Tree height: " + determineHeight(-1, rootNum, arr));
    }
    static int determineHeight(int root, int curr, int[][] arr){
        if(curr == -1){
            return 0;
        }
        int l = -1, r = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[curr][i] == 1 && i != root){
                if(l == -1){
                    l = i;
                }
                else if(r == -1){
                    r = i;
                }
                else {
                    System.out.println("Invalid tree");
                }
            }
        }
        return 1 + Math.max(determineHeight(curr, l, arr), determineHeight(curr, r, arr));
    }
}
