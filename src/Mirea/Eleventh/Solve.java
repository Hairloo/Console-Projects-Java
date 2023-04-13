package Mirea.Eleventh;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        solve();
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        String [] positions = sc.nextLine().split(" ");
        HashSet<String> setDangerPositions = new HashSet<>();
        rookPositions(positions[0], setDangerPositions, positions[2]);
        rookPositions(positions[1], setDangerPositions, positions[2]);
        kingPositions(positions[2], setDangerPositions);
        if(setDangerPositions.contains(positions[3]) && setDangerPositions.containsAll(kingPositions(positions[3]))){
            System.out.println("CHECKMATE");
        }
        else {
            System.out.println("OTHER");
        }
    }

    public static List<String> kingPositions(String position){
        List<String> list = new ArrayList<>();
        for(int i = (position.charAt(1) - '0') - 1; i < (position.charAt(1) - '0') + 2; i++){
            for(int j = 0, c = -1 + position.charAt(0); j < 3; j++, c++){
                if(!(c < 'a' || c > 'h' || i < 1 || i > 8 || position.equals(Character.toString(c) + i))){
                    list.add(Character.toString(c) + i);
                }
            }
        }
        return list;
    }
    public static void kingPositions(String position, HashSet<String> set){
        for(int i = (position.charAt(1) - '0') - 1; i < (position.charAt(1) - '0') + 2; i++){
            for(int j = 0, c = -1 + position.charAt(0); j < 3; j++, c++){
                if(!(c < 'a' || c > 'h' || i < 1 || i > 8 || position.equals(Character.toString(c) + i))){
                    set.add(Character.toString(c) + i);
                }
            }
        }
    }

    public static void rookPositions(String position, HashSet<String> set, String kingPosition){
        List<String> list = new ArrayList<>();
        for(int i = 1; i < 9; i++){
            if((Character.toString(position.charAt(0)) + i).equals(kingPosition) && i < position.charAt(1) - '0'){
                list.clear();
            }
            else if((Character.toString(position.charAt(0)) + i).equals(kingPosition) && i > position.charAt(1) - '0'){
                break;
            }
            if(!(Character.toString(position.charAt(0)) + i).equals(position)){
                list.add(Character.toString(position.charAt(0)) + i);
            }
        }
        set.addAll(list);
        list.clear();
        for(char c = 'a', i = 0; i < 8; c++, i++){
            if((Character.toString(c) + position.charAt(1)).equals(kingPosition) && c < position.charAt(0)){
                list.clear();
            }
            else if((Character.toString(c) + position.charAt(1)).equals(kingPosition) && c > position.charAt(0)){
                break;
            }
            if(!(Character.toString(c) + position.charAt(1)).equals(position)){
                list.add(Character.toString(c) + position.charAt(1));
            }

        }
        set.addAll(list);
    }
}
