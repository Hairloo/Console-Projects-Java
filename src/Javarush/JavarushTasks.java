package Javarush;

import java.io.*;
import java.util.*;

public class JavarushTasks {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        HashMap<Integer, String> map = new HashMap<>();
//        while(true){
//            String first = reader.readLine();
//            if(first.isEmpty()){
//                break;
//            }
//            int firstInt = Integer.parseInt(first);
//            String second = reader.readLine();
//            map.put(firstInt, second);
//            if(second.isEmpty()){
//                break;
//            }
//        }
//        for(Map.Entry<Integer, String> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
        //System.out.println(Arrays.toString(sort(new int[]{2,3,4,1,5,7,6}, 0, 6)));
        long l =  1234_564_890L;
        System.out.println(l);
        int x =  0b1000_1100_1010;
        System.out.println(x);
        double m = (byte) 110_987_654_6299.123_34;
        System.out.println(m);
        float f =  l++ + 10 + ++x - (float) m;
        System.out.println(f);
        l = (long) f / 1000;
        System.out.println(l);
    }
    public static int[] sort(int[] array, int from, int to) {
        if(from < to){
            int divideIndex = func(array, from, to);
            sort(array, divideIndex, to);
            sort(array, from, divideIndex - 1);
        }
        return array;
    }
    public static int func(int[] array, int from, int to){
        int pivot = array[from];
        while(from <= to){
            while(array[from] > pivot){
                from++;
            }
            while(array[to] < pivot){
                to--;
            }
            if(from <= to){
                int swap = array[from];
                array[from] = array[to];
                array[to] = swap;
                from++;
                to--;
            }
        }
        return from;
    }


}
class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

        InputStream fileInputStream = getInputStream(destinationFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0) ;
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
