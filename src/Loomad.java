/**
 * Created by Polina on 23.01.2016.
 */


    public class Loomad {
        static public void main (String[] argumendid) {
            System.out.println ("Mida loomad ytlevad?");
            Loom minuLoom = new Loom ("Patu");
            System.out.println (minuLoom); //kasutab toString() meetodit
            Kass minuKass = new Kass ("Kiti");
            System.out.println (minuKass);
            minuLoom = minuKass;
            System.out.println (minuLoom);
        } //main lopp

    } //Loomad lopp

    class Loom {

        private String nimi;

        Loom (String s) { //konstruktor
            paneNimi (s);
        }

        public String votaNimi() {
            return nimi;
        }


        public void paneNimi (String s) {
            nimi = s;
        }

        public String toString() { //katame yle
            return "Olen loom " + votaNimi();
        }

    } // Loom lopp


    class Kass extends Loom { //alamklass

        private int vurrupikkus;

        Kass (String s) {
            super (s);
        }

        public String toString() { //katame kaetu veel yle
            return "Olen KASS " + votaNimi();
        }

    } // Kass lopp

