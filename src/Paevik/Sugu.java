package paevik;

import javafx.scene.control.CheckBox;

/**
 * Created by Polina on 19.12.2015.
 */
public class Sugu extends CheckBox {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public Sugu (String text, int value) {
        super(text);
        this.value = value;
    }



    public Sugu (String text) {
        super(text);
    }
}
