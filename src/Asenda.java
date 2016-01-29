/**
 * Created by Polina on 29.01.2016.
 */
public class Asenda {
    public static void main(String[] args) {
        String s ="Tere, TUDENG,  tore ARVUTI SUL";
        String t=asenda (s);
        System.out.println(s+ " > " + t);
    }
    public static String asenda (String s) {
        String asenda="s";
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isUpperCase(s.charAt(i))) {  //isUpperCasse
                asenda += "-";
            }
            else {
                asenda+=s.charAt(i);
            }


        }
        return asenda;
    }
}
