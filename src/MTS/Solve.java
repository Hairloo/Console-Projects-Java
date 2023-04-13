package MTS;

import java.util.Scanner;



class Main1
{
    public static void main (String[] args) throws java.lang.Exception
    {
        prov();
    }
    public static void solve1(){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        int countVoz = 1;
        int countUb = 1;
        int countPovt = 1;
        for(int i = 1; i < 4; i++){
            if(str.charAt(i) + 1 == str.charAt(i - 1)){
                countUb++;
            }
            else{
                countUb = 1;
            }
            if(str.charAt(i) - 1 == str.charAt(i - 1)){
                countVoz++;
            }
            else {
                countVoz = 1;
            }
            if(str.charAt(i) == str.charAt(i - 1)){
                countPovt++;
            }
            else{
                countPovt = 1;
            }
        }
        countUb += Math.min(7, str.charAt(3) - '0');
        countVoz += Math.min(9 - (str.charAt(3) - '0'), 7);
        countPovt += 7;
        int maxk = Math.max(countPovt, Math.max(countVoz, countUb));
        int retVal = 0;
        if(countVoz == maxk){
            retVal++;
        }
        if(countUb == maxk){
            retVal++;
        }
        if(countPovt == maxk){
            retVal++;
        }
        System.out.println(retVal);
    }
    public static void solve2(){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < n; i++){
            String num = sc.nextLine();
            int cel = 0;
            int delim = 0;
            //System.out.println(num.indexOf('.'));
            if(num.indexOf('.') < 0){
                cel = Integer.parseInt(num);
                delim = 1;
            }
            else {
                delim = (int)Math.pow(10, num.split("\\.")[1].length());
                cel = (int)(Double.parseDouble(num) * delim);
            }
            int obDel = obDel(cel, delim);
            System.out.println((cel /obDel) + " " + (delim / obDel));

        }
    }

    public static int obDel(int a, int b){
        for(int i = b - 1; i > 0 ; i--){
            if(a % i == 0 && b % i == 0){
                return i;
            }
        }
        return 1;
    }
    public static void prov(){
    Scanner sc = new Scanner(System.in);
    while(true) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (obDel(a, b) != 1) {
            System.out.println("Trulio");
        }
    }
}
}



class Main
{
    public static void main (String[] args) throws java.lang.Exception {
        System.out.printf("%.2f", (double)189 / 101);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String num = sc.nextLine();
            int cel = 0;
            int delim = 0;
            if (num.indexOf('.') < 0) {
                cel = Integer.parseInt(num);
                delim = 1;
            } else {
                delim = (int) Math.pow(10, num.split("\\.")[1].length());
                cel = (int) (Double.parseDouble(num) * delim);
            }
            int obDel = obDel(cel, delim);
            System.out.println((cel / obDel) + " " + (delim / obDel));

        }
    }



    public static int obDel(int a, int b){
        int max = 1;
        for(int i = 1; i < Math.sqrt(b); i++) {
            if (b % i == 0) {
                if (a % i == 0) {
                    max = Math.max(max, i);
                }
                if ((a % (b / i) == 0)) {
                    max = Math.max(max, b / i);
                }
            }
        }
        return max;
    }
}