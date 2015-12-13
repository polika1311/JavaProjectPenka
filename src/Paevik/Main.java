package Paevik;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by Polina on 6.12.2015.
 */
public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        new LoginScreen();
    }
}





