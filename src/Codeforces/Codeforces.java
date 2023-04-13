package Codeforces;


import java.util.*;

public class Codeforces {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        jackpot();
    }

    public static long incresArr(int [] n){
        long count = 0;
        long max = 0;
        for(int i = 0; i < n.length; i++){
            max = Math.max(n[i], max);
            count += max - n[i];
        }
        return count;
    }
    public static String encryption(String s){
        StringBuilder a = new StringBuilder();
        StringBuilder str = new StringBuilder(s);
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                if(str.charAt(j) == str.charAt(i)){
                    str.delete(i, j);
                    break;
                }
            }
        }
        return str.toString();
    }

    public static long binaryCoffe(long a, long b){
        int max = 1;
        for(int i = 1; i < b + 1; i++){
            if(Math.pow(2, i) <= a){
                max++;
            }
        }
        int count;
        int [][] arr = new int[max][max];

        return 0;
    }
    public static long agree(int a[], int max, int min){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < a.length; i++){
            if(max >= a[i]){
                arrayList.add(i);
            }
        }
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for(int i = 0;i < arrayList.size(); i++){
            int current = 1;
            while(i != arrayList.size() - 1 && arrayList.get(i) + 1 == arrayList.get(i + 1)){
                current++;
                i++;
            }
            arrayList2.add(current);
        }
        if(arrayList2.isEmpty()){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arrayList2.size(); i++){
            for(int j = 0; j < arrayList2.get(i); j++){
                map.put(j + 1, (map.get(j + 1) == null ? 0 : map.get(j + 1)) + arrayList2.get(i) - j);
            }
        }
        long sum = 0;

        for(int i = min; i < Collections.max(arrayList2) + 1; i++){
            if(map.get(i) != null) {
                sum += map.get(i);
            }
        }
        return sum;
    }
    public static int colors(int [] a){
        if(a.length < 2){
            return 0;
        }
        Arrays.sort(a);
        int sum = 0;
        for(int i = 0; i < a.length / 2; i++){
            sum += a[a.length - i - 1] - a[i];
        }
        return sum;
    }
    public static void longLong(int [] a){
        long sum = 0;
        for(int i = 0; i < a.length; i++){
            sum += Math.abs(a[i]);
        }
        int ways = 0;
        boolean r = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] < 0){
                if(!r){
                    ways++;
                }
                r = true;
            }
            if(a[i] > 0){
                r = false;
            }

        }
        System.out.println(sum + " " + ways);
    }
    public static void sumInBinary(long a){
        System.out.println(sumInBin(a));
    }
    public static long sumInBin(long a){
        if(a == 1){
            return 1;
        }
        double r = Math.pow(2, (long)(Math.log10(a)/Math.log10(2)));
        long l = (long)Math.pow(2, (long)(Math.log10(a)/Math.log10(2) - 1));
        long position = (long)((a - r) / 2);
        return a + sumInBin(l + position);
    }
    public static void comb(){
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0; i < n - 1; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            if(map.get(u) == null){
                List<Integer> list = new ArrayList<>();
                list.add(v);
                map.put(u, list);
            }
            else{
                List<Integer> arr = map.get(u);
                arr.add(v);
                map.put(u, arr);
            }
            if(map.get(v) == null){
                List<Integer> list = new ArrayList<>();
                list.add(u);
                map.put(v, list);
            }
            else{
                List<Integer> arr = map.get(v);
                arr.add(u);
                map.put(v, arr);
            }
        }
        int l = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < l; i++){
            int m = sc.nextInt();
            int k = sc.nextInt();
            list.add(m);
            list.add(k);
        }
        for(int i = 0; i < l*2; i+=2){
            System.out.println(recComb(map, list.get(i), 0) + " " + recComb(map, list.get(i + 1), 0));
        }
    }
    public static long recComb(HashMap<Integer, List<Integer>> map, int start, int from){
        if(map.get(start).size() == 1){
            return 1;
        }
        int sum = 0;
        for(int i = 0; i < map.get(start).size(); i++){
            if(map.get(start).get(i) == from){
                continue;
            }
            sum += recComb(map, map.get(start).get(i), start);
        }
        return sum;
    }

    public static boolean daytona(List<Integer> arr, int target){
        return arr.contains(target);
    }
    public static void alexAndStack(int n){
        List<Long> list = new ArrayList<>();
        list.add(6L);
        list.add(8L);
        list.add(12L);
        for(int i = 2; i < n - 1; i++){
            long last = list.get(list.size() - 1) + 1;
            while(true){
                if((last * 3) % (list.get(i - 2) + list.get(i - 1)) != 0){
                    list.add(last);
                    break;
                }
                last++;
            }
        }
        for(long el : list){
            System.out.print(el + " ");
        }

    }

    public static void arifm(int k, int n, int x){

    }

    public static void reversals(){
        Scanner sc = new Scanner(System.in);
        int times = Integer.parseInt(sc.nextLine());
        for(int y = 0;y < times; y++){
            String nk = sc.nextLine();
            String str = sc.nextLine();
            String [] ls = sc.nextLine().split(" ");
            String [] rs = sc.nextLine().split(" ");
            int l [] = new int[ls.length];
            int r [] = new int[ls.length];
            for(int i = 0; i < ls.length; i++){
                l[i] = Integer.parseInt(ls[i]);
                r[i] = Integer.parseInt(rs[i]);
            }
            int q = Integer.parseInt(sc.nextLine());
            String [] xs = sc.nextLine().split(" ");
            for(int i = 0; i < q; i++){
                int x = Integer.parseInt(xs[i]);
                int in = 0;
                for(int j = 0; j < l.length; j++){
                    if(l[j] <= x && x <= r[j]){
                        in = j;
                    }
                }
                int a = Math.min(x, r[in] + l[in] - x) - 1;
                int b = Math.max(x, r[in] + l[in] - x);
                str = str.substring(0, a)  + new StringBuilder(str.substring(a, b)).reverse() + str.substring(b, str.length());
            }
            System.out.println(str);
        }
    }
    public static long rigged(){
        int n = sc.nextInt() - 1;
        long s1 = sc.nextLong(), e1 = sc.nextLong();
        long retval = 0;
        for(int i = 0; i < n; i++){
            long ans1 = sc.nextLong();
            long ane1 = sc.nextLong();
            if(ans1 < s1 && ane1 >= e1){
                retval = Math.max(retval, ans1 + 1);
            }
            if(ans1 >= s1 && ane1 >= e1){
                return -1;
            }
        }
        return retval;
    }


    public static void pokerJokers(){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++){
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            if(m <= n / k){
                System.out.println(m);
                continue;
            }
            double secMaxVal = (double)(m - n / k) / (k - 1);
            System.out.println((int)((int)secMaxVal != secMaxVal ? n/k - (int)secMaxVal - 1 : n/k - secMaxVal));
        }

    }

    public static void jackpot(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int orient = 0;
        for(int i = 0; i < n; i++){
            int bet = sc.nextInt();
            while(bet % 2 == 0 || bet % 3 == 0){
                if(bet % 2 == 0){
                    bet /= 2;
                    continue;
                }
                bet /= 3;
            }
            if (orient != 0 && bet != orient){
                System.out.println("NO");
                return;
            }
            orient = bet;
        }
        System.out.println("YES");
    }

}


