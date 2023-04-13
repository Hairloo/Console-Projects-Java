package WORDLEGame;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Game {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    private static HashSet<String> hashSet = new HashSet<>();
    private static List<String> currentTries = new ArrayList<>();
    private static String guessWord;
    public static void main(String[] args) throws IOException {
        play();
    }

    public static void play(){
        try{
            setHashSet("C:\\Users\\loban\\IdeaProjects\\Matrix\\src\\Words\\FiveLettersWords.txt");
        }
        catch (IOException e){
            System.out.println("HashSet не заполнен");
        }
        if(hashSet.isEmpty()){
            System.out.println("Игра окончена еще не начавшись");
            return;
        }
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        for(int i = 0; i < 6; i++){
            System.out.println("Введите слово из 5 букв");
            String tryWord;
            while (true){
                String str = sc.nextLine().trim();
                if(str.length() == 5 && hashSet.contains(str)){
                    tryWord = str;
                    break;
                }
                System.out.println("Вы ввели слово неправильно");
            }
            currentTries.add(tryWord);
            printTriesArray(currentTries);
            if(guessWord.equals(tryWord)){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Вы угадали!");
        }
        else{
            System.out.println("Вы проиграли(");
            System.out.println("Слово которое вы угадывали: " + guessWord);
        }

    }
    public static void printTriesArray(List<String> list){
        for(int i = 0;i < list.size(); i++){
            for(int j = 0; j < 5; j++){
                if(list.get(i).charAt(j) == guessWord.charAt(j)){
                    setConsoleColor(ANSI_GREEN);
                }
                else if(guessWord.contains(Character.toString(list.get(i).charAt(j)))){
                    setConsoleColor(ANSI_YELLOW);
                }
                else {
                    setConsoleColor(ANSI_RED);
                }
                System.out.print(Character.toString(list.get(i).charAt(j)).toUpperCase() + " ");
            }
            System.out.println();
            setConsoleColor(ANSI_RESET);
            System.out.println("---------");
        }
        for(int i = 0; i < 6 - list.size(); i++){
            System.out.println();
            System.out.println("---------");
        }
    }
    public static void setConsoleColor(String str){
        System.out.print(str);
    }

    public static void setHashSet(String fileName) throws IOException {
        BufferedReader reader;
        int indexGuessWord = (int)(Math.random() * 27030);
        try{
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName), "UTF-8");
            reader = new BufferedReader(inputStreamReader);
        }
        catch(FileNotFoundException e){
            System.out.println("Файл не найден");
            System.out.println("HashSet не заполнен");
            return;
        }
        for(int i = 0; reader.ready(); i++){
            String str = reader.readLine();
            hashSet.add(str);
            if(i == indexGuessWord){
                setGuessWord(str);
            }
        }

    }

    public static void setGuessWord(String str){
        guessWord = str;
        //System.out.println("Слово которое нужно угадать: " + str);
    }



}
