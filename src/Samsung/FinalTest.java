package Samsung;

import java.util.*;

public class FinalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.nextLine().split(" ");
        List<Integer> intarr = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        ArrayList<int[]> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            intarr.add(Integer.parseInt(arr[i]));
            set.add(Integer.parseInt(arr[i]));
        }

        for(Iterator<Integer> it = set.iterator(); it.hasNext();){
            int a = it.next();
            int count = 0;
            for(int i = 0;i < intarr.size(); i++){
                if(a == intarr.get(i)){
                    count++;
                }
            }
            result.add(new int[]{a, count});
        }
        Collections.sort(result, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o2[1] == o1[1]){
                    return o1[0] - o2[0];
                }
                return o2[1] - o1[1];
            }
        });
        System.out.print(result.get(0)[0]);
        for(int i = 1; i < result.size(); i++){
            System.out.print(" " + result.get(i)[0]);
        }

    }
}
class Chat{
    public String name;
    public List<String> messages;
}
