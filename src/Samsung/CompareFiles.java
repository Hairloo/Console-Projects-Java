package Samsung;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CompareFiles {
    public static void main(String[] args) throws FileNotFoundException {
        new CompareFiles().compare(new File("Hi.txt"), new File("Bye.txt"));
    }
    public void compare(File file1, File file2) throws FileNotFoundException {
        int count = 0;
        List<Character> arr1 = new ArrayList<>();
        List<Character> arr2 = new ArrayList<>();
        List<Character> result = new ArrayList<>();
        Scanner sc = new Scanner(file1);
        while(sc.hasNextLine()){
            arr1.addAll(sc.nextLine().chars().mapToObj(c -> (char) c).toList());
        }
        sc = new Scanner(file2);
        while(sc.hasNextLine()){
            arr2.addAll(sc.nextLine().chars().mapToObj(c -> (char) c).toList());
        }
        for(int i = 0; i < Math.min(arr1.size(), arr2.size()); i++){
            if(arr1.get(i) != arr2.get(i)){
                count++;
                result.add(arr1.get(i));
                result.add(arr2.get(i));
            }
        }
        if(result.size() > 50){
            for(int i = 0; i < 20; i++){
                System.out.print(result.get(i) + " ");
            }

        }
        else{
            for(char x : result){
                System.out.print(x + " ");
            }
        }
        System.out.println("\nNumber of difference: " + count);
    }
}
