/**
 * Created by Polina on 19.01.2016.
 */
public class Matriks1 {
        public static void main(String[] args){



            String[][] trrr = {
                    {"1", "2", "3", "4"},
                    {"2", "2", "3", "4"},
                    {"3", "2", "3", "4"},
                    {"4", "2", "3", "4"}};

            printMatrix(trrr);

        }

        public static int[][] generateMatrix(int width, int heigth){
            int[][] matrix = new int[27][27];
            for(int i = 0; i < width; i++){
                for (int j = 0; j < heigth; j++){
                    matrix[i][j] = (int) (Math.random()*27);
                }
            }
            return matrix;
        }

    public static void printMatrix(String[][] matrix){
            for (String[] row : matrix){
                for (String col : row){
                    System.out.printf("%s ", col);
                }
                System.out.println();
            }
        }
    }

