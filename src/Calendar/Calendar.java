package Calendar;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        String [] arr = new SimpleDateFormat("dd-MM").format(java.util.Calendar.getInstance().getTime()).split("-");
        int nowDay = Integer.parseInt(arr[0]);
        int nowMonth = Integer.parseInt(arr[1]);
        //System.out.println(nowMonth + " " + nowDay);
        //ArrayList<int[][]> year = new ArrayList<>();
        int[][][] months = new int[12][6][7];
        int[] flags = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed","Thu", "Fri", "Sat","Sun"};
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int dayOfWeak = 6;
        int day = 0;
        for(int i = 0; i < 12; i++){
            outer:
            for(int j = 0; j < 6; j++){
                for(int k = 0; k < 7; k++){
                    months[i][j][dayOfWeak] = day + 1;
                    dayOfWeak = (dayOfWeak + 1) % 7;

                    day++;
                    if(day + 1 > flags[i]){
                        day = 0;
                        break outer;
                    }
                    if(dayOfWeak == 0){
                        continue outer;
                    }
                    //System.out.println(months[i][j][dayOfWeak]);

                }

            }
        }

        //System.out.println(months[0][0].toString());

        System.out.println(" ");
        for(int k = 0; k < 12; k++){
            System.out.println(month[k] + "-2023:");
            for (int i = 0; i < 7; i++) {
                System.out.print(days[i] + " ");
            }
            System.out.println(" ");
            for(int i = 0; i < 6; i++){
                for (int j = 0; j < 7; j++) {
                    //if(months[0][i][j] == 0)
                    if( months[k][i][j] < 10){
                        if(months[k][i][j] == 0){
                            System.out.print("    ");
                        }

                        else{
                            if(k == 10 && months[k][i][j] == 4 || j == 5 || j == 6){
                                System.out.print( "\u001b[33m" + "0" + months[k][i][j] + "  ");
                            }
                            else{
                                System.out.print("0" + months[k][i][j] + "  ");
                            }

                        }

                    }
                    else{
                        if(k + 1 == nowMonth && months[k][i][j] == nowDay){
                            System.out.print("\u001b[31m" + months[k][i][j] + "  ");
                        }
                        else if(j == 5 || j == 6){
                            System.out.print("\u001b[33m" + months[k][i][j] + "  ");
                        }
                        else{
                            System.out.print("\u001b[0m" + months[k][i][j] + "  ");
                        }



                    }
                }
                System.out.println("\u001b[0m" + "|");
            }
            for(int o = 0; o < 28; o++){
                System.out.print("-");
            }
            System.out.println(" ");
        }

    }
}
