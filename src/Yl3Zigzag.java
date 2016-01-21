/**
 * Created by Polina on 21.01.2016.
 */
public class Yl3Zigzag {
    public static void main(String[] args) {
        int multi = 0;
        for (int i = 0; i < 100; i++) {

            if ((i % 18 == 0) && (i != 0))
                multi = multi + 2;

            for (int j = 0; j < 10; j++) {

                if ((i - (9 * multi)) == j || j==((18 + 9 * multi)-i))
                    System.out.printf("x ");
                else
                    System.out.printf("0 ");
            }

            System.out.println();

        }

    }
}






