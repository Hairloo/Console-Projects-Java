package Samsung;

import java.util.ArrayList;
class Main1{
    public static void main(String[] args) {
        FibList a = new FibList();
        a.save(5);
        a.print();
    }
}
public class FibList {

    private ArrayList<Long> fib = new ArrayList<>();
     void save(int a){
        if(a < 1){
            System.out.println("Wrong number");
        }
        else{
            add(1, a);
        }
    }
     void add(int a, int b){
        if(a <= b || a == 1){
            if(a == 1){
                fib.add(1L);
            }
            else if(a == 2){
                fib.add(1L);
            }
            else{
                fib.add(fib.get(a - 2) + fib.get(a - 3));
            }
            add(a + 1, b);
        }

    }
     void print(){
        System.out.print(fib.get(0));
        for(int i = 1; i < fib.size(); i++){
            System.out.print(" " + fib.get(i));
        }
    }
}
