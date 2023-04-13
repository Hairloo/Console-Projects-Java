package LeetCode;

import com.sun.source.tree.Tree;
import org.w3c.dom.ls.LSOutput;

import javax.print.attribute.IntegerSyntax;
import javax.print.attribute.TextSyntax;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InvalidObjectException;
import java.math.BigInteger;
import java.nio.channels.InterruptedByTimeoutException;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCodeTasks {
    char[][] board;
    private int [] nums;
    public int count = 0;
    Set<List<Integer>> needSet = new HashSet<>();
    List<List<Integer>> list = new ArrayList<>();
    public List<String> resList = new ArrayList<>();
    private static int minVal = Integer.MIN_VALUE;
    private static List<Integer> bst = new ArrayList<>();
    public static void main(String[] args) {
        //System.out.println(new LeetCodeTasks().minExtraChar("sayhelloworld", new String[]{"hello","world"}));
        //System.out.println(new LeetCodeTasks().divide(Integer.MIN_VALUE, -1));
        //System.out.println(new LeetCodeTasks().distributeCandies(1000, 1000));
        //System.out.println(new LeetCodeTasks().stringCount(5));
        //System.out.println(new LeetCodeTasks().minimumRecolors("WBWBBBW", 2));
        //System.out.println(new LeetCodeTasks().maxArea(new int[]{1,3,2,5,25,24,5}));
        //System.out.println(new LeetCodeTasks().arrayStringsAreEqual(new String[]{"abcde"}, new String[]{"abcde"}));
        //System.out.println(new LeetCodeTasks().countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
        //System.out.println(new LeetCodeTasks().swapPairs(new ListNode(0)));
//        //System.out.println(new LeetCodeTasks().minTimeToVisitAllPoints(new int[][]{
//                new int[]{3,2},
//                new int[]{-2,2},
//        }));
        //System.out.println(new LeetCodeTasks().largestGoodInteger("42352338"));
        //System.out.println(new LeetCodeTasks().numberOfMatches(14));
        //System.out.println(new LeetCodeTasks().totalMoney(4));
        //System.out.println(new LeetCodeTasks().countPrimes(5000000));
        //System.out.println(Arrays.toString(new LeetCodeTasks().closestPrimes(11, 13)));
        //System.out.println(new LeetCodeTasks().findPrimePairs(1000000));
        //System.out.println(new LeetCodeTasks().largestOddNumber("52"));
//        //System.out.println(new LeetCodeTasks().diagonalPrime(new int[][]{
//                new int[]{1,2,3},
//                new int[]{5,17,7},
//                new int[]{9,11,10}
//        }));
        //System.out.println(threeSum2(new int[]{0,0,0,0}));
        //System.out.println(Arrays.toString(new LeetCodeTasks().twoSum2(new int[]{2,3,4}, 6)));
        //System.out.println(new LeetCodeTasks().findTargetSumWays(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,}, 3));
        //System.out.println(new LeetCodeTasks().permute(new int[]{1,2,3}));
        //System.out.println(new LeetCodeTasks().combinationSum2(new int[]{2,5,2,1,2}, 5));
//        System.out.println(new LeetCodeTasks().exist(new char[][]{
//                new char[]{'A', 'A', 'A', 'A', 'A', 'A'},
//                new char[]{'A', 'A', 'A', 'A', 'A', 'A'},
//                new char[]{'A', 'A', 'A', 'A', 'A', 'A'},
//                new char[]{'A', 'A', 'A', 'A', 'A', 'A'},
//                new char[]{'A', 'A', 'A', 'A', 'A', 'B'},
//                new char[]{'A', 'A', 'A', 'A', 'B', 'A'},
//        }, "AAAAAAAAAAAAABB"));
//        System.out.println(new LeetCodeTasks().exist(new char[][]{
//                new char[]{'A', 'B', 'E'},
//                new char[]{'B', 'C', 'D'},}, "ABCDEB"));
        //new LeetCodeTasks().partition("abc");
        //System.out.println(new LeetCodeTasks().evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
        //System.out.println(Arrays.toString(new LeetCodeTasks().dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
        //new LeetCodeTasks().addTwoNumbers(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))), new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))));
        //System.out.println(new LeetCodeTasks().findDuplicate(new int[]{1,2,1,3,4}));
//        System.out.println(new LeetCodeTasks().searchMatrix(new int[][]{
//                new int[]{1}
//
//        }, 3));
        //System.out.println(new LeetCodeTasks().minEatingSpeed(new int[]{805306368,805306368,805306368}, 1000000000));
//        Node node = new Node(7);
//        Node node1 = new Node(13);
//        Node node2 = new Node(11);
//        Node node3 = new Node(10);
//        Node node4 = new Node(1);
//        node1.random = node;
//        node2.random = node4;
//        node3.random = nod
//        System.out.println(new LeetCodeTasks().minFallingPathSum(new int[][]{
//                new int[]{2,1,3},
//                new int[]{6,5,4},
//                new int[]{7,8,9}
//        }));
//        TreeNode node = new LeetCodeTasks().fillTreeWithArray(new Object[]{2,1,3});
//        System.out.println(new LeetCodeTasks().kthSmallest(node, 3));
//        KthLargest kthLargest = new KthLargest(3, new int[]{4, 5, 8, 2});
//        kthLargest.add(3);
//        kthLargest.add(5);
//        kthLargest.add(10);
        //System.out.println(new LeetCodeTasks().findContentChildren(new int[]{1,2}, new int[]{1,2, 3}));
        //[1,2],[3,5],[6,7],[8,10],[12,16]
        //[[-52,31],[-73,-26],[82,97],[-65,-11],[-62,-49],[95,99],[58,95],[-31,49],[66,98],[-63,2],[30,47],[-40,-26]]
//        int arr = new LeetCodeTasks().eraseOverlapIntervals(new int[][]{
//                new int[]{-52,31},
//                new int[]{-73,-26},
//                new int[]{82,97},
//                new int[]{-65,-11},
//                new int[]{-62,-49},
//                new int[]{95,99},
//                new int[]{58,95},
//                new int[]{-31,49},
//                new int[]{66,98},
//                new int[]{-63,2},
//                new int[]{30,47},
//                new int[]{-40,-26},
//        });
//        System.out.println(arr);
        //System.out.println(5 ^ 1);
        //System.out.println(new LeetCodeTasks().checkValidString("(*))"));
        //(1,10),(2,3),(4,5),(6,7),(8,9)
//        Interval interval = new Interval(1, 10);
//        Interval interval1 = new Interval(2, 3);
//        Interval interval3 = new Interval(4, 5);
//        Interval interval2 = new Interval(6, 7);
//        Interval interval4 = new Interval(8, 9);
//        List<Interval> list1 = new ArrayList<>();
//        list1.add(interval);
//        list1.add(interval1);
//        list1.add(interval3);
//        list1.add(interval2);
//        list1.add(interval4);
//        for(int i = 0; i < 100; i++){
//            list1.add(new Interval((int)(Math.random() * 100), (int)(Math.random() * 100)));
//        }
        //System.out.println(list1);
        //System.out.println(new LeetCodeTasks().minMeetingRooms(list1));
        //System.out.println(new LeetCodeTasks().leastInterval(new char[]{'A','C','A', 'B', 'D', 'B'}, 2));
        System.out.println(reverse2(1534236469));

    }
    public static String removeDigit(String number, char digit) {
        String retStr = "";
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == digit && retStr.compareTo(number.substring(0, i) + number.substring(i + 1)) < 0){
                retStr = number.substring(0, i) + number.substring(i + 1);
            }
        }
        return retStr;
    }
    public static void test(String [] words){
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }

    public static void name(boolean a, boolean... arr){
        System.out.println(arr[2]);
    }
    public static int reverse(int x) {
        String a = x < 0 ? Integer.toString(-x) : Integer.toString(x);
        try{
            return x < 0 ? -Integer.parseInt(new StringBuilder(a).reverse().toString()) : Integer.parseInt(new StringBuilder(a).reverse().toString());
        }
        catch (NumberFormatException e){
            return 0;
        }
    }

    public static int reverse2(int x) {
        int result = 0;
        int temp = 0;
        boolean isNegative = x < 0;
        x = x < 0 ? -x : x;
        while (x > 0) {
            temp = temp * 10 + x % 10;
            if (temp / 10 != result) {
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return isNegative ? -result : result;
    }
    public int[] countBits(int n) {
        int [] arr = new int[n + 1];
        for(int i = 0; i < n + 1; i++){
            int count = 0;
            int curr = i;
            while (curr > 0){
                if(curr % 2 == 1){
                    count++;
                }
                curr /= 2;
            }
            arr[i] = count;
        }
        return arr;
    }

    public boolean canJump(int [] arr){
        for(int i = 0; i + arr[i] < arr.length - 1;){
            if(arr[i] == 0){
                return false;
            }
            int maxVal = 0;
            int maxInd = i + 1;
            for(int j = i + 1; j <= i + arr[i];j++){
                if(j + arr[j] > maxVal){
                    maxVal = j + arr[j];
                    maxInd = j;
                }
            }
            i = maxInd;
        }
        return true;
    }
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }
        Arrays.sort(hand);
        for(int i = 0; i < hand.length / groupSize; i++){
            int [] newArr = new int[groupSize];
            int index = 0;
            for(int j = 0; j < hand.length && index < groupSize; j++){
                if(hand[j] >= 0){
                    if(index == 0){
                        newArr[0] = hand[j];
                        hand[j] = -1;
                        index++;
                    }
                    else if(newArr[index - 1] + 1 == hand[j]){
                        newArr[index] = hand[j];
                        hand[j] = -1;
                        index++;
                    }
                }
            }
            if(index != groupSize){
                return false;
            }
        }
        return true;
    }
    public boolean isNStraightHand2(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int el : hand){
            map.merge(el, 1, Integer::sum);
        }
        int groupSizedup = groupSize;
        int min = -1;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(groupSizedup < 0){
                return false;
            }
            if(!map.containsKey(entry.getKey() - 1) && min == -1){
                groupSizedup -= entry.getValue();
                min = entry.getKey();
            }
            else {
                if(!map.containsKey(entry.getKey() - 1) && min != -1 || map.get(entry.getKey() - 1) > entry.getValue()){
                    return false;
                }
                else {
                    groupSizedup += map.get(entry.getKey() - 1) - entry.getValue();
                }
            }
        }
        return true;
    }

    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int completeIndex = -1;
        int [] needModify = new int[]{-1,-1,-1};
        Queue<int []> suitable = new ArrayDeque<>();
        for(int i = 0; i < needModify.length; i++){
            if(target[0] == triplets[i][0]){
                if(similarities(triplets[i], target) > similarities(target, needModify)){
                    needModify = triplets[i];
                }
            }
        }
        return true;
    }

    public int minMeetingRooms(List<Interval> intervals) {
        int count = 0;
        for(int i = 0; i < intervals.size(); i++){
            if(intervals.get(i) != null){
                count++;
                List<Interval> currList = new ArrayList<>();
                currList.add(intervals.get(i));
                outer:
                for(int j = i + 1; j < intervals.size(); j++){
                    if(intervals.get(j) != null) {
                        for (int k = 0; k < currList.size(); k++) {
                            if (!(currList.get(k).start >= intervals.get(j).end || currList.get(k).end <= intervals.get(j).start)){
                                continue outer;
                            }
                        }
                        currList.add(intervals.get(j));
                        intervals.set(j, null);
                    }
                }
            }
        }
        return count;
    }

    public int similarities(int [] arr1, int [] arr2){
        int count = 0;
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == arr2[i]){
                count++;
            }
        }
        return count;
    }

    public List<Integer> partitionLabels(String s) {
        Set<Character> characters = new HashSet<>();
        List<int []> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(characters.add(c)){
                list.add(new int[]{s.indexOf(c), s.lastIndexOf(c)});
            }
        }
        int [][] arr = mergeForPartition(list);
        List<Integer> list1 = new ArrayList<>();
        for(int [] a : arr){
            list1.add(a[1] - a[0] + 1);
        }
        return list1;
    }

    public boolean checkValidString(String s) {
        Stack<Integer> left = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                left.push(i);
            }
            else if(s.charAt(i) == ')'){
                if(!left.isEmpty()){
                    left.pop();
                }
                else if(!star.isEmpty()){
                    star.pop();
                }
                else {
                    return false;
                }
            }
            else {
                star.push(i);
            }
        }
        while(!left.isEmpty()){
            if(star.isEmpty() || left.pop() > star.pop()){
                return false;
            }
        }
        return true;
    }

    public int[][] mergeForPartition(List<int[]> intervals) {
        List<int []> list = new ArrayList<>();
        for(int i = 0; i < intervals.size(); i++){
            int [] curr = intervals.get(i);
            boolean flag = false;
            while (i < intervals.size() && curr[1] >= intervals.get(i)[0]){
                flag = true;
                curr[1] = Math.max(curr[1], intervals.get(i)[1]);
                i++;
            }
            if(flag){
                i--;
            }
            list.add(curr);
        }
        int [][] merge = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            merge[i] = list.get(i);
        }
        return merge;
    }
    public int jump(int [] arr){
        if(arr.length == 1){
            return 0;
        }
        int count = 0;
        for(int i = 0; i + arr[i] < arr.length - 1;count++){
            int maxVal = 0;
            int maxInd = i + 1;
            for(int j = i + 1; j <= i + arr[i];j++){
                if(j + arr[j] > maxVal){
                    maxVal = j + arr[j];
                    maxInd = j;
                }
            }
            i = maxInd;
        }
        return count + 1;
    }
    public ListNode swapPairs2(ListNode head) {
        if(head.next == null){
            return head;
        }
        return rec(head, true);
    }
    public ListNode rec(ListNode list, boolean isTrue){
        if(list.next.next == null){
            if(isTrue){
                ListNode dop = new ListNode(list.next.val, list);
                list.next = list;
                list = dop;
            }
            return list;
        }
        else{
            if(isTrue){
                ListNode dop = new ListNode(list.next.val, list);
            }
        }
        return null;
    }
//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
//        Arrays.sort(candidates);
//        List<List<Integer>> returnList = new ArrayList<>();
//        List<Integer> currentList = new ArrayList<>();
//        int[][] arr = new int[candidates.length][candidates.length];
//        if(candidates[0] <= target){
//            currentList.add(candidates[0]);
//            for(int i = 0; i < candidates.length; i++){
//                arr[0][i] = candidates[i];
//            }
//        }
//
//
//        return returnList;
//    }


    public static List<String> generateParenthesis(int n) {

        List<String> set = new ArrayList<>();
        recursionList(set, n, "(");
        return set;
    }

    public static void recursionList(List<String> list, int orig, String current){
        int left = (int)current.chars().filter(ch -> ch == '(').count();
        int right = (int)current.chars().filter(ch -> ch == ')').count();
        //System.out.println(left + " " + right);
        if(current.length() == orig * 2){
            if(left == right)
                list.add(current);
        }
        else{
            if(left > right){
                recursionList(list, orig, current + ")");
            }
            recursionList(list, orig, current + "(");
        }

    }

    public static void compare(){
        Scanner a = new Scanner(System.in);

        Set<String> set = new HashSet<>(Arrays.asList(a.nextLine().split(",")));
        String [] arr = a.nextLine().split(",");
        for(String l : arr){
            if(set.add(l)){
                System.out.println(l);
            }
        }


    }

    HashMap<Node, Node> mapCopy = new HashMap<>();
    public Node copyRandomList2(Node head) {
        //recForDisconnectNode2(head);
        Node next = head;
        while(next != null){
            mapCopy.put(next, new Node(next.val));
            next = next.next;
        }
        next = head;
        while (next != null){
            mapCopy.get(next).random = mapCopy.get(next.random);
            mapCopy.get(next).next = mapCopy.get(next.next);
            next = next.next;
        }
        return mapCopy.get(head);
    }

    public String tree2str(TreeNode root) {
        if(root.right == null && root.left == null){
            return Integer.toString(root.val);
        }
        else if(root.left != null && root.right != null){
            return root.val + "(" + tree2str(root.left) + ")(" + tree2str(root.right) + ")";
        }
        else if(root.left != null){
            return root.val + "(" + tree2str(root.left) + ")";
        }
        else {
            return root.val + "()(" + tree2str(root.right) + ")";
        }
    }
    public int[][] transpose(int[][] matrix) {
        int [][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix[0].length; i++){
            for (int j = 0; j < matrix.length; j++){
                newMatrix[i][j] = matrix[j][i];
            }
        }
        return newMatrix;
    }

    public int findSpecialInteger(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            while(i < arr.length - 1 && arr[i] == arr[i + 1]){
                count++;
                i++;
            }
            if(arr.length / count > 4){
                return arr[i];
            }
        }
        return 0;
    }

    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < paths.size(); i++){
            map.put(paths.get(i).get(0), paths.get(i).get(1));
        }
        String end = paths.get(0).get(0);
        while(map.get(end) != null){
            end = map.get(end);
        }
        return end;
    }

    public int[][] onesMinusZeros(int[][] grid) {
        int [] onesRows = new int[grid.length];
        int [] onesCol = new int[grid[0].length];
        int [] zerosRows = new int[grid.length];
        int [] zerosCol = new int[grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    onesCol[j]++;
                    onesRows[i]++;
                }
                else {
                    zerosRows[i]++;
                    zerosCol[j]++;
                }
            }
        }
        int [][] diff = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                diff[i][j] = onesRows[i] + onesCol[j] - zerosRows[i] - zerosCol[j];
            }
        }
        return diff;
    }

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return 1 + Math.max(l, r);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int sumMaxDepth = maxDepth(root.right) + maxDepth(root.left);
        int diamForLeft = diameterOfBinaryTree(root.left);
        int diamForRight = diameterOfBinaryTree(root.right);
        return Math.max(sumMaxDepth, Math.max(diamForRight, diamForLeft));
    }

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.abs(l - r) < 2 && isBalanced(root.right) && isBalanced(root.left);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        else if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }

    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for(int i = g.length - 1, j = s.length - 1; i > -1; i--, j--){
            if(s[j] < g[i]){
                break;
            }
            count++;
            s[j] = 0;
        }
        return count;
    }


    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            int n = nodes.size();
            for(int i = 0; i < n; i++){
                TreeNode node = nodes.poll();
                if(i == n - 1){
                    list.add(node.val);
                }
                if(node.left != null){
                    nodes.add(node.left);
                }
                if(node.right != null){
                    nodes.add(node.right);
                }
            }
        }
        return list;
    }

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>((a,b)->(b-a));
        priorityQueue.addAll(Arrays.stream(stones)
                .boxed().collect(Collectors.toCollection(PriorityQueue::new)));
        while (priorityQueue.size() > 1){
            priorityQueue.add(Math.abs(priorityQueue.poll() - priorityQueue.poll()));
        }
        return priorityQueue.isEmpty() ?  0 : priorityQueue.poll();
    }
    public int goodNodes(TreeNode root) {
        return recForGoodNodes(root, root.val);
    }
    public int recForGoodNodes(TreeNode root, int highestRootVal){
        if(root == null){
            return 0;
        }
        TreeNode r = root.right, l = root.left;
        int val = root.val;
        if(highestRootVal <= val){
            return 1 + recForGoodNodes(r, val) + recForGoodNodes(l, val);
        }
        return recForGoodNodes(r, highestRootVal) + recForGoodNodes(l, highestRootVal);
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> queue = new PriorityQueue<>((x, y) -> x[0]*x[0] + x[1]*x[1] - y[0]*y[0] - y[1]*y[1]);
        for(int [] el : points){
            queue.add(el);
        }
        int [][] retArr = new int[k][2];
        for(int i = 0; i < k && i < points.length; i++){
            retArr[i] = queue.poll();
        }
        return retArr;
    }


    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> queue = new PriorityQueue<>((x, y) -> y - x);
        for(int a : nums){
            queue.add(a);
        }
        for(int i = 0; i < k - 1; i++){
            queue.poll();
        }
        return queue.peek();
    }

    public TreeNode fillTreeWithArray(Object [] arr){
        if(arr[0] == null){
            return null;
        }
        List<TreeNode> list = new ArrayList<>();
        list.add(new TreeNode((Integer)arr[0]));
        //System.out.println((int)Math.ceil(Math.log(arr.length) / Math.log(2)));
        for(int i = 1; i < (int)Math.ceil(Math.log(arr.length) / Math.log(2)); i++){
            for(int j = 0; j < Math.pow(2, i) && j + Math.pow(2, i) < arr.length; j += 2){
                if(arr[(int)Math.pow(2, i) + j - 1] != null){
                    TreeNode node = new TreeNode((Integer)arr[(int)Math.pow(2, i) + j - 1]);
                    list.get((int)Math.pow(i - 1, 2) + j / 2).left = node;
                    list.add(node);
                }
                if(arr[(int)Math.pow(2, i) + j] != null){
                    TreeNode node1 = new TreeNode((Integer)arr[(int)Math.pow(2, i) + j]);
                    list.get((int)Math.pow(i - 1, 2) + j / 2).right = node1;
                    list.add(node1);
                }
            }
        }
        return list.get(0);
    }

    public int kthSmallest(TreeNode root, int k) {
        int rightCount = nodesCount(root.right);
        int rootCount = nodesCount(root);
        if(k == rootCount - rightCount){
            return root.val;
        }
        else if(k < rootCount - rightCount){
            return kthSmallest(root.left, k);
        }
        return kthSmallest(root.right, k - (rootCount - rightCount));
    }
    public int nodesCount(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1 + nodesCount(root.right) + nodesCount(root.left);
    }

    public int minFallingPathSum(int[][] matrix) {
        if(matrix.length == 1){
            return matrix[0][0];
        }
        int minSum = Integer.MAX_VALUE;
        for(int col = 1; col < matrix.length - 1; col++){
            int currSum = 0;
            for(int row = 0; row < matrix.length; row++){
                currSum += Math.min(matrix[row][col], Math.min(matrix[row][col + 1], matrix[row][col - 1]));
            }
            minSum = Math.min(currSum, minSum);
        }
        int sumBeg = 0;
        int sumEnd = 0;
        for(int i = 0; i < matrix.length; i++){
            sumBeg += Math.min(matrix[i][0], matrix[i][1]);
            sumEnd += Math.min(matrix[i][matrix.length - 2], matrix[i][matrix.length - 1]);
        }
        minSum = Math.min(minSum, Math.min(sumBeg, sumEnd));
        return minSum;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        if(root == null){
            return lists;
        }
        Queue<TreeNode> nodes = new ArrayDeque<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            List<Integer> levelNodes = new ArrayList<>();
            int n = nodes.size();
            for(int i = 0; i < n; i++){
                TreeNode node = nodes.poll();
                levelNodes.add(node.val);
                if(node.left != null){
                    nodes.add(node.left);
                }
                if(node.right != null){
                    nodes.add(node.right);
                }
            }
            lists.add(levelNodes);
        }
        return lists;
    }


    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null){
            return root == subRoot;
        }
        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(p != null && q != null){
            return p.val == q.val && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }
        return false;
    }

    public TreeNode invertTree(TreeNode root) {
        recFOrInvertTree(root);
        return root;
    }
    public void recFOrInvertTree(TreeNode root){
        if(root == null){
            return;
        }
        invertTree(root.right);
        invertTree(root.left);
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
    }

    public int numSpecial(int[][] mat) {
        int [] col = new int[mat[0].length];
        int [] row = new int[mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                col[j] += mat[i][j];
                row[i] += mat[i][j];
            }
        }
        int count = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(col[j] == 1 && row[i] == 1 && mat[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public void dfs(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        dfs(node.left, list);
        list.add(node.val);
        dfs(node.right, list);
    }
    public void recForDisconnectNode2(Node head){
        if(head == null){
            return;
        }
        mapCopy.put(head, new Node(head.val));
        recForDisconnectNode2(head.next);
        mapCopy.get(head).random = mapCopy.get(head.random);
        mapCopy.get(head).next = mapCopy.get(head.next);
    }
    public Node copyRandomList(Node head) {
        List<Node> list = new ArrayList<>();
        List<Node> copy = new ArrayList<>();
        recForDisconnectNode(head, list, copy);
        int [] indexesRandom = new int[list.size()];
        Arrays.fill(indexesRandom, -1);
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(i).random == list.get(j)){
                    indexesRandom[i] = j;
                }
            }
        }
        //System.out.println(Arrays.toString(indexesRandom));
        Node newHead = new Node(0);
        Node next = newHead;
        for(int i = 0; i < copy.size(); i++){
            next.next = copy.get(i);
            if(indexesRandom[i] == -1){
                next.next.random = null;
            }
            else{
                next.next.random = copy.get(indexesRandom[i]);
            }
            next = next.next;
        }
        return newHead.next;
    }

    public void recForDisconnectNode(Node head, List<Node> list, List<Node> copy){
        if(head == null){
            return;
        }
        Node next = head.next;
        list.add(head);
        copy.add(new Node(head.val));
        recForDisconnectNode(next, list, copy);
    }



    public static ListNode mergeKLists(ListNode[] lists) {
        Map<ListNode, Integer> map = new HashMap<>();
        for(ListNode k : lists){
            if(k != null){
                map.put(k, k.val);
                while(k.next != null){
                    k = k.next;
                    map.put(k, k.val);
                }
            }

        }
        if(map.size() == 0){
            return null;
        }
        for(Map.Entry<ListNode, Integer> k : map.entrySet()){
            k.getKey().next = null;
        }
        List<Map.Entry<ListNode, Integer>> list= new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        ListNode res = list.get(0).getKey();
        res.val = list.get(0).getValue();
        ListNode next = res;
        for(int i = 1; i < list.size(); i++){
            System.out.println(next + " " + next.val);
            next.next = list.get(i).getKey();
            next = next.next;
            next.val = list.get(i).getValue();
        }
        return res;
    }

    public static void backRec(ListNode a){
        System.out.println(a + " " + a.val);
        if(a.next != null)
            backRec(a.next);
    }

    public static boolean isValidBST(TreeNode root) {
        setBSTList(root);
        return isMon(bst);
    }

    public static void setBSTList(TreeNode root){
        if(root != null){
            setBSTList(root.left);
            bst.add(root.val);
            setBSTList(root.right);
            
        }
    }
    public static boolean isMon(List<Integer> list){
        for(int i = 1; i < list.size(); i++){
            if(list.get(i - 1) >= list.get(i)){
                return false;
            }
        }
        return true;
    }
    public static boolean isValidBST2(TreeNode root) {
        if(root == null){
            return true;
        }
        if(!isValidBST2(root.left)){
            return false;
        }
        minVal = root.val;
        if(!isValidBST2(root.right)){
            return false;
        }
        return true;
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        n = countInNode(head) - n - 1;
        ListNode node = head;
        if(n < 0){
            return null;
        }
        while(n != 0){
            node = node.next;
            n--;
        }
        node.next = node.next.next;
        return head;
    }

    public static int countInNode(ListNode node){
        if(node.next != null){
            return countInNode(node.next) + 1;
        }
        return 1;
    }
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int [] result = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int xor = arr[queries[i][0]];
            for(int j = queries[i][0] + 1; j <= queries[i][1]; j++){
                xor ^= arr[j];
            }
            result[i] = xor;
        }
        return result;
    }
    public static String alphabetBoardPath(String target) {
        StringBuilder ret = new StringBuilder();
        byte position = 97;
        byte currentRow = 0;
        for(byte i = 0; i < target.length(); i++){
            byte toPosition = (byte)target.charAt(i);
            byte row = (byte)((toPosition - 97)/5);
            byte column = (byte)(toPosition - 5 * row - position + 5 * currentRow);

            if(row - currentRow < 0){
                for(byte j = 0; j < currentRow - row; j++){
                    ret.append("U");
                }
            }
            if(column < 0){
                for(byte j = 0; j < -column; j++){
                    ret.append("L");
                }
            }

            if(row - currentRow > 0){
                for(byte j = 0; j < row - currentRow; j++){
                    ret.append("D");
                }

            }

            if(column > 0){
                for(byte j = 0; j < column; j++){
                    ret.append("R");
                }
            }


            position = toPosition;
            currentRow = row;
            ret.append("!");
        }
        return ret.toString();
    }


    public static int semiOrderedPermutation(int[] nums) {
        int firstIndex = 0, secondIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                firstIndex = i;
            }
            if(nums[i] == nums.length){
                secondIndex = i;
            }
        }
        return firstIndex < secondIndex ? nums.length - secondIndex + firstIndex - 1 : nums.length - secondIndex + firstIndex - 2;
    }
    public static int minimizedStringLength(String s) {
        int maxSum = 0;
        for(int i = 0; i < s.length(); i++){
            int len = 0;
            for(int j = i + 2; j < s.length(); j++){
                if(s.charAt(i + 1) == s.charAt(j)){
                    len++;
                }
            }
            for(int j = i - 1; j >= 0; j--){
                if(s.charAt(i) == s.charAt(j)){
                    len++;
                }
            }
            maxSum = Math.max(maxSum, len);
        }
        return s.length() - maxSum;
    }
    public static int minimizedStringLength2(String s) {
        Set<Character> a = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            a.add(s.charAt(i));
        }
        return a.size();
    }

    public static long matrixSumQueries(int n, int[][] queries) {
        HashMap<Integer, Boolean> rows = new HashMap<>();
        HashMap<Integer, Boolean> columns = new HashMap<>();
        long ret = 0;
        int row = 0;
        int column = 0;
        for(int i = queries.length - 1; i >= 0; i--){
            if(queries[i][0] == 1){
                if(columns.get(queries[i][1]) == null){
                    ret += (long)(n - row) * queries[i][2];
                    column++;
                    columns.put(queries[i][1], true);
                }

            }
            else{
                if(rows.get(queries[i][1]) == null){
                    ret += (long)(n - column) * queries[i][2];
                    row++;
                    rows.put(queries[i][1], true);
                }
            }
        }
        return ret;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        return Arrays.binarySearch(matrix[searchNearestIndex(matrix, target)], target) > - 1;
    }

    public int searchNearestIndex(int [][] nums, int target){
        int l = 0, r = nums.length - 1, m = nums.length / 2, retInd = -1;
        while (l <= r){
            if(nums[m][0] == target){
                return m;
            }
            else if(nums[m][0] > target){
                r = m - 1;
            }
            else {
                l = m + 1;
            }
            m = (r + l) / 2;
        }
        return m == nums.length || nums[m][0] > target ? m - 1 : m;
    }

    public int  minEatingSpeed(int[] piles, int h) {
        int r = 0;
        int l = 1;
        for(int i = 0; i < piles.length; i++){
            r = Math.max(piles[i], r);
        }
        int m = (l + r) / 2;
        while(l <= r){
            long curH = 0;
            for(int i = 0; i < piles.length; i++){
                curH += piles[i] <= m ? 1 : (int)Math.ceil((double)piles[i] / m);
            }
            if(curH <= h){
                r = m - 1;
            }
            else {
                l = m + 1;
            }
            m = (l + r) / 2;
        }
        return l;
    }


    public boolean isValidSudoku(char[][] board) {
        this.board = board;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(!isValidSquare(i, j)){
                    return false;
                }
            }
        }
        Map<Byte, Boolean> map = new HashMap<>();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(Character.isDigit(board[i][j])){
                    if(map.get((byte)(board[i][j] - '0')) == null){
                        map.put((byte)(board[i][j] - '0'), true);
                        continue;
                    }
                    return false;
                }
            }
            map.clear();
        }
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(Character.isDigit(board[j][i])){
                    if(map.get((byte)(board[j][i] - '0')) == null){
                        map.put((byte)(board[j][i] - '0'), true);
                        continue;
                    }
                    return false;
                }
            }
            map.clear();
        }
        return true;
    }

    public boolean isValidSquare(int x, int y){
        Map<Byte, Boolean> map = new HashMap<>();
        for(int i = x * 3; i < (x + 1) * 3; i++){
            for(int j = y * 3; j < (y + 1) * 3; j++){
                if(Character.isDigit(board[i][j])){
                    if(map.get((byte)(board[i][j] - '0')) == null){
                        map.put((byte)(board[i][j] - '0'), true);
                        continue;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];
        for(int i = 1; i < nums.length; i++){
            current = nums[i] + current > nums[i] ? nums[i] + current : nums[i];
            max = current > max ? current : max;
        }
        return max;
    }

    public String longestPalindrome(String s) {
        String longest = s.charAt(0) + "";
        outer:
        for(int i = 0; i < s.length(); i++){
            for(int j = s.length() - 1; j > i; j--){
                if(s.charAt(j) == s.charAt(i)){
                    if(j - i + 1 <= longest.length()){
                        continue outer;
                    }
                    if(isPalindrome(s.substring(i, j + 1))){
                        longest = s.substring(i, j + 1);
                    }

                }
            }
        }
        return longest;
    }
    public boolean isPalindrome(String str){
        return new StringBuilder(str).reverse().toString().equals(str);
    }
    public int minFlips(int a, int b, int c) {
        StringBuilder a1 = new StringBuilder(Integer.toBinaryString(a));
        StringBuilder b1 = new StringBuilder(Integer.toBinaryString(b));
        StringBuilder c1 = new StringBuilder(Integer.toBinaryString(c));
        for(int i = a1.length(); i < Math.max(a1.length(), Math.max(b1.length(), c1.length())); i++){
            a1 = new StringBuilder("0" + a1);
        }
        for(int i = b1.length(); i < Math.max(a1.length(), Math.max(b1.length(), c1.length())); i++){
            b1 = new StringBuilder("0" + b1);
        }
        for(int i = c1.length(); i < Math.max(a1.length(), Math.max(b1.length(), c1.length())); i++){
            c1 = new StringBuilder("0" + c1);
        }
        System.out.println(a1 + " " + b1 +  " " + c1);
        int flips = 0;
        for(int i = 0; i < a1.length(); i++){
            if(c1.charAt(i) == '0'){
                if(a1.charAt(i) == '1'){
                    flips++;
                }
                if(b1.charAt(i) == '1'){
                    flips++;
                }
            }
            else{
                if(a1.charAt(i) == '0' && b1.charAt(i) == '0'){
                    flips++;
                }
            }
        }
        return flips;
    }
    public static int[] searchRange2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = right / 2;
        int lAns = -1;

        while(left<=right){
            if(nums[mid] == target){
                if(mid == 0 || nums[mid - 1] < target){
                    lAns = mid;
                }
                right = mid - 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            mid = (right + left) >>> 1;

        }

        left = 0;
        right = nums.length - 1;
        mid = right / 2;
        int rAns = -1;

        while(left<=right){
            if(nums[mid] == target){
                if(mid == nums.length - 1 || nums[mid + 1] > target){
                    rAns = mid;
                }
                left = mid + 1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            mid = (right + left) >>> 1;
        }

        if (lAns == -1 && rAns == -1)
            return new int[] {-1, -1};
        else if (lAns == rAns)
            return new int[] {lAns, rAns};
        return IntStream.rangeClosed(lAns, rAns).toArray();
    }
    public static int myAtoi(String s) {
        StringBuilder a = new StringBuilder("0");
        boolean sign = true;
        int j = 0;
        while(j < s.length() - 1 && s.charAt(j) == ' ' && s.charAt(j) == ' '){
            j++;
        }
        for(int i = j; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                a.append(s.charAt(i));
            }
            else if(a.length() == 1 && (s.charAt(i) == '-' || s.charAt(i) == '+')){
                if(i != j){
                    return 0;
                }
                if(s.charAt(i) == '-'){
                    sign = false;

                }
            }
            else{
                break;
            }
        }
        try{
            return sign ? Integer.parseInt(a.toString()) : -Integer.parseInt(a.toString());
        }
        catch (Exception e){
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

    }
    public static int kthFactor(int n, int k) {
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                if(k == 1){
                    return i;
                }
                k--;
            }
        }
        return -1;
    }
    public static int partitionString(String s) {
        StringBuilder current = new StringBuilder();
        int ans = 1;
        for(int i = 0; i < s.length(); i++){
            if(current.indexOf(s.charAt(i) + "") > -1){
                ans++;
                current.setLength(0);
            }
            current.append(s.charAt(i));
        }
        return ans;
    }
    public static int partitionString2(String s) {
        HashSet<Character> map = new HashSet<>();
        char [] str = s.toCharArray();
        int ans = 1;
        for(int i = 0; i < str.length; i++){
            if(map.contains(str[i])){
                ans++;
                map.clear();
            }
            map.add(str[i]);
        }
        return ans;
    }
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix.length; j++){
                int swap = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = swap;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length / 2; j++){
                int swap = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = swap;
            }
        }
    }
    public void setZeroes(int[][] matrix) {
        Set<Short> rows = new HashSet<Short>();
        Set<Short> columns = new HashSet<Short>();
        for(short i = 0; i < matrix.length; i++){
            for(short j =0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    if(rows.isEmpty() ||!rows.contains(i)){
                        rows.add(i);
                    }
                    if(columns.isEmpty() ||!columns.contains(j)){
                        columns.add(j);
                    }

                }
            }
        }
        for(short i = 0; i < matrix.length; i++){
            for(short j = 0; j < matrix[0].length; j++){
                if(rows.contains(i) || columns.contains(j)){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []> list = new ArrayList<>();
        boolean isInsert = false;
        for(int i = 0; i < intervals.length; i++){
            if(isInsert || intervals[i][0] < newInterval[0] && intervals[i][1] < newInterval[0]){
                list.add(intervals[i]);
            }
            else {
                isInsert = true;
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                while(i < intervals.length && intervals[i][1] < newInterval[1]){
                    i++;
                }
                if(newInterval[1] >= intervals[i][0]){
                    newInterval[1] = intervals[i][1];
                }
                else {
                    i--;
                }
                list.add(newInterval);
            }
        }
        if(!isInsert){
            list.add(newInterval);
        }
        int [][] retArr = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            retArr[i] = list.get(i);
        }
        return retArr;
    }

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int []> list = new ArrayList<>();
        for(int i = 0; i < intervals.length; i++){
            int [] curr = intervals[i];
            boolean flag = false;
            while (i < intervals.length && curr[1] >= intervals[i][0]){
                flag = true;
                curr[1] = Math.max(curr[1], intervals[i][1]);
                i++;
            }
            if(flag){
                i--;
            }
            list.add(curr);
        }
        int [][] merge = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            merge[i] = list.get(i);
        }
        return merge;
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        for (int [] arr : intervals){
            System.out.print(Arrays.toString(arr) + " ");
        }
        int count = 0;
        for (int i = 0; i < intervals.length;){
            int [] curr = intervals[i];
            while(++i < intervals.length && intervals[i][0] < curr[1]){
                count++;
            }
        }
        return count;
    }

    public int singleNumber(int[] nums) {
        int mult = 0;
        for(int num : nums){
            mult ^= num;
        }
        return mult;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        Set<String> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        //row i column j
        int i = 0;
        int j = 0;
        byte way = 1;
        while(true){
            if(i > matrix.length - 1 || i < 0 || j < 0 || j > matrix[i].length - 1 || !set.add("row " + i + " column " + j)){
                switch (way) {
                    case 1 -> {
                        j--;
                        if (set.contains("row " + (i + 1) + " column " + j) || i == matrix.length - 1) {
                            return list;
                        }
                        way = 2;
                    }
                    case 2 -> {
                        i--;
                        if (set.contains("row " + i + " column " + (j - 1)) || j == 0) {
                            return list;
                        }
                        way = 3;
                    }
                    case 3 -> {
                        j++;
                        if (set.contains("row " + (i - 1) + " column " + j) || i == 0) {
                            return list;
                        }
                        way = 4;
                    }
                    case 4 -> {
                        i++;
                        if (set.contains("row " + i + " column " + (j + 1)) || j == matrix[i].length - 1) {
                            return list;
                        }
                        way = 1;
                    }
                }
            }
            else {
                list.add(matrix[i][j]);
            }
            switch (way) {
                case 1 -> j++;
                case 2 -> i++;
                case 3 -> j--;
                case 4 -> i--;
            }
        }
    }
    public void gameOfLife(int[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                int sum = 0;
                if(i != board.length - 1){
                    if(j != 0){
                        sum += board[i + 1][j - 1];
                    }
                    if(j != board[i].length - 1){
                        sum += board[i + 1][j + 1];
                    }
                    sum += board[i + 1][j];
                }
                if(i != 0){
                    if(j != 0){
                        sum += board[i - 1][j - 1];
                    }
                    if(j != board[i].length - 1){
                        sum += board[i - 1][j + 1];
                    }
                    sum += board[i - 1][j];
                }
                if(j != 0){
                    sum += board[i][j - 1];
                }
                if(j != board[i].length - 1){
                    sum += board[i][j + 1];
                }

                if((sum < 2 || sum > 3) && board[i][j] == 1){
                    set.add(i + " " + j);
                }
                if(sum == 3 && board[i][j] == 0){
                    set.add(i + " " + j);
                }
            }
        }
        for (int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(set.contains(i + " " + j)){
                    board[i][j] ^= 1;
                }
            }
        }
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int currentSum = nums[0];
        int minLen = Integer.MAX_VALUE;
        int left = 0, right = 0;
        while(right < nums.length){
            while(currentSum >= target){
                if(minLen > right - left + 1){
                    minLen = right - left + 1;
                }
                currentSum -= nums[left];
                left++;
            }

            if(currentSum < target){
                if(right == nums.length - 1){
                    break;
                }
                currentSum += nums[right + 1];
                right++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            if(tmap.get(t.charAt(i)) != null){
                tmap.put(t.charAt(i), tmap.get(t.charAt(i)) + 1);
            }
            else{
                tmap.put(t.charAt(i), 1);
            }
        }
        int minStringLen = Integer.MAX_VALUE;
        String minString = "";
        int right = 0;
        int left = 0;
        StringBuilder current = new StringBuilder(s.charAt(0) + "");
        smap.put(s.charAt(0), 1);
        while(right < s.length()){
            boolean flag = true;
            for (Map.Entry<Character, Integer> set : tmap.entrySet()) {
                if(smap.get(set.getKey()) == null || set.getValue() > smap.get(set.getKey())){
                    flag = false;
                    break;
                }
            }
            if(flag){

                if(minStringLen > current.length()){
                    minString = current.toString();
                    minStringLen = minString.length();
                }
                current = new StringBuilder(current.substring(1));
                smap.put(s.charAt(left), smap.get(s.charAt(left)) - 1);
                left++;
            }
            else{
                if(right == s.length() - 1){
                    return minString;
                }
                current.append(s.charAt(right + 1));
                right++;
                smap.merge(s.charAt(right), 1, Integer::sum);
            }

        }

        return minString;
    }
    public static List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++){
            map.merge(words[i], 1, Integer::sum);
        }

        outer:
        for(int left = 0, right = words[0].length() * words.length; right <= s.length(); left++, right++){
            String check = s.substring(left, right);
            HashMap<String, Integer> cmap = new HashMap<>();
            for(int i = 0; i < words.length; i++){
                cmap.merge(check.substring(i * words[i].length(), (i + 1)* words[i].length()), 1, Integer::sum);
            }
            for (Map.Entry<String, Integer> set : map.entrySet()) {
                if(cmap.get(set.getKey()) == null || set.getValue() > cmap.get(set.getKey())){
                    continue outer;
                }
            }
            list.add(left);
        }
        return list;
    }
    public static String reverseWords(String s) {
        String [] arr = s.split(" ");
        StringBuilder ret = new StringBuilder();
        for(int i = arr.length - 1; i > -1; i--){
            if(!arr[i].isBlank()){
                ret.append(arr[i]).append(" ");
            }
        }
        return ret.substring(0, ret.length() - 1);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        if(nums.length < 3){
            return list;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                break;
            }
            for(int j = i + 1; j < nums.length; j++){
                int need = -(nums[i] + nums[j]);
                if(map.containsKey(need) && map.get(need) > j){
                    if(set.add(List.of(nums[i], nums[j], -(nums[i] + nums[j])))){
                        list.add(List.of(nums[i], nums[j], -(nums[i] + nums[j])));
                    }
                }
            }
        }
        return list;
    }

    public List<String> letterCombinations(String digits) {
        Map<Integer, List<Character>> map = Map.of(2, List.of('a', 'b', 'c'), 3, List.of('d', 'e', 'f'), 4, List.of('g', 'h', 'i'),
                5, List.of('j', 'k', 'l'), 6, List.of('m', 'n', 'o'), 7, List.of('p', 'q', 'r', 's'), 8, List.of('t', 'u', 'v'),
                9, List.of('w', 'z', 'y', 'z'));

        List<String> list = new ArrayList<>();
        recForLetterComb(digits, 0, list, new StringBuilder(), map);
        return list;
    }

    public void recForLetterComb(String digits, int i, List<String> res, StringBuilder currentString, Map<Integer, List<Character>> map){
        if(currentString.length() == digits.length()){
            res.add(currentString.toString());
            return;
        }
        for(char c : map.get(digits.charAt(i) - '0')){
            currentString.append(c);
            recForLetterComb(digits, i + 1, res, currentString, map);
            currentString.deleteCharAt(currentString.length() - 1);
        }
    }

    public static List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length < 3){
            return new ArrayList<>(set);
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                break;
            }
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum > 0){
                    right--;
                }
                else if(sum < 0){
                    left++;
                }
                else {
                    set.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        recForCombinationSum(candidates, target, 0, 0, new ArrayList<>(), list);
        return list;
    }

    public void recForCombinationSum(int [] candidates, int target, int i, int currentSum, List<Integer> listAdds, List<List<Integer>> retList){
        if(currentSum > target){
            return;
        }
        if(currentSum == target){
            retList.add(new ArrayList<>(listAdds));
        }
        for(int j = i; j < candidates.length; j++){
            listAdds.add(candidates[j]);
            recForCombinationSum(candidates, target, j, currentSum + candidates[j], listAdds, retList);
            listAdds.remove(listAdds.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        recPermutations(nums, new ArrayList<>(), list, new ArrayList<>());
        return list;
    }

    public void recPermutations(int [] nums, List<Integer> indexes, List<List<Integer>> list, List<Integer> currentPermut){
        if(currentPermut.size() == nums.length){
            list.add(new ArrayList<>(currentPermut));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!indexes.contains(i)){
                currentPermut.add(nums[i]);
                indexes.add(i);
                recPermutations(nums, indexes, list, currentPermut);
                currentPermut.remove(currentPermut.size() - 1);
                indexes.remove(indexes.size() - 1);
            }
        }
    }


    public int findTargetSumWays(int[] nums, int target) {
        return recForfindTargetSumWays(nums, 0, target, 0);
    }

    public int recForfindTargetSumWays(int [] nums, int i, int target, int currentSum){
        if(nums.length == i){
            return target == currentSum ? 1 : 0;
        }
        return recForfindTargetSumWays(nums, i + 1, target, currentSum + nums[i]) + recForfindTargetSumWays(nums, i + 1, target, currentSum - nums[i]);
    }

    public int[] twoSum2(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right){
            int sum = numbers[left] + numbers[right];
            if(sum < target){
                left++;
            }
            else if(sum > target){
                right--;
            }
            else {
                return new int[]{left + 1, right + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target - nums[i]) && i != map.get( target - nums[i])){
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        try{
            for(int i = 0; i < Math.max(s.length(), t.length()); i++){
                map1.merge(s.charAt(i), 1, Integer::sum);
                map2.merge(t.charAt(i), 1, Integer::sum);
            }
        }
        catch (Exception e){
            return false;
        }
        for(Map.Entry<Character, Integer> iterator : map1.entrySet()) {
            if (map2.get(iterator.getKey()) == null || !Objects.equals(map2.get(iterator.getKey()), iterator.getValue())) {
                return false;
            }
        }
        return true;
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String str : strs){
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String string = String.valueOf(a);
            if(map.containsKey(string)){
                map.get(string).add(str);
            }
            else{
                map.put(string, new ArrayList<>(Arrays.asList(str)));
            }
        }
        for(Map.Entry<String, List<String>> c : map.entrySet()){
            result.add(c.getValue());
        }
        return result;
    }
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.merge(nums[i], 1, Integer::sum);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        int [] retn = new int[k];
        int count = 1;
        for(Map.Entry<Integer, Integer> entry : list){
            if(list.size() - count < k){
                retn[list.size() - count] = entry.getKey();
                System.out.println(entry.getKey());
            }
            count++;
        }
        return retn;
    }


    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        recForPartition(s, 0, list, new ArrayList<>());
        //System.out.println(isPal("ab", 0, 1));
        System.out.println(list);
        return list;
    }

    public void recForPartition(String s, int i, List<List<String>> list, List<String> currentList){
        if(i >= s.length()){
            list.add(new ArrayList<>(currentList));
            return;
        }
        for(int j = i; j < s.length(); j++){
            if(isPal(s, i, j)){
                currentList.add(s.substring(i, j + 1));
                recForPartition(s, j + 1, list, currentList);
                currentList.remove(currentList.size() - 1);
            }
        }
    }

    public boolean isPal(String str, int start, int end){
        int l = start, r = end;
        while (l < r && str.charAt(l) == str.charAt(r)){
            l++; r--;
        }
        return l >= r && !str.isEmpty();
    }



    public static int[] productExceptSelf(int[] nums) {
        int [] retn = new int[nums.length];
        retn[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            retn[i] = retn[i - 1] * nums[i];
        }
        int right = nums[nums.length - 1];
        retn[retn.length - 1] = retn[retn.length - 2];
        for(int i = retn.length - 2; i > 0 ;i--){
            retn[i] = retn[i - 1] * right;
            right *= nums[i];
        }
        retn[0] = right;
        return retn;

    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int maxCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                int j = 1;
                while(true){
                    if(set.contains(nums[i] + j)){
                        j++;
                    }
                    else{
                        maxCount = Math.max(maxCount, j);
                        break;
                    }
                }
            }
        }
        return maxCount;
    }

    public static int longestConsecutive2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int maxCount = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i] - 1)){
                int j = 1;
                while(true){
                    if(set.contains(nums[i] + j)){
                        j++;
                    }
                    else{
                        maxCount = Math.max(maxCount, j);
                        break;
                    }
                }
            }
        }
        return maxCount;
    }
    public static boolean isPalindrome2(String s) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                builder.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return new String(builder).equals(builder.reverse().toString());
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int current = 0;
        int retVal = 0;
        int sum = 0;
        for(int i = 0; i < gas.length; i++){
            current += gas[i] - cost[i];
            sum += gas[i] - cost[i];
            if(current < 0){
                current = 0;
                retVal = i + 1;
            }
        }   
        return sum < 0 ? -1 : retVal;
    }
    public static int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
    public static String divBinString(String str){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            builder.append(str.charAt(i));
            if(i % 4 == 3 && i != str.length() - 1){
                builder.append(" ");
            }
        }
        return builder.toString();
    }

    public List<List<Integer>> subsets2(int[] nums) {
        Date date = new Date();
        Set<List<Integer>> needSet = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int l = 0;
        while(list.size() < Math.pow(2, nums.length)){
            int temp = list.size();
            for(int i = l; i < list.size(); i++){
                for(int j = 0; j < nums.length; j++){
                    List<Integer> subList = new ArrayList<>();
                    subList.addAll(list.get(i));
                    subList.add(nums[j]);
                    Collections.sort(subList);
                    if(isUniuque(subList) && needSet.add(subList)){
                        list.add(subList);
                    }
                }
            }
            l = temp;
        }
        Date date2 = new Date();
        System.out.println("The first solution worked in " + (date2.getTime() - date.getTime()) + " millis");
        return list;
    }
    public List<List<Integer>> subsets(int[] nums) {
        Date date = new Date();
        this.nums = nums;
        Arrays.sort(this.nums);
        list.add(new ArrayList<>());
        recSub(new ArrayList<>(), 0);
        Date date2 = new Date();
        System.out.println("The second solution worked in " + (date2.getTime() - date.getTime()) + " millis");
        return list;
    }
    public void recSub(List<Integer> currentList, int pointer){
        if (currentList.size() == nums.length){
            return;
        }
        for(int i = pointer; i < nums.length; i++){
            ArrayList<Integer> dup = new ArrayList<>();
            dup.addAll(currentList);
            dup.add(nums[i]);
            list.add(dup);
            recSub(dup, i + 1);
        }
    }
    public static boolean isUniuque(List<Integer> list){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < list.size(); i++){
            set.add(list.get(i));
        }
        return set.size() == list.size();
    }

    public static int [] sortedSquares(int [] arr){
        int right = arr.length - 1;
        int left = 0;
        int[] newArr = new int[arr.length];
        int count = arr.length - 1;
        while(right >= left){
            newArr[count] = (int)Math.pow(Math.max(Math.abs(arr[right]), Math.abs(arr[left])), 2);
            count--;
            if(Math.max(Math.abs(arr[right]), Math.abs(arr[left])) == arr[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return newArr;
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int res;
        for(int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("/")){
                res = stack.pop();
                stack.push(stack.pop() / res);
            }
            else if(tokens[i].equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(tokens[i].equals("-")){
                res = stack.pop();
                stack.push(stack.pop() - res);
            }
            else if(tokens[i].equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

    public int[] dailyTemperatures(int[] temperatures) {
        int [] answer = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0; i < temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                answer[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return answer;
    }

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (head.next != null){
            head = node.next;
            node.next = null;
            list.add(node);
            node = head;
        }
        node = head;
        for(int i = list.size() - 1; i > -1; i--){
            node.next = list.get(i);
            node = node.next;
        }
        return head;
    }

    public void reorderList(ListNode head) {
        if(head == null){
            return;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode next = head;
        while(next != null){
            head = next;
            next = next.next;
            head.next = null;
            list.add(head);
        }
        head = new ListNode();
        recForReorderList(head, list, 0);
        head = head.next;
        System.out.println(head.next);
    }

    public void recForDisconnectListNode(ListNode head, List<ListNode> list){
        if(head == null){
            return;
        }
        ListNode next = head.next;
        head.next = null;
        list.add(head);
        recForDisconnectListNode(next, list);
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int balance = 0;
        ListNode head = new ListNode();
        ListNode next = head;
        int l1Val = 0;
        int l2Val = 0;
        while(l1 != null || l2 != null){
            l1Val = l1 != null ? l1.val : 0;
            l2Val = l2 != null ? l2.val : 0;
            next.next = new ListNode((l1Val + l2Val + balance) % 10);
            next = next.next;
            l1 = l1.next;
            l2 = l2.next;
            balance = (l1Val + l2Val + balance) / 10;
        }
        if(balance != 0){
            next.next = new ListNode(balance);
        }
        System.gc();
        return head.next;
    }
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode first = head;
        ListNode second = head;
        while(second != null){
            if(first.next != null) first = first.next;
            else return false;
            if(second.next != null) second = second.next.next;
            else return false;
            if(second == first) return true;
        }
        return false;
    }

    public int findDuplicate(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return (nums.length - 1) - ((nums.length) / 2 * (nums.length - 1) - sum);
    }

    public void recForReorderList(ListNode head, List<ListNode> list, int i){
        if(i == list.size() / 2){
            if(list.size() % 2 == 1){
                head.next = list.get(i);
            }
            return;
        }
        head.next = list.get(i);
        head.next.next = list.get(list.size() - 1 - i);
        recForReorderList(head.next.next, list, i + 1);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        recSub(nums, new ArrayList<>(), 0, set);
        return new ArrayList<>(set);
    }
    public void recSub(int nums[], List<Integer> currentList, int pointer, Set<List<Integer>> res){
        res.add(new ArrayList<>(currentList));
        if(currentList.size() == nums.length){
            return;
        }
        for(int i = pointer; i < nums.length; i++){
            currentList.add(nums[i]);
            recSub(nums, currentList, i + 1, res);
            currentList.remove(currentList.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        recForCombinationSum2(candidates, target, -1, 0, new ArrayList<>(), list);
        return list;
    }

    public void recForCombinationSum2(int [] candidates, int target, int i, int currentSum, List<Integer> currentAdds, List<List<Integer>> res){
        if(currentSum == target){
            res.add(new ArrayList<>(currentAdds));
        }
        if(currentSum > target || currentAdds.size() >= candidates.length){
            return;
        }
        for(int j = i + 1; j < candidates.length; j++){
            currentAdds.add(candidates[j]);
            recForCombinationSum2(candidates, target, j, currentSum + candidates[j], currentAdds, res);
            currentAdds.remove(currentAdds.size() - 1);
            while (j < candidates.length - 1 && candidates[j] == candidates[j + 1]){
                j++;
            }
        }
    }

    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean [][] visited = new boolean[board.length][board[0].length];
                    visited[i][j] = true;
                    if(recForExist(i, j, board, word, 0, visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean recForExist(int i, int j, char[][] board, String word, int wordIndex, boolean [][] visited){
        if(wordIndex + 1 == word.length() && word.charAt(wordIndex) == board[i][j]){
            return true;
        }
        if(word.charAt(wordIndex) == board[i][j]){
            if(j + 1 < board[0].length && !visited[i][j + 1]){
                visited[i][j + 1] = true;
                if (recForExist(i, j + 1, board, word, wordIndex + 1, visited)) {
                    return true;
                }
                visited[i][j + 1] = false;
            }
            if(j != 0 && !visited[i][j - 1]){
                visited[i][j - 1] = true;
                if(recForExist(i, j - 1, board, word, wordIndex + 1, visited)){
                   return true;
                }
                visited[i][j - 1] = false;
            }

            if(i + 1 < board.length && !visited[i + 1][j]){
                visited[i + 1][j] = true;
                if(recForExist(i + 1, j, board,  word, wordIndex + 1, visited)){
                    return true;
                }
                visited[i + 1][j] = false;
            }
            if(i != 0 && !visited[i - 1][j]){
                visited[i - 1][j] = true;
                if(recForExist(i - 1, j, board, word, wordIndex + 1, visited)){
                    return true;
                }
                visited[i - 1][j] = false;
            }
        }
        return false;
    }

    public int minOperations(int[] nums) {
        Arrays.sort(nums);
        int retMin = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            int indSec = searchRange(nums, nums[i] + nums.length - 1);
            retMin = Math.min(retMin, nums.length - indSec + i - 1);
        }
        return retMin;
    }

    class Pair<K, V extends Number>{
        public K key;
        public V value;
        public Pair(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

    public int leastInterval(char[] tasks, int n) {
        Queue<Pair<Character, Integer>> queue = new PriorityQueue<>((o1, o2) -> o2.value - o1.value);
        Map<Character, Integer> map = new HashMap();
        for (char a : tasks){
            map.merge(a,1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            queue.add(new Pair<>(entry.getKey(), entry.getValue()));
        }
        int idle = 0;
        while(true){
            List<Pair<Character, Integer>> list = new ArrayList<>();
            int queueSize = queue.size();
            for (int i = 0; i < Math.min(n + 1, queueSize); i++){
                list.add(queue.poll());
            }
            if(queueSize < n + 1){
                idle += (n + 1 - queueSize) * (list.get(list.size() - 1).value);
            }
            for (int i = 0; i < list.size(); i++){
                if(list.get(i).value - list.get(list.size() - 1).value > 0){
                    list.get(i).value -= list.get(list.size() - 1).value;
                    queue.add(list.get(i));
                }
            }
            if(queue.isEmpty()){
                idle -= n + 1 - queueSize;
                break;
            }
        }
        System.out.println("idle : " + idle);
        return tasks.length + idle;
    }


    public static int searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = right >>> 1;
        int leftBound = -1;
        boolean flag = false;
        while (left <= right) {
            if (nums[mid] == target) {
                if (mid == 0 || nums[mid - 1] < target) {
                    return mid;
                }
                flag = true;
                right = mid - 1;
            } else if (nums[mid] < target)
                left = mid + 1;
            else if (nums[mid] > target)
                right = mid - 1;
            mid = (right + left) >>> 1;
            if(!flag){
                leftBound = mid;
            }
        }
        return nums[leftBound] <= target || leftBound == 0 ? leftBound : leftBound - 1;
    }

    public int searchNearest(int num[], int target){
        int retInd = -1;
        int right = num.length - 1;
        int left = 0;
        int mid = num.length / 2;
        while(left <= right){
            if(num[mid] == target){
                return mid;
            }
            else if(num[mid] > target){
                right = mid - 1;
            }
            else if(num[mid] < target){
                left = mid + 1;
            }
            mid = (right + left) / 2;
            retInd = mid;
        }
        return num[retInd] < target || retInd == 0 ? retInd : retInd - 1;
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.pop() != map.get(s.charAt(i))){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public int totalMoney(int n) {
        return ((28 * 2) + 7 * (n / 7 - 1)) * (n / 7) / 2 + (((2 * (n / 7 + 1) + (n % 7 - 1)) * (n % 7)) / 2);
    }
    public int countPrimes(int n) {
        boolean dp [] = new boolean[n];
        int count = 0;
        for(int i = 2; i < n;i++){
            for(int j = 2 * i; j < n; j += i){
                dp[j] = true;
            }
            while(i < n - 1 && dp[i + 1]){
                i++;
            }
            count++;
        }
        return count;
    }

    public int[] closestPrimes(int left, int right) {
        boolean [] dp = new boolean[right + 1];
        int minRazn = Integer.MAX_VALUE;
        int firstRet = -1;
        int secondRet = -1;
        int prevPrime = Integer.MIN_VALUE;
        for(int i = 2; i <= right; i++){
            if(i >= left){
                if(minRazn > i - prevPrime){
                    if(prevPrime > 0){
                        minRazn = i - prevPrime;
                    }
                    firstRet = prevPrime;
                    secondRet = i;
                    if(minRazn < 3){
                        break;
                    }
                }
                prevPrime = i;
            }

            for(int j = 2 * i; j <= right; j += i){
                dp[j] = true;
            }
            while(i < right && dp[i + 1]){
                i++;
            }
        }
        return firstRet > 0 ? new int[]{firstRet, secondRet} : new int[]{-1,-1};
    }

    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> list = new ArrayList<>();
        if(n < 4){
            return list;
        }
        List<Integer> primeNumbers = new ArrayList<>();
        if(n % 2 == 1){
            if(isPrime(n - 2)){
                list.add(List.of(2, n - 2));
                return list;
            }
            return list;
        }
        boolean dp[] = new boolean[n];
        dp[0] = true;
        dp[1] = true;
        for(int i = 2; i < n; i++){
            primeNumbers.add(i);
            for(int j = 2 * i; j < n; j += i){
                dp[j] = true;
            }
            while(i < n - 1 && dp[i + 1]){
                i++;
            }
        }
        for(int i = 0; i < primeNumbers.size() && primeNumbers.get(i) <= n / 2; i++){
            if(!dp[n - primeNumbers.get(i)]){
                list.add(List.of(primeNumbers.get(i), n - primeNumbers.get(i)));
            }
        }
        return list;
    }
    public String largestOddNumber(String num) {
        for(int i = num.length() - 1; i > -1; i--) {
            if((num.charAt(i) - '0') % 2 == 1){
                return num.substring(0, i + 1);
            }
        }
        return "";
    }

    public int diagonalPrime(int[][] nums) {
//        int n = 4000002;
//        boolean dp[] = new boolean[n];
//        dp[0] = true;
//        dp[1] = true;
//        for(int i = 2; i < n; i++){
//            for(int j = 2 * i; j < n; j += i){
//                dp[j] = true;
//            }
//            while(i < n - 1 && dp[i + 1]){
//                i++;
//            }
//        }
//        System.out.println(dp[883]);
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(isPrime(nums[i][i])){
                max = Math.max(nums[i][i], max);
            }
            if(isPrime(nums[i][nums.length - 1 - i])){
                max = Math.max(nums[i][nums.length - 1 - i], max);
            }
        }
        return max;
    }



    public boolean isPrime(int n){
        for(int i = 2; i * i < n + 1; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode();
        while(true){
            if(list1 == null && list2 == null){
                break;
            }
            if(list2 == null || list1.val > list2.val){
                recDfs(listNode).next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else{
                recDfs(listNode).next = new ListNode(list2.val);
                list2 = list2.next;
            }
        }
        return listNode.next;
    }
    public ListNode recDfs(ListNode listNode){
        if(listNode.next == null){
            return listNode;
        }
        return recDfs(listNode.next);
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ArrayList<Integer> list = new ArrayList();
        recDfs2(list1, list);
        recDfs2(list2, list);
        Collections.sort(list);
        ListNode listNode = new ListNode();
        for(int a : list){
            listNode.next = new ListNode(a);
        }
        return listNode.next;
    }

    public void recDfs2(ListNode listNode, ArrayList<Integer> list){
        list.add(listNode.val);
        if(listNode.next != null){
            recDfs2(listNode.next, list);
        }
    }

//    public static int search(int [] nums, int target){
//
//    }

    public static int searchNearest2(int[] nums, int target) {
        int left = 0, right = nums.length - 1, middle = nums.length / 2;
        while(left <= right){
            if(nums[middle] < target){
                return middle;
            }
            if(nums[left] <= nums[middle]){
                if(target > nums[middle] || target < nums[left]){
                    left = middle + 1;
                }
                else{
                    right = middle - 1;
                }
            }
            else{
                if(target < nums[middle] || target > nums[right]){
                    right = middle - 1;
                }
                else{
                    left = middle + 1;
                }
            }
            middle = (right + left) / 2;
        }
        return -1;
    }

    public List<Integer> lastVisitedIntegers(List<String> words) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).equals("prev")){
                count++;
                try{
                    result.add(integers.get(integers.size() - count));
                }
                catch (IndexOutOfBoundsException e){
                    result.add(-1);
                }
            }
            else{
                integers.add(Integer.parseInt(words.get(i)));
                count = 0;
            }
        }
        return result;
    }

    public List<String> getWordsInLongestSubsequence(int n, String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int current = groups[0];
        for(int i = 1; i < n; i++){
            if(groups[i] == current){
                groups[i] = -1;
            }
            else{
                current = groups[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(groups[i] != -1){
                result.add(words[i]);
            }
        }
        return result;
    }
    public List<List<Integer>> generate2(int numRows) {
        if(numRows == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list.add(list1);
        for(int j = 0; j < numRows - 1; j++){
            ArrayList<Integer> currentList = new ArrayList<>();
            for(int i = 0; i < j + 2; i++){
                if(i == 0 || i == j + 1){
                    currentList.add(1);
                }
                else {
                    currentList.add(list.get(j).get(i - 1) + list.get(j).get(i));
                }
            }
            list.add(currentList);
        }
        return list;
    }

    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> list = new ArrayList<>();
        pascalsTriangle(numRows, list);
        return list;
    }

    public void pascalsTriangle(int rows, List<List<Integer>> list){
        if(rows == list.size()){
            return;
        }
        ArrayList<Integer> currentList = new ArrayList<>();
        try{
            for(int i = 0; i < list.get(list.size() - 1).size() + 1; i++){
                try{
                    currentList.add(list.get(list.size() - 1).get(i - 1) + list.get(list.size() - 1).get(i));
                }
                catch (IndexOutOfBoundsException e){
                    currentList.add(1);
                }
            }
        }
        catch (IndexOutOfBoundsException e){
            currentList.add(1);
        }

        list.add(currentList);
        pascalsTriangle(rows, list);
    }

    public List<String> getWordsInLongestSubsequence2(int n, String[] words, int[] groups) {
        List<List<String>> lists = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int current = groups[i];
            String currentWord = words[i];
            ArrayList<String> subList = new ArrayList<>();
            int [] subgroups = groups.clone();
            for(int j = i + 1; j < n; j++){
                if(subgroups[j] == current || hamming(currentWord, words[j]) != 1){
                    subgroups[j] = -1;
                }
                else {
                    current = subgroups[j];
                    currentWord = words[j];
                }
            }
            current = subgroups[i];
            currentWord = words[i];
            for(int j = i - 1; j > -1; j--){
                if(subgroups[j] == current || hamming(currentWord, words[j]) != 1){
                    subgroups[j] = -1;
                }
                else {
                    current = subgroups[j];
                    currentWord = words[j];
                }
            }
            for(int j = 0; j < n; j++){
                if(subgroups[j] > -1){
                    subList.add(words[j]);
                }
            }
            if(subList.size() > result.size()){
                result = subList;
                lists.add(subList);
            }
        }
        for(List<String> list1 : lists){
            System.out.println(list1);
        }
        return result;
    }

    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLen = -1;
        for(int i = 0; i < s.length(); i++){
            int lastIndex = s.lastIndexOf(s.charAt(i));
            if(lastIndex - i != 0){
                maxLen = Math.max(lastIndex - i - 1, maxLen);
            }
        }
        return maxLen;
    }
    public int maxLengthBetweenEqualCharacters2(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLen = -1;
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            }
        }
        for(int i = 0; i < s.length(); i++){
            int len = Math.abs(i - map.get(s.charAt(i)));
            if(len != 0){
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }





    private int maxOnTheRange(int [] nums, int start, int end){
        int max = nums[start];
        int index = start;
        for(int i = start; i < end; i++){
            if(nums[i] >= max){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }

    public List<String> getWordsInLongestSubsequence3(int n, String[] words, int[] groups) {
        for(int i = 0; i < n; i++){
            ArrayList<String> curList = new ArrayList<>();
            curList.add(words[i]);
            recLongSubWord(i, words, groups, curList);
        }
        return resList;
    }
    public void recLongSubWord(int pointer, String [] words, int [] groups, ArrayList<String> curSubList){
        for(int i = pointer + 1; i < words.length; i++){
            if(hamming(words[pointer], words[i]) == 1 && groups[i] != groups[pointer]){
                ArrayList<String> list1 = new ArrayList<>(curSubList);
                list1.add(words[i]);
                if(list1.size() > resList.size()){
                    resList = list1;
                }
                recLongSubWord(i, words, groups, list1);
            }
        }
    }
    public int hamming(String a, String b){
        int countRes = 0;
        for(int i = 0; i < Math.min(a.length(), b.length()); i++){
            if(a.charAt(i) != b.charAt(i)){
                countRes++;
            }
        }
        return a.length() != b.length() ? 2 : countRes;
    }

    public boolean winnerOfGame(String colors) {
        int amoves = 0;
        int bmoves = 0;
        for(int i = 0; i < colors.length(); i++){
            int current = 1;
            while(i < colors.length() - 1 && colors.charAt(i) == colors.charAt(i + 1)){
                current++;
                i++;
            }
            if(current > 2){
                if(colors.charAt(i) == 'A'){
                    amoves += current - 2;
                }

                if(colors.charAt(i) == 'B'){
                    bmoves += current - 2;
                }
            }
        }
        return amoves > bmoves;
    }

    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int a : nums){
            map.merge(a, 1, Integer::sum);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > nums.length / 3){
                list.add(entry.getKey());
            }
        }
        return list;
    }
    public List<Integer> majorityElement2(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int current = 1;
            while(i < nums.length - 1 && nums[i] == nums[i + 1]){
                current++;
                i++;
            }
            if(current > nums.length / 3){
                list.add(nums[i]);
            }
        }
        return list;
    }

    public List<Integer> largestValues(TreeNode root) {
        List<TreeNode> listForBFSNodes = new ArrayList<>();
        List<Integer> listForBFSRows = new ArrayList<>();
        listForBFSNodes.add(root);
        listForBFSRows.add(0);
        List<Integer> retList = new ArrayList<>();
        for(int i = 0;i < listForBFSNodes.size(); i++){
            if(listForBFSNodes.get(i) == null){
                continue;
            }
            try {
                retList.set(listForBFSRows.get(i), Math.max(retList.get(listForBFSRows.get(i)), listForBFSNodes.get(i).val));
            }
            catch (Exception e){
                retList.add(listForBFSNodes.get(i).val);
            }
            listForBFSNodes.add(listForBFSNodes.get(i).left);
            listForBFSNodes.add(listForBFSNodes.get(i).right);
            listForBFSRows.add(listForBFSRows.get(i) + 1);
            listForBFSRows.add(listForBFSRows.get(i) + 1);
        }
        return retList;
    }

    public List<Integer> largestValues2(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        List<Integer> retList = new ArrayList<>();
        while(!queue.isEmpty()){
            int currentLevelSize = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < currentLevelSize; i++){
                if(queue.peek().left != null){
                    queue.add(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.add(queue.peek().right);
                }
                max = Math.max(queue.poll().val, max);
            }
            retList.add(max);
        }
        return retList;
    }

    public boolean isPowerOfFour(int n) {
        while(n > 1 && n % 4 == 0){
            n /= 4;
        }
        return n == 1;
    }

    public int integerBreak(int n) {
        if(n == 2){
            return 1;
        }
        int sqn = (int)Math.sqrt(n);
        int product = 1;
        while(n > 0){
            if(n - sqn < 2){
                product *= n;
            }
            else {
                product *= sqn;
            }
            n -= sqn;
        }
        return product;
    }

    public int minimumRecolors(String blocks, int k) {
        if(blocks.length() == k){
            return blocks.length() - (int)blocks.chars().filter(ch -> ch == 'B').count();
        }
        int minRet = Integer.MAX_VALUE;
        int currentB = 0;
        int currentChanges = 0;
        List<Integer> indexes = new ArrayList<>();
        for(int i = 0; i < blocks.length(); i++){
            if(blocks.charAt(i) == 'W'){
                indexes.add(i);
            }
        }
        for(int a : indexes){
            for(int i = a; i < blocks.length(); i++){
                if(currentB == k){
                    if(currentChanges == 0){
                        return 0;
                    }
                    currentB = 0;
                    minRet = Math.min(currentChanges, minRet);
                    currentChanges = 0;
                }
                if(currentB < k && blocks.charAt(i) == 'W'){
                    currentChanges++;
                }
                currentB++;

            }
        }
        return minRet;
    }
    public String convert(String s, int numRows) {
        StringBuilder ret = new StringBuilder();
        if(numRows == 1){
            return s;
        }
        for(int i = 0; i < numRows; i++){
            if(i % (numRows - 1) == 0){
                for(int j = i; j < s.length(); j += 2 * numRows - 2){
                    ret.append(s.charAt(j));
                }
            }
            else{
                for(int j = i, count = 1; j < s.length(); count++, j += count % 2 == 0 ? 2 * numRows - 2 * (i + 1) :  2 * i){
                    ret.append(s.charAt(j));
                }
            }
        }
        return ret.toString();
    }
    public int maxArea(int[] height) {
        int maxArea = 0;
        int right = height.length - 1;
        int left = 0;
        while (left < right){
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[right], height[left]));
            if(height[left] < height[right]){
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        for(int i = 0; i < word1.length; i++){
            builder.append(word1[i]);
        }
        for(int i = 0; i < word2.length; i++){
           builder1.append(word2[i]);
        }
        return builder.toString().contentEquals(builder1);
    }
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < chars.length(); i++){
            map.merge(chars.charAt(i), 1, Integer::sum);
        }
        outer:
        for(int i = 0; i < words.length; i++){
            HashMap<Character, Integer> map1 = new HashMap<>();
            for(int j = 0; j < words[i].length(); j++){
                map1.merge(words[i].charAt(j), 1, Integer::sum);
            }
            for(Map.Entry<Character, Integer> entry : map1.entrySet()){
                if(!map.containsKey(entry.getKey()) || map.get(entry.getKey()) < entry.getValue()){
                    continue outer;
                }
            }
            result += words[i].length();
        }
        return result;
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int seconds = 0;
        for(int i = 0; i < points.length - 1; i++){
            seconds += Math.max(Math.abs(points[i][0] - points[i + 1][0]), Math.abs(points[i][1] - points[i + 1][1]));
        }
        return seconds;
    }

    public String largestGoodInteger(String num) {
        for(int i = 9; i > -1; i--){
            if(num.contains(Integer.toString(i).repeat(3))){
                return Integer.toString(i).repeat(3);
            }
        }
        return "";
    }

    public int numberOfMatches(int n) {
        int matches = 0;
        while (n > 1){
            matches += n % 2 == 0 ? n / 2 : (n - 1) / 2;
            n = n % 2 == 0 ? n / 2 : (n - 1) / 2 + 1;
        }
        return matches;
    }

    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        List<ListNode> list = new ArrayList<>();
        ListNode node = head.next;
        ListNode prevNode = null;
        head.next = null;
        list.add(head);
        while(node != null){
            prevNode = node;
            node = node.next;
            prevNode.next = null;
            list.add(prevNode);
        }
        if(list.size() == 1){
            return list.get(0);
        }
        head = list.get(1);
        head.next = list.get(0);
        head.next.next = rec(3, list);
        return head;
    }
    public ListNode rec(int step, List<ListNode> list){
        if(list.size() <= step){
            return list.size() % 2 == 1 ? list.get(list.size() - 1) : null;
        }
        ListNode node = list.get(step);
        node.next = list.get(step - 1);
        node.next.next = rec(step + 2, list);
        return node;
    }

    public int minExtraChar(String s, String[] dictionary) {
        Arrays.sort(dictionary, (o1, o2) -> o2.length() - o1.length());
        for(int i = 0; i < dictionary.length; i++){
            if(s.contains(dictionary[i])){
                s = s.substring(0, s.indexOf(dictionary[i])) + s.substring(s.indexOf(dictionary[i]) + dictionary[i].length());
            }
        }
        return s.length();
    }

    public int divide(long dividend, long divisor)
    {
        if(divisor == -1 && dividend == Integer.MIN_VALUE){
            return Integer.MAX_VALUE;
        }
        boolean flagSign = dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int res = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            ++res;
        }
        return flagSign ? res : -res;
    }
    public int distributeCandies(int n, int limit) {
        rec13(new ArrayList<>(), n, limit);
        return count;
    }
    public void rec13(List<Integer> list, int n, int limit){
        if(list.size() == 3 && list.get(0) + list.get(1) + list.get(2) == n){
            count++;
        }
        if(list.size() < 3){
            for(int i = 0; i <= limit; i++){
                List<Integer> list1 = new ArrayList<>(list);
                list1.add(i);
                rec13(list1, n, limit);
            }
        }
    }
    public int stringCount(int n) {
        rec12(new StringBuilder());
        int count = 0;
        for(String str : resList){
            if(str.indexOf("e") != str.lastIndexOf("e") && str.indexOf("l") > 0 && str.indexOf("t") > 0){
                count++;
            }
        }
        System.out.println(count);
        return 0;
    }

    public void rec12(StringBuilder str){
        if(str.length() == 5){
            resList.add(str.toString());
        }
        if(str.length() < 5){
            for(int i = 97; i < 123; i++){
                StringBuilder builder = new StringBuilder(str);
                builder.append(Character.toString(i));
                rec12(builder);
            }
        }
    }
    class Solution {
        private final int mod = 1000000007;
        public int stringCount(int n) {
            if (n < 4) return 0;
            long[][][][] dpArr = new long[n + 1][2][3][2];
            for (long[][][] arr3 : dpArr) {
                for (long[][] arr2 : arr3) {
                    for (long[] arr1 : arr2) {
                        Arrays.fill(arr1, -1);
                    }
                }
            }
            return (int) (f(n, 0, 0, 0, 0, dpArr) % mod);
        }
        private long f(int n, int l, int e, int t, int i, long[][][][] dpArr) {
            if (i == n) {
                if (l >= 1 && e >= 2 && t >= 1) return 1;
                return 0;
            }
            if (l > 1){
                l = 1;
            }
            if (e > 2){
                e = 2;
            }
            if (t > 1){
                t = 1;
            }
            if (dpArr[i][l][e][t] != -1) return dpArr[i][l][e][t];
            long ans = 0;
            for (char j = 'a'; j <= 'z'; ++j) {
                if (j == 'l') {
                    ans += f(n, l + 1, e, t, i + 1, dpArr);
                }
                else if (j == 'e') {
                    ans += f(n, l, e + 1, t, i + 1, dpArr);
                }
                else if (j == 't') {
                    ans += f(n, l, e, t + 1, i + 1, dpArr);
                }
                else {
                    ans += f(n, l, e, t, i + 1, dpArr);
                }
            }

            return dpArr[i][l][e][t]=(ans % mod);
        }
    }

//    public int stringCount(int n) {
//        if(n < 4){
//            return 0;
//        }
//
//    }

}

interface NestedInteger {

         // @return true if this NestedInteger holds a single integer, rather than a nested list.
              public boolean isInteger();

              // @return the single integer that this NestedInteger holds, if it holds a single integer
             // Return null if this NestedInteger holds a nested list
              public Integer getInteger();
             // @return the nested list that this NestedInteger holds, if it holds a nested list
             // Return empty list if this NestedInteger holds a single integer
              public List<NestedInteger> getList();
}

class NestedIterator implements Iterator<Integer> {
    private List<NestedInteger> nestedList;
    private int count = 0;
    private List<Integer> integerList = new ArrayList<>();
    public NestedIterator(List<NestedInteger> nestedList) {
        this.nestedList = nestedList;
        fillIntegerList(nestedList);
    }

    private void fillIntegerList(List<NestedInteger> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).isInteger()){
                integerList.add(list.get(i).getInteger());
            }
            else{
                fillIntegerList(list.get(i).getList());
            }
        }
    }

    @Override
    public Integer next() {
        count++;
        return integerList.get(count - 1);
    }

    @Override
    public boolean hasNext() {
        return count != integerList.size();
    }
}




class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class LRUCache {
//    private final Map<Integer, Integer> values = new HashMap<>();
//    HashMap<Integer, Integer> uses = new HashMap<>();
//    //private final List<Integer> list = new ArrayList<>();
//    private final int capacity;
//    public LRUCache(int capacity) {
//        this.capacity = capacity;
//    }
//
//    public int get(int key) {
//        System.out.println(values + " " + key);
//        if(values.get(key) == null){
//            return -1;
//        }
//        list.remove((Integer) key);
//        list.add(key);
//        return values.get(key);
//    }
//
//    public void put(int key, int value) {
//
//        System.out.println(values + "key: " + key + " value:" + value);
//        if(values.get(key) != null)
//            list.remove((Integer) key);
//        if(values.get(key) == null && values.size() + 1 > capacity){
//            values.remove(list.get(0));
//            list.remove(0);
//        }
//        values.put(key, value);
//        list.add(key);
//
//    }




}
class RandomizedSet {
    private final List<Integer> list;
    private final HashMap<Integer, Integer> map;

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        boolean a = !map.containsKey(val);
        if (a) {
            list.add(val);
            map.put(val, list.size() - 1);
        }
        System.out.println("After insert: " + list);
        return a;
    }

    public boolean remove(int val) {
        boolean a = map.containsKey(val);
        if (a) {
            int index = map.get(val);
            list.set(index, list.get(list.size() - 1));
            map.remove(val);
            list.remove(list.size() - 1);
            if(index < list.size()){
                map.put(list.get(index), index);
            }
        }
        System.out.println("After remove: " +  list);
        return a;
    }

    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
    }
}
class Solution {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        StringBuilder retn = new StringBuilder();
        for(String a : strs){
            retn.append(a).append(":;");
        }
        return retn.substring(0, retn.length() - 2);
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        return Arrays.asList(str.split(":;"));
    }
}




class Solution1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(isNumber(array[j]) && isNumber(array[i])){
                    if(Integer.parseInt(array[j]) > Integer.parseInt(array[i])){
                        String swap = array[j];
                        array[j] = array[i];
                        array[i] = swap;
                    }
                }
                else if(!isNumber(array[j]) && !isNumber(array[i])){
                    if(isGreaterThan(array[i], array[j])){
                        String swap = array[j];
                        array[j] = array[i];
                        array[i] = swap;
                    }
                }
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Test{
    public static void main(String[] args) {
        new Test().test();
    }

    public class IntBoxer {
        public int value;
        public IntBoxer() {
        }
        public IntBoxer(int startValue) {
            this.value = startValue;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "IntBoxer{" +
                    "value=" + value +
                    '}';
        }


    }
    public void test(){
        Integer a = 3;
        //Arrays.fill(array, 1);
        changeArray(a);
        System.out.println(a);
    }

    public void changeArray(Integer array){
        
    }
}


class MinStack {
    private Stack<Integer> stack;

    private Stack<Integer> minimums;
    public MinStack() {
        stack = new Stack<>();
        minimums = new Stack<>();
    }

    public void push(int val) {
        if(minimums.isEmpty() || minimums.peek() >= val){
            minimums.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if(minimums.peek().equals(stack.pop())){
            minimums.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minimums.peek();
    }
}

class TrieNode{
    public boolean isUse;
    public TrieNode [] trieNodes = new TrieNode[26];
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        if(word.isEmpty()){
            return;
        }
        TrieNode sub = root;
        for(int i = 0; i < word.length(); i++){
            if(sub.trieNodes[word.charAt(i) - 97] == null){
                sub.trieNodes[word.charAt(i) - 97] = new TrieNode();
            }
            sub = sub.trieNodes[word.charAt(i) - 97];
        }
        sub.isUse = true;
    }

    public boolean search(String word) {
        if(word.isEmpty()){
            return false;
        }
        TrieNode sub = root;
        for(int i = 0; i < word.length(); i++){
            if(sub.trieNodes[word.charAt(i) - 97] == null){
                return false;
            }
            sub = sub.trieNodes[word.charAt(i) - 97];
        }
        return sub.isUse;
    }

    public boolean startsWith(String prefix) {
        if(prefix.isEmpty()){
            return false;
        }
        TrieNode sub = root;
        for(int i = 0; i < prefix.length(); i++){
            if(sub.trieNodes[prefix.charAt(i) - 97] == null){
                return false;
            }
            sub = sub.trieNodes[prefix.charAt(i) - 97];
        }
        return true;
    }
}

class WordDictionary {
    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        if(word.isEmpty()){
            return;
        }
        TrieNode sub = root;
        for(int i = 0; i < word.length(); i++){
            if(sub.trieNodes[word.charAt(i) - 97] == null){
                sub.trieNodes[word.charAt(i) - 97] = new TrieNode();
            }
            sub = sub.trieNodes[word.charAt(i) - 97];
        }
        sub.isUse = true;
    }

    public boolean search(String word) {
        if(word.isEmpty()){
            return false;
        }
        return recForSearch(word, 0, root);
    }

    private boolean recForSearch(String word, int i, TrieNode node){
        if(node == null){
            return false;
        }
        if(i == word.length()){
            return node.isUse;
        }
        if(word.charAt(i) == '.'){
            for (int j = 0; j < 26; j++){
                if(recForSearch(word, i + 1, node.trieNodes[j])){
                    return true;
                }
            }
            return false;
        }
        return recForSearch(word, i + 1, node.trieNodes[word.charAt(i) - 97]);
    }
}

class Test2{
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("3");
        bigInteger = bigInteger.pow(1000000000);
        System.out.println(bigInteger);
    }
}


class KthLargest {

    List<Integer> list = new ArrayList<>();
    private int k;

    public KthLargest(int k, int[] nums) {
        double t = Math.pow(2, 5);
        System.out.println(t);
        notify();

        this.k = k;
        list.addAll(Arrays.stream(nums)
                .boxed()
                .toList());
    }

    public int add(int val) {
        list.add(val);
        Collections.sort(list);
        return list.get(k - 1);
    }
}

class Post{
    int time;
    int id;
    public Post(int id, int time){
        this.time = time;
        this.id = id;
    }
}

class Twitter {
    private int time = 0;
    private Map<Integer, List<Post>> tweets = new HashMap<>();
    private Map<Integer, List<Integer>> follows = new HashMap<>();

    public Twitter() {

    }

    public void postTweet(int userId, int tweetId) {
        if(!tweets.containsKey(userId)){
            List<Post> list = new ArrayList<>();
            list.add(new Post(tweetId, ++time));
            tweets.put(userId, list);
        }
        else {
            tweets.get(userId).add(new Post(tweetId, ++time));
        }
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Post> priorityQueue = new PriorityQueue<>((x, y) -> y.time - x.time);
        if(tweets.containsKey(userId)){
            for(Post el : tweets.get(userId)){
                priorityQueue.add(el);
            }
        }
        if(follows.containsKey(userId)){
            for(int el : follows.get(userId)){
                if(tweets.containsKey(el)){
                    for(Post el1 : tweets.get(el)){
                        priorityQueue.add(el1);
                    }
                }
            }
        }
        List<Integer> retList = new ArrayList<>();
        while(!priorityQueue.isEmpty()){
            retList.add(priorityQueue.poll().id);
        }
        return retList.subList(0, Math.min(retList.size(), 10));
    }

    public void follow(int followerId, int followeeId) {
        if(!follows.containsKey(followerId)){
            List<Integer> list = new ArrayList<>();
            list.add(followeeId);
            follows.put(followerId, list);
        }
        else {
            if(!follows.get(followerId).contains(followeeId)){
                follows.get(followerId).add(followeeId);
            }
        }
    }

    public void unfollow(int followerId, int followeeId) {
        if(follows.containsKey(followerId) && follows.get(followerId).contains(followeeId)){
            follows.get(followerId).remove((Object)followeeId);
        }
    }
}

class Interval {
      public int start, end;
      public Interval(int start, int end) {
          this.start = start;
          this.end = end;
      }
  }
//[null,null,null,null,null,null,-1,null,19,17,null,-1,null,null,null,-1,null,-1,5,-1,12,null,null,3,5,5,null,null,1,null,-1,null,30,5,30,null,null,null,-1,null,-1,24,null,null,18,null,null,null,null,14,null,null,18,null,null,11,null,null,null,null,null,18,null,null,24,null,4,29,30,null,12,11,null,null,null,null,29,null,null,null,null,17,22,18,null,null,null,24,null,null,null,20,null,null,null,29,18,18,null,null,null,null,20,null,null,null,null,null,null,null]
//[null,null,null,null,null,null,-1,null,19,17,null,-1,null,null,null,-1,null,-1,5,-1,12,null,null,3,5,5,null,null,1,null,-1,null,30,5,30,null,null,null,-1,null,-1,24,null,null,18,null,null,null,null,-1,null,null,18,null,null,-1,null,null,null,null,null,18,null,null,-1,null,4,29,30,null,12,-1,null,null,null,null,29,null,null,null,null,17,22,18,null,null,null,-1,null,null,null,20,null,null,null,-1,18,18,null,null,null,null,20,null,null,null,null,null,null,null]
