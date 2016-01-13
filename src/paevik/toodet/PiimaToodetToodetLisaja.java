package paevik.toodet;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import paevik.Punnid;

import java.util.List;

/**
 * Created by Polina on 12.01.2016.
 */
public class PiimaToodetToodetLisaja extends ToodetLisaja {

    private Punnid[] punnidArrays = new Punnid[] {
            new Punnid("Rasvata piim, 300 ml", 0),
            new Punnid("1% piim, 200 ml", 0),
            new Punnid("2,5% piim, 200 ml", 0),
            new Punnid("1% keefiir, 200 ml", 0),
            new Punnid("2,5% keefir, 100 ml", 0),
            new Punnid("jogurt (<100 cal), 100 ml", 0)
    };

    public PiimaToodetToodetLisaja(GridPane grid) {
        super(grid);
    }

    @Override
    public void lisaToodet(List<Punnid> punnidList, int column) {
        int row = 2;

        grid.add(new Label("Piimatooted"), column, row++);
        grid.add(new Label("2 portsu"), column, row++);

        for (Punnid punn : punnidArrays) {
            grid.add(punn, column, row++);
            punnidList.add(punn);
        }
    }
}
