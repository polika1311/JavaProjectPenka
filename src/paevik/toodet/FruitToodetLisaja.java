package paevik.toodet;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import paevik.Punnid;

import java.util.List;

/**
 * Created by Polina on 12.01.2016.
 */
public class FruitToodetLisaja extends ToodetLisaja {

    private Punnid[] punnidArrays = new Punnid[] {
            new Punnid("apelsin, 1 keskmine", 0),
            new Punnid("banaan, 1/2", 0),
            new Punnid("greip, 1/2", 0),
            new Punnid("õun, 1 keskmine", 0),
            new Punnid("viinamarjad, 100g", 0),
            new Punnid("nektariin,1 keskmine", 0),
            new Punnid("pirn, 1 keskmine", 0),
            new Punnid("ploom, 3 kesmist", 0),
            new Punnid("marjad, 120g", 0),
            new Punnid("kiivi,1 tk", 0)
    };

    public FruitToodetLisaja(GridPane grid) {
        super(grid);
    }


    @Override
    public void lisaToodet(List<Punnid> punnidList, int column) {
        int row = 2;

        grid.add(new Label("Puuviljad"), column, row++);
        grid.add(new Label("3 portsu"), column, row++);

        for (Punnid punn : punnidArrays) {
            grid.add(punn, column, row++);
            punnidList.add(punn);
        }
    }
}
