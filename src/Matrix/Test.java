package Matrix;

public class Test {
    public static void main(String[] args) {
        String[][] arr = new String[20][20];
        for(int y = 0; y < 20; y++){
            for(int x = 0; x < 20; x++){
                if(y == 10 || x == 10){
                    if(x == 10){
                        if(y == 0){
                            arr[y][x] = "y";
                        }
                        else{
                            arr[y][x] = "|";
                        }
                    }
                    if(y == 10){
                        if(x == 19){
                            arr[y][x] = "x";
                        }
                        else{
                            arr[y][x] = "--";
                        }
                    }
                }

                else {
                    if(x == y && x != 0){
                        arr[arr.length - y][arr.length - x] = "*";
                    }
                    else{
                        arr[y][x] = " ";
                    }

                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println(" ");
        }

    }
}
