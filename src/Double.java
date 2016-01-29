import java.util.Arrays;

/**
 * Created by Polina on 29.01.2016.
 */
public class Double {
    public static void main(String[] args) {
        System.out.println(result (new double[] {0.,1.,2.,3.,4.}));
    }

    private static double result(double[] marks) {
        double [] mingi=new double[marks.length];
        for (int i = 0; i <marks.length; i++) {
            mingi[i] = marks[i];
        }
        Arrays.sort(mingi);
        double sum=0;
        double vastus;
        for (int i = 0; i < mingi.length-1; i++) {
            sum += mingi[i];
        }
        vastus=sum/(mingi.length-2);
        return vastus;

    }


}
