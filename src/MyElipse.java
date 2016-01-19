import javafx.application.Application;
import javafx.beans.binding.StringExpression;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

        Ellipse punane = new Ellipse(55, 78);
        punane.setCenterX(160);
        punane.setCenterY(160);
        pane.getChildren().add(punane);
        Scanner sc = new Scanner(System.in);
        String varv = sc.next();
        punane.setFill(Color.valueOf(varv));

            lava.show();
        }


    }








