/**
 * Created by Polina on 19.01.2016.
 */
public class ZigZag {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix(10);

        printMatrix(matrix);

    }

    private static int[][] generateMatrix(final int size) {

        int[][] matrix = new int[size][size];
        int i = 1;
        int j = 1;
        for (int element = 0; element < size * size; element++) {
            matrix[i - 1][j - 1] = element;
            if ((i + j) % 2 == 0) {
                // Even stripes
                if (j < size)
                    j++;
                else
                    i += 2;
                if (i > 1)
                    i--;
            } else {
                // Odd stripes
                if (i < size)
                    i++;
                else
                    j += 2;
                if (j > 1)
                    j--;
            }
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix){
            for (int col : row){
                System.out.printf("%10d ", col);
            }
            System.out.println();
        }
    }
}




