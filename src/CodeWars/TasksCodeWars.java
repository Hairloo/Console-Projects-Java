package CodeWars;
import java.math.BigInteger;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

class User{

    public int rank, progress;
    public User(){
        rank = -8;
        progress = 0;
    }
    public void incProgress(int activityRank) throws IllegalArgumentException{
        if(activityRank < -8 || activityRank > 8 || activityRank == 0) {
            throw new IllegalArgumentException();
        }
        if(rank - activityRank == 1 || rank == 1 && activityRank == -1){
            progress++;
        }
        else if(rank == activityRank){
            progress += 3;
        }
        else if(activityRank > rank){
            if(activityRank > 0 && rank < 0){
                progress += (activityRank - rank - 1) * (activityRank - rank - 1) * 10;
            }
            else{
                progress += (activityRank - rank) * (activityRank - rank) * 10;
            }
        }
        if(rank < 0 && -rank <= progress / 100){
            rank++;
        }
        rank += progress / 100;
        if(rank >= 8) {
            rank = 8;
            progress = 0;
        }
        progress %= 100;
    }
}



public class TasksCodeWars {

    public static void main(String[] args) {
        ListNode a = new ListNode(2, new ListNode(4, new ListNode(9)));
        ListNode b = new ListNode(5, new ListNode(6, new ListNode(4, new ListNode(9))));
        System.out.println(new TasksCodeWars().isPal(""));
        System.out.println(solution(336, 231));

    }


    public static int fusc(int n) {
        if(n == 1){
            return 1;
        }
        else if(n == 0){
            return 0;
        }
        else{
            if(n % 2 == 1){
                return fusc((n - 1)/2) + fusc((n - 1)/2 + 1);
            }
            else{
                return fusc(n/2);
            }
        }
    }
    public static double tankVol(int h, int d, int vt) {
        double radius = (double)d/2;
        double height = vt / (Math.PI * radius * radius);
        double oa = Math.abs(radius - h);
        double triaBase = Math.sqrt(radius * radius - oa*oa);
        double triaSquare = triaBase * oa;
        double degree = Math.sin(triaBase/radius);

        double sectorSquare = (degree * radius * radius);
        double segmentSquare = sectorSquare - triaSquare;
        System.out.println(height);
        System.out.println(segmentSquare);
        if(radius < h){
            return height * segmentSquare;
        }
        else{
            return height * (Math.PI * radius * radius - segmentSquare);
        }
    }

    public static int sumIntervals(int arr[][]){
        if(arr.length == 0){
            return 0;
        }
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for(int j = 1; j < arr.length; j++){
                if(arr[j - 1][0] > arr[j][0]){
                    int[] needArr = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = needArr;
                }

            }
        }
        list.add(arr[0]);
        int listindex = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i][0] > list.get(listindex)[1] - 1){
                list.add(arr[i]);
                listindex++;
            }
            else{
                if(list.get(listindex)[1] < arr[i][1]){
                    list.set(listindex, new int[]{list.get(listindex)[0], arr[i][1]});
                }
            }
        }
        int finalSum = 0;
        for(int[] a : list){
            finalSum += a[1] - a[0];
        }
        return finalSum;



    }

    public static String orderWeight(String str) {
        if(str.length() == 0){
            return "";
        }
        String[] arr = str.split(" ");
        List<Long> array = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            array.add(Long.parseLong(arr[i]));
        }
        array.sort((o1, o2) -> {
            int sum1 = 0, sum2 = 0;
            for (int i = 0; i < o1.toString().length(); i++) {
                sum1 += (o1.toString().charAt(i) - '0');
            }
            for (int i = 0; i < o2.toString().length(); i++) {
                sum2 += (o2.toString().charAt(i) - '0');
            }
            if(sum1 == sum2){
                int len = Math.min(o1.toString().length(), o2.toString().length());
                for (int i = 0; i < len; i++) {
                    if (o1.toString().charAt(i) < o2.toString().charAt(i)) {
                        return -1;
                    } else if (o1.toString().charAt(i) > o2.toString().charAt(i)) {
                        return 1;
                    }
                }
                return o1.toString().length() > o2.toString().length() ? 1 : -1;
            }
            else{
                return sum1 - sum2;
            }

        });

        String result = "";
        for(int i = 0; i < array.size(); i++){
            result += array.get(i);
            if(i != array.size() - 1){
                result += " ";
            }
        }
        return result;
    }
    public static int solveExpression(String expression ) {
        if(expression.isEmpty()){
            return -1;
        }
        List<Integer> results = new ArrayList<>();
        String first = "";
        String second = "";
        String result = "";
        if(expression.contains("--")){
            expression = expression.replace("--", "+");
        }
        if(!expression.contains("*") && !expression.contains("+")){
            if(expression.charAt(0) == '-'){
                expression = expression.substring(0, expression.indexOf('-', 2)) + "+-" + expression.substring(expression.indexOf('-', 2));
            }
            else{
                expression = expression.replaceFirst("-", "+-");
            }

        }
        if(expression.contains("*")){
            first = expression.split("=")[0].split("\\*")[0];
            second = expression.split("=")[0].split("\\*")[1];
            result = expression.split("=")[1];
            for(int i = 0; i < 10; i++){
                if(Integer.parseInt(first.replaceAll("\\?", Integer.toString(i))) * Integer.parseInt(second.replaceAll("\\?", Integer.toString(i))) == Integer.parseInt(result.replaceAll("\\?", Integer.toString(i)))){
                    if(i == 0 && ((expression.contains("-??") || expression.contains("*??") || expression.contains("=??")) || (result.contains("-?") && result.length() > 2) || (second.contains("-?") && second.length() > 2) || (first.contains("-?") && first.length() > 2))){
                        continue;
                    }
                    results.add(i);
                }
            }
        }
        else if(expression.contains("+")){
            first = expression.split("=")[0].split("\\+")[0];
            second = expression.split("=")[0].split("\\+")[1];
            result = expression.split("=")[1];
            for(int i = 0; i < 10; i++){
                if(Integer.parseInt(first.replaceAll("\\?", Integer.toString(i))) + Integer.parseInt(second.replaceAll("\\?", Integer.toString(i))) == Integer.parseInt(result.replaceAll("\\?", Integer.toString(i)))){
                    if(i == 0 && ((expression.contains("-??") || expression.contains("*??") || expression.contains("=??")) || (result.contains("-?") && result.length() > 2) || (second.contains("-?") && second.length() > 2) || (first.contains("-?") && first.length() > 2))){
                        continue;
                    }
                    results.add(i);
                }
            }
        }


        if(results.isEmpty()){
            return -1;
        }
        else if(results.size() > 1){
            for(int i = 0; i < expression.length(); i++){
                if(Character.isDigit(expression.charAt(i)) && results.contains(expression.charAt(i) - '0')){
                    results.remove(results.indexOf(expression.charAt(i) - '0'));
                }
            }
            return results.get(0);
        }
        else{
            return results.get(0);
        }
    }

    public static int[] sortByFrequency(int[] array) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            arr.add(array[i]);
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        List<Integer> newArr = new ArrayList<>(arr.stream().distinct().toList());
        int[] freaq = new int[newArr.size()];
        for(int i = 0; i < newArr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(Objects.equals(newArr.get(i), arr.get(j))){
                    freaq[i]++;
                }
            }
        }
        List<Integer> needArr = new ArrayList<>(arr.stream().sorted(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return freaq[newArr.indexOf(o1)] - freaq[newArr.indexOf(o2)];
            }
        }).toList());

        Collections.reverse(needArr);
        return needArr.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int [][] multiplicationTable(int n){
        int[][] array = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = i + 1, countCol = 0; j <= (i + 1)*n; j += i + 1, countCol++){
                array[i][countCol] = j;
            }
        }
        return array;
    }
    public static String pigIt(String str){
        String result = "";
        String[] array = str.split(" ");
        for(int i = 0; i < array.length; i++){
            if(isWord(array[i])){
                result += array[i].substring(1) + array[i].charAt(0) + "ay";
            }
            else{
                result += array[i];
            }
            if(i != array.length - 1){
                result += " ";
            }
        }
        return result;
    }
    public static boolean isWord(String str){
        for(int i = 0; i < str.length(); i++){
            if(!Character.isAlphabetic(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static String mix(String s1, String s2) {
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        List<String> arr1 = collect(array1);
        List<String> arr2 = collect(array2);
        arr1 = sorting(arr1);
        arr2 = sorting(arr2);
        Map<String, Integer> results = new HashMap<>();
        for(int i = 0; i < arr1.size(); i++){
            if(!arr2.contains(arr1.get(i))){
                if(!isSubstring(arr1.get(i), arr2)){
                    results.put(arr1.get(i), 1);
                }
            }
        }
        for(int i = 0; i < arr2.size(); i++){
            if(arr1.contains(arr2.get(i))){
                results.put(arr2.get(i), 3);
            }
            else if(!isSubstring(arr2.get(i), arr1)){
                results.put(arr2.get(i), 2);
            }
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(results.entrySet());
        Collections.sort(list, (o1, o2) -> {
            if(o1.getKey().length() != o2.getKey().length()){
                return o2.getKey().length() - o1.getKey().length();
            }
            else{
                if(o1.getValue() - o2.getValue() == 0){
                    return o1.getKey().charAt(0) > o2.getKey().charAt(0) ? 1 : -1;
                }
                return o1.getValue() - o2.getValue();
            }
        });
        String result = "";
        if(list.isEmpty()){
            return "";
        }
        else{
            for(Map.Entry<String, Integer> a : list){
                if(a.getValue() != 3){
                    result += a.getValue() + ":" + a.getKey() + "/";
                }
                else{
                    result += "=:" + a.getKey() + "/";
                }
            }
        }
        return result.substring(0, result.length() - 1);
    }
    public static boolean isSubstring(String str, List<String> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).startsWith(str)){
                return true;
            }
        }
        return false;
    }
    public static List<String> collect(char[] array1){
        List<String> arr1 = new ArrayList<>();
        for(int i = 0; i < array1.length; i++){
            if(array1[i] >= 97 && array1[i] <= 122){
                String need = "" + array1[i];

                while(i != array1.length - 1 && array1[i] == array1[i + 1]){
                    need += array1[i];
                    i++;
                }
                if(need.length() > 1){
                    arr1.add(need);
                }
            }
        }
        return arr1;
    }
    public static List<String> sorting(List<String> arr1){
        Collections.sort(arr1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        return arr1;
    }

    public static BigInteger differentiate(String equation, long x) {
        equation = equation.replaceAll("-", "+-");
        String [] arr = equation.split("\\+");
        BigInteger result = BigInteger.ZERO;
        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            BigInteger sum = BigInteger.ZERO;
            boolean isMinus = arr[i].contains("-");
            if(isMinus){
                arr[i] = arr[i].substring(1);
            }
            if(arr[i].contains("x")){
                if(arr[i].equals("x")){
                    sum = BigInteger.ONE;
                }
                else if(arr[i].contains("^")){
                    if(arr[i].charAt(0) == 'x'){
                         sum = BigInteger.valueOf(Integer.parseInt(arr[i].split("\\^")[1])).multiply(BigInteger.valueOf(x).pow(Integer.parseInt(arr[i].split("\\^")[1]) - 1));
                    }
                    else{
                        sum = BigInteger.valueOf(Integer.parseInt(arr[i].split("x")[0])).multiply(BigInteger.valueOf(Integer.parseInt(arr[i].split("\\^")[1])).multiply(BigInteger.valueOf(x).pow(Integer.parseInt(arr[i].split("\\^")[1]) - 1)));
                    }
                }
                else{
                    sum = BigInteger.valueOf(Integer.parseInt(arr[i].split("x")[0]));
                }
            }
            result = result.add(isMinus ? sum.negate() : sum);
        }
        return result;
    }


    public enum Weather{
        THUNDERSTORMS,
        RAINY
    }
    public static int minUmbrellas(Weather ...forecast) {
        int ret = 0;
        int isHome = 0;
        int isOffice = 0;
        for(int i = 0; i < forecast.length; i++){
            if(forecast[i] == Weather.THUNDERSTORMS || forecast[i] == Weather.RAINY){
                if(i % 2 == 0){
                    if(isHome > 0){
                        isHome--;
                    }
                    else {
                        ret++;
                    }
                    isOffice++;
                }
                if(i % 2 == 1){
                    if(isOffice > 0){
                        isOffice--;
                    }
                    else {
                        ret++;
                    }
                    isHome++;
                }
            }
        }
        return ret;
    }





    public static int isInteresting(int num, int [] arr){
        if(num == 98 || num == 99){
            return 1;
        }
        else if(num < 100){
            return 0;
        }
        int returnVal = 0;
        Arrays.sort(arr);
        if(true){
            if(true){
                return 2;
            }
            returnVal = 1;
        }
        if(isFollowingZeros(num) || isFollowingZeros(num + 1) || isFollowingZeros(num + 2)){
            if(isFollowingZeros(num)){
                return 2;
            }
            returnVal = 1;
        }
        if(isInc(num) || isInc(num + 1) || isInc(num + 2)){
            if(isInc(num)){
                return 2;
            }
            returnVal = 1;
        }
        if(isDec(num) || isDec(num + 1) || isDec(num + 2)){
            if(isDec(num)){
                return 2;
            }
            returnVal = 1;
        }
        if(isTheSameNumber(num) || isTheSameNumber(num + 1) || isTheSameNumber(num + 2)){
            if(isTheSameNumber(num)){
                return 2;
            }
            returnVal = 1;
        }
        if(isPal(num) || isPal(num + 1) || isPal(num + 2)){
            if(isPal(num)){
                return 2;
            }
            returnVal = 1;
        }
        return returnVal;
    }

    public static boolean isFollowingZeros(int num){
        String need = Integer.toString(num);
        return need.charAt(0) != '0' && Integer.parseInt(need.substring(1)) == 0;
    }
    public static boolean isTheSameNumber(int num){
        String need = Integer.toString(num);
        for(int i = 1; i < need.length(); i++){
            if(need.charAt(i) != need.charAt(i - 1)){
                return false;
            }
        }
        return true;
    }
    public static boolean isInc(int num){
        String need = Integer.toString(num);
        if(need.contains("90")){
            need = need.substring(0, need.length() - 2);
        }
        for(int i = 1; i < need.length(); i++){
            if((need.charAt(i) - '0') - (need.charAt(i - 1) - '0') != 1){
                return false;
            }
        }
        return true;
    }
    public static  boolean isDec(int num){
        String need = Integer.toString(num);
        for(int i = 1; i < need.length(); i++){
            if((need.charAt(i) - '0') - (need.charAt(i - 1) - '0') != -1){
                return false;
            }
        }
        return true;
    }

    public static boolean isPal(int num){
        String need = Integer.toString(num);
        for(int i = 0; i < need.length() / 2; i++){
            if(need.charAt(i) != need.charAt(need.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static int binSearch(int num, int [] arr){
        int rid = arr.length - 1;
        int left = 0;
        int mid = arr.length / 2;
        while(left <= rid){
            if(num == arr[mid]){
                return left;
            }
            else if(num > arr[mid]){
                left = mid + 1;
            }
            else{
                rid = mid - 1;
            }
            mid = (left + rid) / 2;
        }
        return left;
    }
    public static long cardGame(long n) {
        boolean isEvan = n % 2 == 0;
        long need = n;
        long result = 0;
        n -= n % 2;
        while(n > 0){
                if(n == 4){
                    result += 3;
                    break;
                }
                else{
                    if((n / 2) % 2 == 0){
                        result += 1;
                        n -= 2;
                    }
                    else{
                        result += n / 2;
                        n = (n / 2) - 1;
                    }
                }
        }
        return isEvan ? result : need - result + 1;
    }



    public static void ascii(String[] strings){
        List<int[][]> completed = new ArrayList<>();
        char[][] array = new char[strings.length][strings[0].length()];
        for(int i = 0; i < strings.length; i++){
            array[i] = strings[i].toCharArray();
            for(int j = 0; j < strings[0].length(); j++){
                if(array[i][j] == '+'){
                    System.out.print("+");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    /*public static void runners(int s, int t){

        System.out.println(answer);
    }*/
    public static int solution(int s, int t) {
        int answer = 0;
        int doubleT = t;
        for(int i = 0; i < doubleT; i++, t--){
            if(s >= t){
                if(t % 2 == 0){
                    answer += s;
                }
                else{
                    answer += s * 2;
                    s--;
                }
            }
            else{
                answer += s;
            }
        }
        return answer;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder a1 = new StringBuilder();
        StringBuilder a2 = new StringBuilder();

        ListNode ans = null;
        for(int i = 0; l1 != null; i++){
            a1.append(Integer.toString(l1.val));
            l1 = l1.next;
        }
        for(int i = 0; l2 != null; i++){
            a2.append(Integer.toString(l2.val));
            l2 = l2.next;
        }
        a1.reverse();
        a2.reverse();
        BigInteger a = new BigInteger(a1.toString());
        BigInteger b = new BigInteger(a2.toString());
        String l = a.add(b).toString();
        System.out.println(l);
        for(int i = 0; i < l.length(); i++){
            ans = new ListNode(l.charAt(i) - '0', ans);
        }
        return ans;
    }
    public int lengthOfLongestSubstring(String s) {
        StringBuilder currentString = new StringBuilder();
        int maximum = 0;
        int currentLen = 0;
        for(int i = 0; i < s.length(); i++){
            if(currentString.toString().indexOf(s.charAt(i)) != -1){
                currentLen = currentString.length() - currentString.toString().lastIndexOf(s.charAt(i));
                currentString.delete(0, currentString.toString().lastIndexOf(s.charAt(i)) + 1);
                currentString.append(s.charAt(i));

            }
            else{
                currentString.append(s.charAt(i));
                currentLen++;
                maximum = Math.max(currentLen, maximum);
            }
        }
        System.out.println(currentString);
        return maximum;
    }
    public String longestPalindrome(String s) {
        int maximum = 1;
        for(int i = 0; i < s.length(); i++){

        }
        return "";
    }
    public int isPal(String s){
        for(int i = 0; i < s.length() / 2 ; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1)){
                return -1;
            }
        }
        return s.length();
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int right, left;

        if(nums2[0] < nums1[0]){
            left = binSearch(nums1[0], nums2);
            int len = nums1.length + left;
            if(nums2[nums2.length - 1] < nums1[nums1.length - 1]){
                right = binSearch(nums2[nums2.length - 1], nums1);

            }
            else{
                right = binSearch(nums1[nums1.length - 1], nums2);
                len -= right;
            }

        }
        else{
            left = binSearch(nums2[0], nums1);
            int len = nums2.length + left;
            if(nums2[nums2.length - 1] < nums1[nums1.length - 1]){
                right = binSearch(nums2[nums2.length - 1], nums1);
                len -= right;
                if(len % 2 == 0){
                    //if(len / 2 > )
                }
            }
            else{
                right = binSearch(nums1[nums1.length - 1], nums2);
            }

        }
        return 0;
    }

}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}




