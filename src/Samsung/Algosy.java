//package Samsung;
//
//import com.sun.source.tree.Tree;
//
//import java.util.*;
//
//public class Algosy {
//    public static void main(String[] args) {
//        List<Number> arr = new ArrayList<>();
//        arr.add(4);
//        arr.add(87654567876567L);
//        arr.forEach(System.out::println);
//        HashMap<String, String[]> map = new HashMap<>();
//        Scanner sc = new Scanner(System.in);
//        int a = Integer.parseInt(sc.nextLine());
//        for(int i = 0; i < a; i++){
//            String [] arr = sc.nextLine().split(" ");
//            map.put(arr[0], Arrays.copyOfRange(arr, 1, arr.length));
//        }
//        a = Integer.parseInt(sc.nextLine());
//        for(int i = 0; sc.hasNextLine(); i++){
//            String [] arr = sc.nextLine().split(" ");
//            switch (arr[0]) {
//                case "execute":
//                    boolean is = false;
//                    for (int j = 0; j < map.get(arr[1]).length; j++) {
//                        if (map.get(arr[1])[j].equals("X")) {
//                            System.out.println("OK");
//                            is = true;
//                        }
//                    }
//                    if (!is) {
//                        System.out.println("Access denied");
//                    }
//                    break;
//                case "read":
//                    boolean m = false;
//                    for (int j = 0; j < map.get(arr[1]).length; j++) {
//                        if (map.get(arr[1])[j].equals("R")) {
//                            System.out.println("OK");
//                            m = true;
//                        }
//                    }
//                    if (!m) {
//                        System.out.println("Access denied");
//                    }
//                    break;
//                case "write":
//                    boolean l = false;
//                    for (int j = 0; j < map.get(arr[1]).length; j++) {
//                        if (map.get(arr[1])[j].equals("W")) {
//                            System.out.println("OK");
//                            l = true;
//                        }
//                    }
//                    if (!l) {
//                        System.out.println("Access denied");
//                    }
//                    break;
//            }
//
//        }
////        int n = sc.nextInt();
////        ArrayList<Integer> arr = new ArrayList<>();
////        for (int i = 0; i < n; i++){
////            arr.add(sc.nextInt());
////        }
////        System.out.println(new Algosy().isSorted(arr));
//
//
////        Collections.sort(arr, new Comparator<int[]>() {
////            @Override
////            public int compare(int[] o1, int[] o2) {
////                if(o2[1] == o1[1]){
////                    return o1[0] - o2[0];
////                }
////                return o2[1] - o1[1];
////            }
////        });
////        for(int i = 0; i < arr.size(); i++){
////            System.out.println(arr.get(i)[0] + " " + arr.get(i)[1]);
////        }
////
////        HashMap<Character, Character> map = new HashMap(){
////            {put(")", "(");
////            put("]", "[");
////            put("}", "{");}};
////        Stack<Character> stack = new Stack<>();
////        for(int i = 0;i < str.length(); i++){
////            if(isClos(str.charAt(i))){
////                if(map.get(str.charAt(i)) != stack.pop()){
////                    System.out.println("no");
////                    return;
////                }
////            }
////            else{
////                stack.push(str.charAt(i));
////            }
////        }
////        if(str.length() == 0){
////            System.out.println("yes");
////        }
////        String [] str = new Scanner(System.in).nextLine().split(" ");
////        Stack<Long> stack = new Stack<>();
////        for(int i = 0; i < str.length; i++){
////            try{
////                stack.push(Long.parseLong(str[i]));
////            }
////            catch (NumberFormatException e){
////                Long a = 0L;
////                switch (str[i]){
////                    case "-":
////                       a = -stack.pop() + stack.pop();
////                       break;
////                    case "*":
////                        a = stack.pop() * stack.pop();
////                        break;
////                    case "/":
////                        a =  1/stack.pop() * stack.pop();
////                        break;
////                    case "+":
////                        a =  stack.pop() + stack.pop();
////                        break;
////                }
////                stack.push(a);
////            }
////        }
////        System.out.println(stack.pop());
////        Set<String> set = new HashSet<>();
////        Scanner sc = new Scanner(System.in);
////        pointer:
////        while(true){
////            String [] ins = sc.nextLine().split(" ");
////            if(ins.length == 1){
////                break;
////            }
////            switch (ins[0]){
////                case "+":
////                    set.add(ins[1]);
////                    break;
////                case "?":
////                    System.out.println(set.contains(ins[1]) ? "YES" : "NO");
////                    break;
////            }
////        }
//    }
//    static  boolean  isClos(char ch){
//        return new ArrayList<Character>() {{add(')');add(']');add('}');}
//        }.contains(ch);
//    }
//
////    int recur(List<Integer> arr){
////        int count = 1;
////        boolean need = false;
////        for(int i = 0; i < arr.size(); i++){
////            while(i < arr.size() && arr.get(i) == arr.get(i + 1)){
////                count++;
////                i++;
////                need = true;
////            }
////            if (need){
////                break;
////            }
////        }
////        if(count == 1){
////            return 0;
////        }
////    }
//    boolean isSorted(List<Integer> list){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        TreeMap<Integer, Integer> map1 = new TreeMap<>();
//        //map1.p
//        boolean right = true;
//        boolean left = true;
//        for(int i = 1; i < list.size(); i++){
//            if(list.get(i) > list.get(i - 1)){
//                left = false;
//            }
//            if(list.get(i) < list.get(i - 1)){
//                right = false;
//            }
//        }
//        if(!(right || left)){
//            return false;
//        }
//        return true;
//    }
//
//}
