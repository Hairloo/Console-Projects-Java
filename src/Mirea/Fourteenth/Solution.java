package Mirea.Fourteenth;

import java.sql.SQLOutput;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), p = sc.nextInt(), k = sc.nextInt();
        List<int []> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(new int[]{sc.nextInt(), sc.nextInt(), i + 1});
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0] == o1[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });
        List<int []> list1 = new ArrayList<>();
        for(int i = 0; i < p; i++){
            list1.add(list.get(i));
        }
        Collections.sort(list1, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] == o2[1] ? o1[0] - o2[0] : o2[1] - o1[1];
            }
        });
        List<int []> top = new ArrayList<>();
        List<int []> middle = new ArrayList<>();
        for(int i = 0; i < k; i++){
            top.add(list1.get(i));
        }
        for(int i = k; i < p; i++){
            if(top.get(top.size() - 1)[0] == list1.get(i)[0]){
                middle.add(list1.get(i));
            }
        }
        for(int i = p; i < n; i++){
            if(top.get(top.size() - 1)[0] == list.get(i)[0]){
                middle.add(list.get(i));
            }
        }
        if(p == k){
            for(int [] tops : top){
                System.out.print(tops[2] + " ");
            }
            return;
        }
        int pA = top.get(top.size() - 1)[0];
        int pB2 = top.get(top.size() - 1)[1];
        int index = 1;
        for(int i = top.size() - 1; i > - 1; i--){
            if(pA != top.get(i)[0]){
                pB2 = top.get(i)[1];
                index = top.size() - i;
                break;
            }
            else{
                if(i == 0){
                    pB2 = top.get(i)[1];
                    index = top.size() - i;
                }
                middle.add(top.get(i));
            }
        }
        for(int i = 0; i < top.size() - index; i++){
            System.out.print(top.get(i)[2] + " ");
        }
        Collections.sort(middle, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[1] - o1[1];
            }
        });
        for(int i = 0; i < middle.size(); i++){
            if(index > 0){
                System.out.print(middle.get(i)[2] + " ");
                index--;
            }
            else if(pB2 > middle.get(i)[1] && p > k){
                System.out.print((middle.get(i)[2] + " "));
                k++;
            }
        }
//        for(int [] tops : top){
//            System.out.print(tops[2] + " ");
//        }
//        for(int i = 0; i < p - k; i++){
//            System.out.print(middle.get(i)[2] + " ");
//        }
    }
}
