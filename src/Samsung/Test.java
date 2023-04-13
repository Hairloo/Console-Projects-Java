package Samsung;

public class Test {
}
/*
public static void main(String[] args) {
        Vector2D v = new Vector2D(1.2374, 2.2334);
        Vector2D v2 = new Vector2D();
        Vector2D v3 = new Vector2D(v);
        v.print();
        v2.print();
        v3.print();
    }
 */
/*
Scanner in = new Scanner(System.in);
double result = 0;
String[] arr = in.nextLine().split(" ");
for(int i = 0; i < arr.length; i++){
    if(arr[i].equals("+")){
        continue;
    }
    else{
        result += Double.parseDouble(arr[i]);
    }
}


(x % 2 == 0 || y % 2 == 0 || z % 2 == 0) && (x % 2 == 1 || y % 2 == 1 || z % 2 == 1)



case 2:
    c++;
    break;
case 6:
    c--;
    break;
default:
    c = 0;
    break;




if(c == 0){
    c++;
    x++;
}

; c < 50 && x < 500; c++, x += c * 2



if(x % d != 0){
    do{
        d++;
    } while (d < x && x % d != 0);
}


int c = 0;
for(int i = 0; i < a.length; i++){
    if(a[i] % 2 == 0 && i % 2 == 0){
        c++;
    }
}


public static double f(String a){
    return 0;
}


int flag = 0;
for(int i = 0; i < a.length; i++){
    for(int j = 0; j < a[0].length; j++){
        if(i % 2 == 0 && j % 2 == 0){
            flag = 1;
            System.out.print(a[i][j] + " ");
        }
    }
    if(flag == 1){
        System.out.println(" ");
        flag = 0;
    }
}

public static void rotRight(int[] arr){
    int dop = arr[arr.length - 1];
    for(int i = arr.length - 1; i > 0; i--){
        arr[i] = arr[i - 1];
    }
    arr[0] = dop;
}
 */

/*Scanner in = new Scanner(System.in);
        int countVoz = 0, countUb = 0, countMaxVoz = 0, countMaxUb = 0;
        int pred = 0;
        outer:
        while(true){

            if(pred == 0){
                pred = in.nextInt();
            }
            int a = in.nextInt();
            while(pred > a){
                countUb++;
                countMaxUb = countMaxUb < countUb ? countUb : countMaxUb;
                pred = a;
                a = in.nextInt();
                if(a == 0){
                    System.out.println(countMaxUb > countMaxVoz ? countMaxUb : countMaxVoz);
                    break outer;
                }
            }
            countUb = 0;
            while(pred < a){
                countVoz++;
                countMaxVoz = countMaxVoz < countVoz ? countVoz : countMaxVoz;
                pred = a;
                a = in.nextInt();
                if(a == 0){
                    System.out.println(countMaxUb > countMaxVoz ? countMaxUb : countMaxVoz);
                    break outer;
                }
            }
            countVoz = 0;
        }*/
/*Scanner in = new Scanner(System.in);
        int count = 0;
        int maxVal = 0;
        int arr[] = new int[0];
        int length = 0;
        while(true){
            int a = in.nextInt();
            if(a == 0){
                break;
            }
            else{
                int[] newArr = new int[++length];
                for(int i = 0; i < length - 1; i++){
                    newArr
                }
            }
        }*/

/*Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[2*n + 1][2 * n + 1];
        int maxVal = (2 * n + 1) * (2 * n + 1) - 1;
        int y = 0;
        while(y < n){
            arr[y][2 * n - 2 - y] = maxVal;
        }*/



/*import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        System.out.println(a >= 3 && a <= 8);
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        System.out.println((a >= -3 && a <= 5) || (a >= 9 && a <= 15));
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = in.nextDouble();
        System.out.println(!((a >= -2 && a <= 3) || (a >= 6 && a <= 9)));
    }
}

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int a = in.nextInt();
        System.out.println((a > 0) && (a / 100 != 0) && (a % 5 == 0) && (a / 1000 == 0));
    }
}*/
/*(a * a + b * b > 4) && (b < a) && (a < 2) && (a > 0) && (b > 0);

(b < Math.sin(a)) && (b < 0.5 && b > 0) && (a > 0 && a < Math.PI);

((y < 2 - x * x) && (y > x)) || ((y < x) && (y > 0) && (y < 2 - x * x));

(y > x * x - 2) && ((y < x) || ( y < -x));
(x * x + y * y < 1) && !((y < x) && !(y < 0 && x < 0));
        (x * x + y * y < 1) && !((y > x) && (y < -x));
        ((y > 2 * x * x) && !(y < 1 - x) && (x < 1)) || ((y < 2 * x * x) && ( x < 1 && x > 0) && (y > 1 - x));
        ((x * x + y * y < 1) && (x > 0)) || ((y < 1) && (y > x - 1) && (x > 0));
        (x * x + y * y < 1) || ((x * x + y * y > 1) && y < 1 && x < 1 && x > 0 && y > 0);*/
/*if((b < 1) || (a < 1) || (a > 12) || (a == 1 && b > 31) || (a == 2 && b > 29) || (a == 3 && b > 31) || (a == 4 && b > 30) || (a == 5 && b > 31) || (a == 6 && b > 30) || (a == 7 && b > 31) || (a == 8 && b > 31) || (a == 9 && b > 30) || (a == 10 && b > 31) || (a == 11 && b > 30) || (a == 12 && b > 31)){
            System.out.println(-1);
        }
        else{
            switch (m) {
                case 1:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 31;
                    m++;
                case 2:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 28;
                    m++;
                case 3:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 31;
                    m++;
                case 4:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 30;
                    m++;
                case 5:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 31;
                    m++;
                case 6:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 30;
                    m++;
                case 7:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 31;
                    m++;
                case 8:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 31;
                    m++;
                case 9:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 30;
                    m++;
                case 10:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 31;
                    m++;
                case 11:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 30;
                    m++;
                case 12:
                    if (m == a) {
                        d -= b;
                        break;
                    }
                    d -= 31;
                    m++;
            }
            System.out.println(d)

}*/



/*Scanner in = new Scanner(System.in);
        int arr[] = new int[in.nextInt()];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            if(i != arr.length - 1 && arr[i] == arr[i + 1]){
                while(i != arr.length - 1 && arr[i + 1] == arr[i]){
                    i++;
                }
                count++;
            }
            else{
                count++;
            }
        }
        System.out.println(count);*/
