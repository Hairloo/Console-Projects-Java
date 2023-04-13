import java.util.Random;

//COLORS IN THE BOTTOM


public class Processing {
    public static void main(String[] args) {
        try{
            process();
        }
        catch (Exception e){
            System.out.println("Not Finished");
        }
    }
    public static void process(){
        int sec = Math.abs(new Random().nextInt()) % 10;
        try{
            for(int i = 0; i <= 100; i++){
                System.out.print("\u001b[0m" + "Progress: " + "\u001B[31m" + i + "%");
                if(i < 100){
                    System.out.print("\r");
                }
                Thread.sleep(1000);
            }
            System.out.println("\u001b[0m" + "\nPROCESS CANCELED");
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

//https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
