package Mirea.Exam;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.*;

public class Tasks {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("Alyssa",22, "Char",25, "Dan",25, "Jeff", 20, "Kasey", 20, "Kim", 20, "Mogran", 25, "Ryan", 25,  "Stef", 22);
        System.out.println(rarest3(map));
    }

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2){
        List<Integer> newList = new ArrayList<>();
        int i = 0;
        for(;i < Math.min(list1.size(), list2.size()); i++){
            newList.add(list1.get(i));
            newList.add(list2.get(i));
        }
        if(list1.size() > list2.size()){
            for(; i < list1.size(); i++){
                newList.add(list1.get(i));
            }
        }
        else if(list1.size() < list2.size()){
            for(;i < list2.size(); i++){
                newList.add(list2.get(i));
            }
        }
        return newList;
    }

    private static int rarest2(Map<String, Integer> intByString) {
        if (intByString.isEmpty()) {
            throw new IllegalArgumentException("Пустой словарь");
        }
        Collection<Integer> values = intByString.values();
        return values.stream()
                .min(Comparator.comparingInt(v -> Collections.frequency(values, v)))
                .get();
    }

    private static int rarest3(Map<String, Integer> map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException("Пустой словарь");
        }
        LinkedList<Integer> list = new LinkedList<>(map.values());
        return Collections.min(list);
        // Создаем двусвязный список и наполняем его значениями мапа
        // Воспользуемся методом min класса Collections, чтобы вернуть минимальное значение
    }


    public static int rarest(Map<String, Integer> map) throws NullPointerException {
        if(map == null || map.isEmpty()){
            throw new NullPointerException();
        }
        Map<Integer, Integer> countRep = new HashMap<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            countRep.merge(entry.getValue(), 1, Integer::sum);
        }
        int minValRep = Integer.MAX_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : countRep.entrySet()){
            if(minValRep > entry.getValue()){
                minValRep = entry.getValue();
                minVal = entry.getKey();
            }
            else if(minValRep == entry.getValue()){
                minVal = Math.min(entry.getKey(), minVal);
            }
        }
        return minVal;
    }

    public static boolean hasOdd(Set<Integer> set){
        for(int el : set){
            if(el % 2 == 1){
                return true;
            }
        }
        return false;
    }
    public static Map<String, Integer> reverse(Map<Integer, String> map){
        Map<String, Integer> reverseMap = new HashMap<>();
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            reverseMap.put(entry.getValue(), entry.getKey());
        }
        return reverseMap;
    }

    public static boolean isUnique(Map<String, String> map){
        Set<String> set = new HashSet<>();
        for(Map.Entry<String, String> entry : map.entrySet()){
            if(!set.add(entry.getValue())){
                return false;
            }
        }
        return true;
    }

    public static Stack<Integer> copyStack(Stack<Integer> original){
        Stack<Integer> copy = new Stack<>();
        Deque<Integer> queue = new ArrayDeque<>();
        while (!original.isEmpty()){
            queue.add(original.pop());
        }
        while (!queue.isEmpty()){
            int el = queue.pollLast();
            copy.push(el);
            original.push(el);
        }
        return copy;
    }

    public static Stack<Integer> splitStack(Stack<Integer> stack){
        Queue<Integer> queue = new PriorityQueue<>();
        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()){
            stack.push(queue.poll());
        }
        return stack;
    }

    public static boolean equals(Stack<Integer> stack1, Stack<Integer> stack2){
        if(stack1.size() != stack2.size()){
            return false;
        }
        Stack<Integer> supStack = new Stack<>();
        while (!stack1.isEmpty()){
            int el1 = stack1.pop();
            int el2 = stack2.pop();
            supStack.push(el1);
            supStack.push(el2);
            if(el1 != el2){
                while (!supStack.isEmpty()){
                    stack2.push(supStack.pop());
                    stack1.push(supStack.pop());
                }
                return false;
            }
        }
        while (!supStack.isEmpty()){
            stack2.push(supStack.pop());
            stack1.push(supStack.pop());
        }
        return true;
    }

    public static int longestSortedSequence(int [] arr){
        if(arr.length == 0){
            return 0;
        }
        int maxLen = 1;
        int currLen = 1;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= arr[i - 1]){
                currLen++;
            }
            else {
                maxLen = Math.max(currLen, maxLen);
                currLen = 1;
            }
        }
        maxLen = Math.max(currLen, maxLen);
        return maxLen;
    }

    public static Queue<Integer> reverseHalf(Queue<Integer> queue){
        int n = queue.size();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                queue.add(queue.poll());
            }
            else {
                stack.push(queue.poll());
            }
        }
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                queue.add(queue.poll());
            }
            else {
                queue.add(stack.pop());
            }
        }
        return queue;
    }

    public static void isPowerOfTwo(int n){
        if(n < 1){
            System.out.println("NO");
        }
        else if(n == 1){
            System.out.println("YES");
        }
        else {
            if(n % 2 == 0){
                isPowerOfTwo(n / 2);
            }
            else {
                System.out.println("NO");
            }
        }
    }

    public static int sumOfNumbers(int n){
        if(n == 0){
            return 0;
        }
        if(n < 0){
            return sumOfNumbers(-n);
        }
        return (n % 10) + sumOfNumbers(n / 10);
    }


}

class LinkedIntList {
    private ListNode front;
    public void removeAll(ListNode list2){
        ListNode prev = front;
        ListNode dup = front.next;
        ListNode dup2 = list2;
        while (dup2 != null && dup != null){
            if(dup2.data > dup.data){
                dup = dup.next;
            }
            else if(dup2.data < dup.data){
                dup2 = dup2.next;
            }
            else {
                prev.next = dup.next;
                prev = dup.next;
            }
        }
    }
}
class ListNode {
    public int data;
    public ListNode next;
}


class UniversalSorting{

}


class Stack2<T> { //stack on array
    private Object [] array;
    public Stack2() {
        array = new Object[0];
    }


    public void push(T item) {
        Object [] arrDup = array;
        array = new Object[array.length + 1];
        for(int i = 0; i < arrDup.length; i++){
            array[i] = arrDup[i];
        }
        array[array.length - 1] = item;
    }


    public synchronized T pop() {
        Object el = array[array.length - 1];
        Object [] arrDup = array;
        array = new Object[array.length - 1];
        for(int i = 0; i < array.length; i++){
            array[i] = arrDup[i];
        }
        return (T)el;
    }


    public synchronized T peek() {
        return (T)array[array.length - 1];
    }


    public boolean empty() {
        return array.length == 0;
    }


    public synchronized int search(T o) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == o){
                return i;
            }
        }
        return -1;
    }
}

class Stack3<T>{ //stack on list
    private List<T> list;
    public Stack3() {
        list = new ArrayList<>();
    }


    public void push(T item) {
        list.add(item);
    }


    public synchronized T pop() {
        T el = list.get(list.size() - 1);
        list = list.subList(0, list.size() - 1);
        return el;
    }


    public synchronized T peek() {
        return list.get(list.size() - 1);
    }


    public boolean empty() {
        return list.isEmpty();
    }


    public synchronized int search(T o) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == o){
                return i;
            }
        }
        return -1;
    }
}

class ArrayList2<T>{//arraylist on array(sampling methods)
    private Object[] array;
    public ArrayList2() {
        array = new Object[0];
    }


    public int size() {
        return array.length;
    }


    public boolean isEmpty() {
        return array.length == 0;
    }


    public boolean contains(T o) {
        for(Object el : array){
            if(el.equals(o)){
                return true;
            }
        }
        return false;
    }


    public int indexOf(T o) {
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }


    public int lastIndexOf(T o) {
        for(int i = array.length - 1; i > -1; i--){
            if(array[i].equals(o)){
                return i;
            }
        }
        return -1;
    }


    public Object[] toArray() {
        return array;
    }


    public T get(int index) {
        if(index >= array.length){
            throw  new IndexOutOfBoundsException();
        }
        return (T)array[index];
    }


    public void set(int index, T element) {
        array[index] = element;
    }


    public boolean add(T o) {
        Object [] arrDup = array;
        array = new Object[array.length + 1];
        for(int i = 0; i < arrDup.length; i++){
            array[i] = arrDup[i];
        }
        array[array.length - 1] = o;
        return true;
    }



    public Object remove(int index) {
        if(!(index >= 0 && index <= array.length)){
            return null;
        }
        Object [] arrDup = array;
        Object el = array[index];
        array = new Object[array.length - 1];
        for(int i = 0; i < array.length; i++){
            if(i < index){
                array[i] = arrDup[i];
            }
            else{
                array[i] = arrDup[i + 1];
            }
        }
        return el;
    }


    public boolean remove(Object o) {
        if(!contains((T)o)){
            return false;
        }
        int index = indexOf((T)o);
        Object [] arrDup = array;
        array = new Object[array.length - 1];
        for(int i = 0; i < array.length; i++){
            if(i < index){
                array[i] = arrDup[i];
            }
            else{
                array[i] = arrDup[i + 1];
            }
        }
        return true;

    }


    public void clear() {
        array = new Object[0];
    }

    public ArrayList2<T> subList(int fromIndex, int toIndex) {
        ArrayList2<T> arrayList2 = new ArrayList2<>();
        for (int i = fromIndex; i < toIndex; i++){
            arrayList2.add((T)array[i]);
        }
        return arrayList2;
    }
}
class T{

}
class Main extends T{
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main instanceof Object);
    }
}

class MultiSet{
    private int size;
    Map<String, Integer> map;
    public MultiSet(int size){
        map = new HashMap<>();
        this.size = size;
    }

    public void add(String el){
        map.merge(el,1, Integer::sum);
    }

    public String [] getAll(){
        Object [][] list = new Object[map.size()][2];
        int i = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            list[i] = new Object[]{entry.getKey(), entry.getValue()};
            i++;
        }
        Arrays.sort(list, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                String a = (String)o1[0];
                String b = (String)o2[0];
                return a.compareTo(b);
            }
        });
        String [] arr = new String[size];
        int count = 0;
        for(i = 0; i < list.length; i++){
            for (int j = 0; j < (Integer)list[i][1]; j++, count++){
                arr[count] = (String)list[i][0];
            }
        }
        return arr;
    }

    public Object [][] getAllWithCount(){
        Object [][] list = new Object[map.size()][2];
        int i = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            list[i] = new Object[]{entry.getKey(), entry.getValue()};
            i++;
        }
        Arrays.sort(list, new Comparator<Object[]>() {
            @Override
            public int compare(Object[] o1, Object[] o2) {
                String a = (String)o1[0];
                String b = (String)o2[0];
                return a.compareTo(b);
            }
        });
        return list;
    }

}
class Main2{
    public static void main(String[] args) {
        String [] arr = new String[]{"Farm", "Zoo", "Car", "Apple", "Bee", "Golf", "Bee", "Dog", "Golf", "Zoo", "Zoo", "Bee", "Bee", "Apple"};
        System.out.println(Arrays.toString(guavaSort(arr)));
        System.out.println(Arrays.toString(arr));
    }

    public static String [] guavaSort(String [] arr){
        MultiSet set = new MultiSet(arr.length);
        for (String str : arr){
            set.add(str);
        }
        arr = set.getAll();
        Object [][] newArr = set.getAllWithCount();
        for(Object[] el : newArr){
            System.out.println(el[0] + ", " + el[1]);
        }
        return arr;
    }
}
