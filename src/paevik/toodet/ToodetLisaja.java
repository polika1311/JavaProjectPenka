package paevik.toodet;

import javafx.scene.layout.GridPane;
import paevik.Punnid;

import java.util.List;

/**
 * Created by Polina on 12.01.2016.
 */
public abstract class ToodetLisaja {

    protected GridPane grid;

    public ToodetLisaja(GridPane grid) {
        this.grid = grid;
    }

    public abstract void lisaToodet(List<Punnid> punnidList, int column);

}
