package Tests;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Прайсы 2
*/

public class Solution2 {
    public static void main(String[] args) throws IOException {
        args = new String[5];
        args[0] = "-d";
        args[1] = "198478";
        args[2] = "Short ktoya blues";
        args[3] = "159.00";
        args[4] = "12";
        if(args.length > 0){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileName = reader.readLine();
            reader.close();
            if(args[0].equals("-u")){
                String id = args[1];
                String toWrite = toFormat(id, args);
                updateItem(toWrite, id, fileName);
            }

            if(args[0].equals("-d")){
                String id = args[1];
                deleteItem(id, fileName);
            }

        }
    }
    public static void deleteItem(String id, String fileName) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        FileWriter fileWriter = new FileWriter("tempfile.txt");
        int count = 0;
        while(true){
            String str1 = reader.readLine();
            if(str1 == null){
                break;
            }
            StringBuilder str = new StringBuilder(str1);
            appendProbels(50 - str.length(), str);
            if(!id.equals(str.substring(0, 8).trim())){
                if(count != 0){
                    fileWriter.write("\n");
                }
                fileWriter.write(str.toString());
                count = 1;
            }
        }
        reader.close();
        reader = new BufferedReader(new FileReader("tempfile.txt"));
        fileWriter.close();
        fileWriter = new FileWriter(fileName);
        count = 0;
        while(true){
            String str = reader.readLine();
            if(str == null){
                break;
            }
            if(count != 0){
                fileWriter.write("\n");
            }
            fileWriter.write(str);
            count = 1;
        }
        fileWriter.close();
        reader.close();
    }


    public static void updateItem(String updateString, String id, String fileName) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        FileWriter fileWriter = new FileWriter("tempfile.txt");
        int count = 0;
        while(true){
            String str1 = reader.readLine();
            if(str1 == null){
                break;
            }
            StringBuilder str = new StringBuilder(str1);
            appendProbels(50 - str.length(), str);
            if(id.equals(str.substring(0, 8).trim())){
                str = new StringBuilder(updateString);
            }
            if(count != 0){
                fileWriter.write("\n");
            }
            fileWriter.write(str.toString());
            count = 1;
        }
        reader.close();
        reader = new BufferedReader(new FileReader("tempfile.txt"));
        fileWriter.close();
        fileWriter = new FileWriter(fileName);
        count = 0;
        while(true){
            String str = reader.readLine();
            if(str == null || str.isEmpty()){
                break;
            }
            if(count != 0){
                fileWriter.append("\n");
            }
            fileWriter.write(str);
            count = 1;
        }
        fileWriter.close();
        reader.close();
    }


    private static String toFormat(String id, String [] args){
        String price = args[3];
        String quantity = args[4];
        StringBuilder builder = new StringBuilder().append(id, 0, id.length());
        appendProbels(8 - id.length(), builder);
        builder.append(args[2], 0, Math.min(args[2].length(), 30));
        appendProbels(30 - args[2].length(), builder);
        builder.append(price, 0, Math.min(args[3].length(), 8));
        appendProbels(8 - price.length(), builder);
        builder.append(quantity, 0, Math.min(args[4].length(), 4));
        appendProbels(4 - quantity.length(), builder);
        return builder.toString();
    }
    private static void appendProbels(int count, StringBuilder builder){
        for(int i = 0; i < count; i++){
            builder.append(" ");
        }
    }
}

