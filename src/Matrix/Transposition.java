package Matrix;

import java.util.ArrayList;

public class Transposition{
    public static void main(String[] args) {
        ArrayList<double[]> array = new ArrayList<>();
        array.add(new double[]{6, 3, 3, 4});
        array.add(new double[]{8, 7, 3, 4});
        array.add(new double[]{54, 20, 3, 4});
        double p[][] = transposition(array);
        for (int i = 0; i < p.length; i++){
            for(int j = 0; j < p[0].length; j++){
                System.out.print(p[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static double[][] transposition(ArrayList<double[]> arr){
        double newArray[][] = new double[arr.get(0).length][arr.size()];
        for(int j = 0; j < newArray.length; j++){
            for(int i = 0; i < newArray[0].length; i++){
                newArray[j][i] = arr.get(i)[j];
            }
        }
        return newArray;
    }
}
