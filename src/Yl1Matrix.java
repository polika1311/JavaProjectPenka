import java.security.cert.X509Certificate;

/**
 * Created by Polina on 21.01.2016.
 */
public class Yl1Matrix {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++) {
                if (i == j || j==(9-i))
                    System.out.printf("x ");
                else
                    System.out.printf("0 ");
            }
            System.out.println();
        }
    }


}
