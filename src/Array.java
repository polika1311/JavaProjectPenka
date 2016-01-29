import java.util.Arrays;

/**
 * Created by Polina on 29.01.2016.
 */
public class Array {
    public static void main(String[] args) {


        int[] res = veeruMaxid(new int[][]{{1, 2, 6}, {4, 7, 5}});

    }
    private static int[] veeruMaxid(int[][] m) {
        int koigePikkem=0;
        for (int i = 0; i <m.length ; i++) {
            if ( m [i]. length > koigePikkem){
                koigePikkem=m[i].length;
            }
        }

        int uusMassiv[]= new int [koigePikkem];
        for (int i = 0; i < uusMassiv.length ; i++) {
           // uusMassiv=res;

        }
        for (int i = 0; i < m.length ; i++) {
            for (int j = 0; j <m[i].length ; j++) {
                uusMassiv [j]=Math.max(m[i] [j], uusMassiv[j]);

            }
        }
        return uusMassiv;
    }

}
