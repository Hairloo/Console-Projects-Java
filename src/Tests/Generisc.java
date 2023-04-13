package Tests;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Generisc{
   static class A{
       public String a;
   }
   static class B extends A{
       public String a;
   }
   static class C extends A{
       public int a;
   }
   static void m(A a){
       a.a = "str";
   }

    public static void main(String[] args) {
        System.out.println();
    }
}



