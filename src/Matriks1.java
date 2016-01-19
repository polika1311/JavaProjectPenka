/**
 * Created by Polina on 19.01.2016.
 */
public class Matriks1 {
        public static void main(String[] args){

            int[][] matrix = generateMatrix(6, 6);

            printMatrix(matrix);
        }

        public static int[][] generateMatrix(int width, int heigth){
            int[][] matrix = new int[width][heigth];
            for(int i = 0; i < width; i++){
                for (int j = 0; j < heigth; j++){
                    matrix[i][j] = (int) (Math.random()*9);
                }
            }
            return matrix;
        }

        public static void printMatrix(int[][] matrix){
            for (int[] row : matrix){
                for (int col : row){
                    System.out.printf("%1d ", col);
                }
                System.out.println();
            }
        }
    }

