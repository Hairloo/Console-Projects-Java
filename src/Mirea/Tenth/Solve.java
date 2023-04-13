package Mirea.Tenth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < t; i++){
            String string = sc.nextLine();
            Map<String, String> map = Map.of("S", "R", "R", "P", "P", "S");
            HashMap<String, Integer> mapCounts = new HashMap<>();
            for(char c : string.toCharArray()){
                mapCounts.merge(Character.toString(c), 1, Integer::sum);
            }
            int max = 0;
            String maxc = "";
            for(Map.Entry<String, Integer> entry : mapCounts.entrySet()){
                if(max < entry.getValue()){
                    maxc = entry.getKey();
                    max = entry.getValue();
                }
            }
            int n = string.length();
            string = map.get(maxc);
            string = string.repeat(n);
            System.out.println(string);
        }
    }
}
