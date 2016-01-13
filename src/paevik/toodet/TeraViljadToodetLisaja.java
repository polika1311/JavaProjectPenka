package paevik.toodet;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import paevik.Punnid;

import java.util.List;

/**
 * Created by Polina on 12.01.2016.
 */
public class TeraViljadToodetLisaja extends ToodetLisaja {

    private Punnid[] punnidArrays = new Punnid[]{
            new Punnid("leib, keskmine viil, 30 g", 0),
            new Punnid("makaronid keedetud, 100 ml", 0),
            new Punnid("puder (riis, tatar, manna jt) 100 ml", 0),
            new Punnid("helbed (kaera, riisi jne) 75 ml", 0),
            new Punnid("herned (toored, konserv) 120 g", 0),
            new Punnid("mais (toores, konserv) 80 g", 0),
            new Punnid("kartul 2 pisikest v 1 keskmine", 0)
    };

    public TeraViljadToodetLisaja(GridPane grid) {
        super(grid);
    }

    @Override
    public void lisaToodet(List<Punnid> punnidList, int column) {
        int row = 2;
        grid.add(new Label("Teraviljatooted"), column, row++);
        grid.add(new Label("4 portsu"), column, row++);

        for (Punnid punn : punnidArrays) {
            grid.add(punn, 1, row++);
            punnidList.add(punn);
        }
    }
}
