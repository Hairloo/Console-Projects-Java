package Tests;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Main main = new Sup();
    }
}

class Main{
    public void doWork(){
        System.out.println("Good");
    }
}

class Sup extends Main{
    public void doAnother(){
        System.out.println("Lets go");
    }
}
