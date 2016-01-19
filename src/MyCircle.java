import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

import java.awt.*;
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
            Scene stseen = new Scene(pane);
            lava.setScene(stseen);

            Scanner sc =new Scanner(System.in);
           Double tt = sc.nextDouble();


            Circle punane= new Circle(tt);
            punane.setCenterX(150);
            punane.setCenterY(200);
            pane.getChildren().add(punane);
            punane.setFill(Color.RED);
            lava.show();
        }


    }




