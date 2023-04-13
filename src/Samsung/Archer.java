package Samsung;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Archer {


}

class Warrior{
    public static void main(String[] args) throws IOException {
        //new Warrior().clearFile("Hi.txt");
        Thread thr = new Thread(new Answer('b'));
        thr.start();
    }
    private double armor, sword;
    public void attack(){}
    public void teleType(String text) {
        double a = Double.parseDouble("Ui");
    }
    void test() throws IOException {
        for (int index = 0; index < 2; index++) {
            PrintWriter writer = new PrintWriter("/test");
            writer.print("test");
            writer.close();
        }
    }
    public void clearFile(String fileName) {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(fileName);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        writer.print("");
    }
}


class Answer implements Runnable {
    char chr;

    public Answer(char chr) {
        this.chr = chr;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.print(chr);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
