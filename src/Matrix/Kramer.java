package Matrix;

public class Kramer {
    public static void main(String[] args) {
        double[][] newMatr = new double[][]{
                {3, -1, 1},
                {5, 1, 2},
                {1, 2, 4}

        };
        double[] matrB = new double[]{-11, 8, 16};
        double[] res = kramer(newMatr, matrB);
        for(double k : res){
            System.out.println(k);
        }
    }
    public static double[] kramer(double[][] matrA, double[] matrB){
        if(matrA.length == matrA[0].length){
            double mainDet = Determinant.determinant(matrA);
            if (mainDet != 0){
                double[] variables = new double[matrA.length];
                for(int i = 0; i < matrA.length; i++){
                    double[][] newMatr = new double[matrA.length][matrA.length];
                    for(int k = 0; k < newMatr.length; k++){
                        for(int j = 0; j < newMatr.length; j++) {
                            newMatr[k][j] = matrA[k][j];
                        }

                    }
                    for(int j = 0; j < matrA.length; j++){
                        newMatr[j][i] = matrB[j];
                    }

                    double a = Determinant.determinant(newMatr);
                    double b = mainDet;

                    if(a == 0 || b == 0){
                        variables[i] = 0;
                    }
                    else{
                        variables[i] = a / b;
                    }

                }
                return variables;
            }

            return new double[0];
        }
        else{
            return new double[0];
        }

    }
}
