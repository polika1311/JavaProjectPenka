import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * Created by Polina on 20.01.2016.
 */
public class Lause extends Application{
     Label label3 = new Label();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage lava=new Stage();
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 200, 300);

        TextField inputText = new TextField();
        inputText.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                label3.setText(newValue);
            }
        });


        grid.add(inputText, 0, 0);
        grid.add(label3, 0, 1);
        lava.setScene(scene);
        lava.show();
    }
    }

