import javafx.application.Application;
import javafx.beans.binding.StringExpression;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Polina on 19.01.2016.
 */
public class MyElipse extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        changecolor();

    }

    private void changecolor() {
        Stage lava = new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 500, 500);
        lava.setScene(stseen);

        String defaultColor = "red";

        Ellipse ellipse = new Ellipse(55, 78);
        ellipse.setCenterX(160);
        ellipse.setCenterY(160);
        pane.getChildren().add(ellipse);
        ellipse.setFill(Color.valueOf(defaultColor));

        ObservableList<String> options =
                FXCollections.observableArrayList(
                        defaultColor,
                        "blue",
                        "green"
                );
        final ComboBox colorSelectBox = new ComboBox(options);
        colorSelectBox.setValue(defaultColor);
        colorSelectBox.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue ov, String t, String t1) {
                ellipse.setFill(Color.valueOf(t1));
            }
        });

        pane.getChildren().add(colorSelectBox);


            lava.show();
        }


    }








