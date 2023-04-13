package Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/*
-1.0 1.0
-9.0 16.0
-16.0 29.0
 */
/*-1.0 2.0
        -1.5 2.5*/
public class Multiply{
    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<double[]> arr1 = new ArrayList<>();

        int i = 0;
        int count = 0;
        int flag2 = 0;
        while(true){
            String a;

            System.out.print("Pls enter the " + (i + 1) + " stroke of First matrix(If the previous row was the last in the matrix, enter \"q\"): ");
            a = reader.readLine();
            if (a.equals("q")){
                break;
            }
            else{
                String[] h = a.split(" ");
                double array[] = new double[h.length];
                for(int k = 0; k < h.length; k++){
                    array[k] = (Double.parseDouble(h[k]));
                }

                if (count != 0 && h.length != arr1.get(i - 1).length){

                    flag2 = 1;
                    break;
                }
                count++;
                arr1.add(array);
            }
            i++;
        }
        i = 0;
        count = 0;
        ArrayList<double[]> arr2 = new ArrayList<>();
        while(true){
            String a;

            System.out.print("Pls enter the " + (i + 1) + " stroke of Second matrix(If the previous row was the last in the matrix, enter \"q\"): ");
            a = reader.readLine();
            if (a.equals("q")){
                break;
            }
            else{
                String[] h = a.split(" ");
                double array[] = new double[h.length];
                for(int k = 0; k < h.length; k++){
                    array[k] = (Double.parseDouble(h[k]));
                }

                if (count != 0 && h.length != arr2.get(i - 1).length){

                    flag2 = 1;
                    break;
                }
                count++;
                arr2.add(array);
            }
            i++;
        }
        String need;

        if (flag2 == 1){
            System.out.println("You enter not a matrix. Operation is impossible");
        }

        else if (matrix(arr1, arr2) == 0){
            double trs1[][] = Transposition.transposition(arr1);
            double trs2[][] = Transposition.transposition(arr2);
            if(arr1.size() == arr2.size()){
                System.out.println("You enter matrices which are not able to multiply, ");
                System.out.println("but we can transposition first matrix and complete multiply");
                System.out.println("Enter \"y\" if you want or \"n\" if you not want");
                need = reader.readLine();
                if(need.equals("y")){
                    matrix(new ArrayList<double[]>(Arrays.asList(trs1)), arr2);
                }
                if(need.equals("n")){
                    System.out.println("You enter matrices which are not able to multiply");
                }
            }
            if(arr1.get(0).length == arr2.get(0).length){
                System.out.println("You enter matrices which are not able to multiply, ");
                System.out.println("but we can transposition second matrix and complete multiply");
                System.out.println("Enter \"y\" if you want or \"n\" if you not want");
                need = reader.readLine();
                if(need.equals("y")){
                    matrix(arr1, arr2);
                }
                if(need.equals("n")){
                    System.out.println("You enter matrices which are not able to multiply");
                }
            }
            if(arr1.size() == arr2.get(0).length){
                System.out.println("You enter matrices which are not able to multiply, ");
                System.out.println("but we can transposition first and second matrix and complete multiply");
                System.out.println("Enter \"y\" if you want or \"n\" if you not want");
                need = reader.readLine();
                if(need.equals("y")){
                    matrix(new ArrayList<double[]>(Arrays.asList(trs1)), new ArrayList<double[]>(Arrays.asList(trs2)));
                }
                if(need.equals("n")){
                    System.out.println("You enter matrices which are not able to multiply");
                }
            }
            //System.out.println("You enter matrices which are not able to multiply");
        }
        if(flag2 != 1){
            System.out.println("Transposition first matrix: ");
            System.out.println("-----------------------------------");
            double pop[][] = Transposition.transposition(arr1);
            for (int  u= 0; u < pop.length; u++){
                for(int j = 0; j < pop[0].length; j++){
                    System.out.print(pop[u][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println("-----------------------------------");
            System.out.println("Transposition second matrix: ");
            double pop1[][] = Transposition.transposition(arr2);
            for (int u = 0; u < pop1.length; u++){
                for(int j = 0; j < pop1[0].length; j++){
                    System.out.print(pop1[u][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println("-----------------------------------");
        }
        else{
            System.out.println("Transposition is impossible");
        }


    }
    public static double matrix(ArrayList<double[]> arr1, ArrayList<double[]> arr2){
        if (arr1.get(0).length != arr2.size()){
            return 0;
        }
        else{
            double returnMatrix[][] = new double[arr1.size()][arr2.get(0).length];
            for(int i = 0; i < arr1.size(); i++){
                for(int j = 0; j < arr2.get(0).length; j++){
                    for(int k = 0; k < arr2.size(); k++){
                        if(i == 1 && j == 2){
                            System.out.println((arr1.get(i)[k] * arr2.get(k)[j]));
                        }
                        returnMatrix[i][j] += (arr1.get(i)[k] * arr2.get(k)[j]);
                    }

                    if(BigDecimal.valueOf(returnMatrix[i][j]).scale() > 5){
                        returnMatrix[i][j] = Math.round(returnMatrix[i][j]);
                    }
                }
            }
            System.out.println("Result of multiply: ");
            System.out.println("-----------------------------------");
            for(int i = 0; i < returnMatrix.length; i++){
                for(int j = 0; j < returnMatrix[0].length; j++){
                    System.out.print(returnMatrix[i][j] + " ");
                }
                System.out.println(" ");
            }
            System.out.println("-----------------------------------");
            return 1;
        }
    }
}
