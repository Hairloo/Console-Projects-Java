package Mirea.Exam;

import java.util.*;

public class IntTree {
    private TreeNode root;
    public boolean equals2(TreeNode q){
        return  isSameTree(root, q);
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

class Tasks2{
    public static void main(String[] args) {
        Queue queue = new ArrayDeque(List.of(1,2,3,4,3,2,1));
        System.out.println(isPalindrome(queue));
    }
    public static boolean isPalindrome(Queue<Integer> queue){
        int n = queue.size();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            int el = queue.poll();
            stack.push(el);
            queue.add(el);
        }

        for(int i = 0; i < n; i++){
            int el = queue.poll();
            queue.add(el);
            if(el != stack.pop()){
                i++;
                for(; i < n; i++){
                    queue.add(queue.poll());
                }
                return false;
            }
        }
        return true;
    }
}
