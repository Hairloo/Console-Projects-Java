package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {
        double[][] test = new double[][]{
                {5, -4},
                {3, -2}
        };
        double g[][] = reverse(test);
        for(int i = 0; i < 2; i ++){
            for(int j = 0; j < 2; j++){
                System.out.print(g[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

    public static double[][] reverse(double[][] matrix) {
        double[][] res = new double[matrix.length][matrix.length];
        if (matrix.length == matrix[0].length) {
            double[][] result = new double[matrix.length][matrix.length];
            if(matrix.length == 2){
                result[0][0] = matrix[1][1];
                result[1][1] = matrix[0][0];
                result[0][1] = -matrix[0][1];
                result[1][0] = -matrix[1][0];
            }
            else{
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        double p = Determinant.determinant(minor(matrix, j, i));
                        result[i][j] = Math.pow(-1, i + j) * p;
                    }
                }
                List<double[]> t = Arrays.asList(result);
                ArrayList<double[]> b = new ArrayList<>();
                b.addAll(t);
                result = Transposition.transposition(b);
            }
            double det = Determinant.determinant(matrix);
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix.length; j++){
                    res[i][j] = (double)result[i][j] / (double)det;
                }
            }

            return res;
        }
        return new double[0][0];
    }

    public static double[][] minor(double[][] matrix, int k, int s){
        double[][] newMatr = new double[matrix.length - 1][matrix.length - 1];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix.length; j++){
                if(i != s && j != k){
                    if(j < k){
                        if(i > s){
                            newMatr[i - 1][j] = matrix[i][j];
                        }
                        if(i < s){
                            newMatr[i][j] = matrix[i][j];
                        }
                    }
                    if(j > k){
                        if(i > s){
                            newMatr[i - 1][j - 1] = matrix[i][j];
                        }
                        if(i < s){
                            newMatr[i][j - 1] = matrix[i][j];
                        }

                    }

                }
            }
        }
        return newMatr;
    }
}
