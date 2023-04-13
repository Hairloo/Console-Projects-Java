package Mirea.Thirteenth;

import java.util.*;

public class Solve {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<ArrayDeque<Integer>> arrayDeques = new ArrayList<>();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            for(int j = 0; j < n; j++){
                deque.add(sc.nextInt());
            }
            arrayDeques.add(deque);
        }
        int sumFirstPlayer = 0;
        int sumSecondPlayer = 0;
        while(true){
            int firstPlayer = maxFromDeques(arrayDeques, true);
            if(firstPlayer == -1){
                break;
            }
            sumFirstPlayer += arrayDeques.get(firstPlayer).pollFirst();
            int secondPlayer = maxFromDeques(arrayDeques, false);
            if(secondPlayer == -1){
                break;
            }
            sumSecondPlayer += arrayDeques.get(secondPlayer).pollLast();
        }
        System.out.println(sumFirstPlayer + " " + sumSecondPlayer);
    }

    public static int maxFromDeques(List<ArrayDeque<Integer>> deques, boolean way){
        int [] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if(way){
            for(int i = 0; i < deques.size(); i++){
                if(deques.get(i).peekFirst() != null && res[0] < deques.get(i).peekFirst()){
                        res[0] = deques.get(i).peekFirst();
                        res[1] = i;
                }
            }
        }
        else{
            for(int i = 0; i < deques.size(); i++){
                if(deques.get(i).peekLast() != null && deques.get(i).peekLast() > res[0]){
                    res[0] = deques.get(i).peekLast();
                    res[1] = i;
                }
            }
        }
        return res[1];
    }
}

class Solution2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        int firstSum = 0;
        List<Integer> mid = new ArrayList<>();
        for(int i = 0; i < t; i++){
            int n = sc.nextInt();
            for(int j = 0; j < n; j++){
                int temp = sc.nextInt();
                sum += temp;
                if(n % 2 == 1 && j == n / 2){
                    mid.add(temp);
                }
                if(j < n / 2){
                    firstSum += temp;
                }
            }
        }
        mid.sort((o1, o2) -> o2 - o1);
        for(int i = 0; i < mid.size(); i+=2){
            firstSum += mid.get(i);
        }
        System.out.println(firstSum + " " + (sum - firstSum));
    }
}
