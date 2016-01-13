package paevik.toodet;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import paevik.Punnid;

import java.util.List;

/**
 * Created by Polina on 12.01.2016.
 */
public class ProteinToodetLisaja extends ToodetLisaja {

    private Punnid[] punnidArrays = new Punnid[] {
            new Punnid("liha (kana, veis, väherasvane siga jt) 30 g", 0),
            new Punnid("kala (heik, lest jt väherasvased) 60 g", 0),
            new Punnid("kodujuust 80 g", 0),
            new Punnid("kohupiim < 10 % rasva, 80 g", 0),
            new Punnid("vähk, krabi, krabipulk, 30 g", 0),
            new Punnid("vorst, poolfabrikaadid, 30 g", 0),
            new Punnid("muna, 1 tk", 0)
    };

    public ProteinToodetLisaja(GridPane grid) {
        super(grid);
    }

    @Override
    public void lisaToodet(List<Punnid> punnidList, int column) {
        int row = 2;

        grid.add(new Label("Proteiinid"), column, row++);
        grid.add(new Label("3 portsu"), column, row++);

        for (Punnid punn : punnidArrays) {
            grid.add(punn, column, row++);
            punnidList.add(punn);
        }
    }
}
