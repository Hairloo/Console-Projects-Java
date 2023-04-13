package Tests;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //System.out.println(Integer.parseInt("1234      ".trim()));

        if(args.length > 0){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            if(args[0].equals("-c")){
                int id = findMaxId(fileName) + 1;
                String toWrite = toFormat(id, args);
                FileWriter fileOutputStream = new FileWriter(fileName, true);
                fileOutputStream.write(toWrite);
                fileOutputStream.close();
            }

        }


    }

    public static int findMaxId(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int max = 0;
        while(true){
            String str = reader.readLine();
            if(str == null){
                break;
            }
            max = Math.max(Integer.parseInt(str.substring(0, 8).trim()), max);
        }
        reader.close();
        return max;
    }

    private static String toFormat(int id, String [] args){
        String price = args[2];
        String quantity = args[3];
        StringBuilder builder = new StringBuilder(System.lineSeparator()).append(Integer.toString(id).substring(0, 8));
        appendProbels(8 - Integer.toString(id).length(), builder);
        builder.append(args[1].substring(0, Math.min(args[1].length(), 30)));
        appendProbels(30 - args[1].length(), builder);
        builder.append(price.substring(0, Math.min(args[2].length(), 8)));
        appendProbels(8 - price.length(), builder);
        builder.append(quantity.substring(0, Math.min(args[3].length(), 4)));
        appendProbels(4 - quantity.length(), builder);
        System.out.println(builder.toString());
        return builder.toString();
    }
    private static void appendProbels(int count, StringBuilder builder){
        for(int i = 0; i < count; i++){
            builder.append(" ");
        }
    }
}
