package pack2;
import pack1.pack1;
public class pack2 extends pack1{
    int r = 8;
    private int s = 3;

    public static void main(String[] args) {
            Test.a = 0;

        Box box = new Box(new int[] {1, 2, 3});
        System.out.println(box);
    }


}

class MarkBook {
    int [] marks;
    double averageGrade;

   public MarkBook(int[] marks){
       this.marks = marks;
       int count = 0;
       int sum = 0;
       for(int a : marks){
           sum += a;
           count++;
       }
       if(count == 0){
           averageGrade = 0.0;
       }
       else{
           averageGrade = (double)sum / count;
       }


   }

    public void print() {
        if(marks.length == 0) {
            System.out.print("No data");
        }
        else {
            for(int mark : marks) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
        System.out.println("Average: " + averageGrade);
    }
}

class Father {
    public void car() {
        System.out.println("Car1");
    }
}

class Child extends Father {
    public void car() {
        System.out.println("Car");
    }
}




class Box {
    int width;
    int height;
    int depth;
    public Box(int[] val){
        width = val[0];
        height = val[1];
        depth = val[2];
    }
    public String toString() {
        return width + " x " + height + " x " + depth;
    }
}



class Person{
    public String first;
    public String second;

    public Person(String first, String second){
        this.first = first;
        this.second = second;
    }
}
interface Krut{

}
interface NeKrut extends Krut{

}

class Test{
    static int a;
    static{
        System.out.println("Hello");
    }
}




