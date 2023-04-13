package Matrix;

import java.lang.Math;
public class Determinant {
    public static void main(String[] args) {
        double[][] newMatr = new double[][]{
                {3, -1, 2, -1, 1},
                {5, 1, -2, 1, 2},
                {9, -1, 1, 3, 4},
                {3, 0, 6, -1, 3},
                {5, 2, 3, -2, 1}
        };
        System.out.println(determinant(newMatr));
    }
    public static double determinant(double[][] matrix){
        int det = 0;
        if(matrix.length != matrix[0].length){
            System.out.println("You entered a non-square matrix");
            return 1;
        }
        if (matrix.length == 1){
            return matrix[0][0];
        }
        if (matrix.length == 2){
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        else {
            for(int i = 0; i < matrix[0].length; i++){
                det += Math.pow(-1, i) * matrix[0][i] * determinant(minor(matrix, i, 0));
            }
        }
        return det;
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
