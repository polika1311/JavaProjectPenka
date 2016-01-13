package paevik.toodet;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import paevik.Punnid;

import java.util.List;

/**
 * Created by Polina on 12.01.2016.
 */
public class FatToodetLisaja extends ToodetLisaja {

    private Punnid[] punnidArrays = new Punnid[] {
            new Punnid("majonees, 1 tl", 0),
            new Punnid("taimeõli, 1 tl", 0),
            new Punnid("pähklid 7g, ca 5tk", 0),
            new Punnid("juust, 30 g", 0)
    };

    public FatToodetLisaja(GridPane grid) {
        super(grid);
    }

    @Override
    public void lisaToodet(List<Punnid> punnidList, int column) {
        int row = 2;

        grid.add(new Label("Rasvad"), column, row++);
        grid.add(new Label("2 portsu"), column, row++);

        for (Punnid punn : punnidArrays) {
            grid.add(punn, column, row++);
            punnidList.add(punn);
        }
    }
}
