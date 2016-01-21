import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.TextField;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by Polina on 18.01.2016.
 */
public class MyCircle extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        joonista();
    }

    // private void sisesta() {
    //   Scanner sc = new Scanner(System.in);
    //  String color = sc.  nextLine();
    //Scanner arv =new Scanner(System.in);
    //Double x= arv.nextDouble();
    //Scanner arv1=new Scanner(System.in);
    //Double y=arv1.nextDouble();
    // }

    private void joonista() {
        Stage lava = new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 500, 500);
        lava.setScene(stseen);

        Circle punane = new Circle(50);
        punane.setCenterX(150);
        punane.setCenterY(200);

        javafx.scene.control.TextField inputText = new javafx.scene.control.TextField();
        inputText.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                int value = Integer.parseInt(newValue);
                if (value <= 150 && value > 0)
                    punane.setRadius(value);
            }
        });

        pane.getChildren().add(inputText);
        pane.getChildren().add(punane);
        punane.setFill(Color.RED);
        lava.show();
    }


}




