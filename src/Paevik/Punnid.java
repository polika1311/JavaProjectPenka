package paevik;

import javafx.scene.control.CheckBox;

/**
 * Created by Polina on 6.12.2015.
 */
public class Punnid extends CheckBox {

    private int value;


    public int getValue() {
        return value;
    }

    public Punnid (String text, int value) {
        super(text);
        this.value = value;
    }

    public Punnid (String text) {
        super(text);
    }
}
