package paevik;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import paevik.toodet.*;

import java.util.ArrayList;
import java.util.List;

public class ToiduPaevikScreen {

    Button calcButton;
    Button exitButton;
    Button clearButton;

    Label resultLabel;
    Label resultLabel1;
    Label resultLabel2;
    Label resultLabel3;
    Label resultLabel4;

    private List<Sugu> suguArrayList = new ArrayList<>();
    private List<Punnid> punnidArrayList = new ArrayList<>();
    Stage primaryStage = new Stage();


    public ToiduPaevikScreen() {
        setupScene();

    }

    private void setupNupp(GridPane grid) {
        calcButton = new Button("Arvuta");
        grid.add(calcButton, 5, 9);
        exitButton = new Button("Sulge");
        grid.add(exitButton, 5, 10);
        clearButton = new Button("Tühista valiku");
        grid.add(clearButton, 5, 11);

        calcButton.setOnAction((event) -> {
            calculate();
        });


        exitButton.setOnAction((event1) -> {
            primaryStage.close();
        });

        clearButton.setOnAction((event2) -> {
            for (Punnid box : punnidArrayList) {
                box.setSelected(false);
                resultLabel1.setText(null);
                resultLabel2.setText(null);
                resultLabel.setText(null);
            }
            for (Sugu sugu : suguArrayList) {
                sugu.setSelected(false);
                sugu.setGraphic(null);
                resultLabel3.setText(null);
                resultLabel4.setText(null);

            }

        });
    }


    private void setupScene() {
        resultLabel = new Label();
        resultLabel1 = new Label();
        resultLabel2 = new Label();
        resultLabel3 = new Label();
        resultLabel4 = new Label();

//https://docs.oracle.com/javafx/2/ui_controls/radio-button.htm
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 1200, 900);

        grid.setPadding(new Insets(10, 10, 10, 10)); //tekitab 10pixelise ääre ümber
        grid.setVgap(15);//tekitab vertikaalselt vahed
        grid.setHgap(15); //horisontaalselt vahed

        grid.add(new Label("Tere kaalujälgija!"), 0, 0);

        new PiimaToodetToodetLisaja(grid).lisaToodet(punnidArrayList, 0);
        new TeraViljadToodetLisaja(grid).lisaToodet(punnidArrayList, 1);
        new FatToodetLisaja(grid).lisaToodet(punnidArrayList, 2);
        new ProteinToodetLisaja(grid).lisaToodet(punnidArrayList, 3);
        new FruitToodetLisaja(grid).lisaToodet(punnidArrayList, 4);

        setupSuguBoksid(grid);

        setupNupp(grid);

        grid.getChildren().addAll(resultLabel, resultLabel1, resultLabel2, resultLabel3, resultLabel4);

        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void setupSuguBoksid(GridPane grid) {
        Sugu meesSuguBox = new Sugu("Mees", 2000);
        grid.add(meesSuguBox, 3, 14);
        suguArrayList.add(meesSuguBox);
        Sugu naineSuguBox = new Sugu("Naine", 1800);
        grid.add(naineSuguBox, 3, 15);
        suguArrayList.add(naineSuguBox);

        naineSuguBox.setOnAction((event3) -> {
            naineSuguBox.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("woman.png"), 50, 50, false, false)));
            naineSuguBox.setText(null);
            meesSuguBox.setSelected(false);
            meesSuguBox.setGraphic(null);
            meesSuguBox.setText("Mees");
            resultLabel3.setText("Sinu lubatud päevanorm on 1800 kcal");
            GridPane.setConstraints(resultLabel3, 4, 15);
            resultLabel4.setText(null);
        });
        meesSuguBox.setOnAction((event4 -> {
            meesSuguBox.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("man.png"), 50, 50, false, false)));
            naineSuguBox.setSelected(false);
            naineSuguBox.setText("Naine");
            naineSuguBox.setGraphic(null);
            meesSuguBox.setText(null);
            resultLabel4.setText("Sinu lubatud päevanorm on 2000 kcal");
            GridPane.setConstraints(resultLabel4, 4, 14);
            resultLabel3.setText(null);
        }));

    }



    private void calculate() {
        int kogus = 0;
        for (Sugu sugu : suguArrayList) {
            if (sugu.isSelected()) {
                kogus = kogus + sugu.getValue();
                resultLabel2.setText(null);
            }

        }
        int total = 0;
        int jaak = 0;
        int jaakule = 0;

        for (Punnid box : punnidArrayList) {
            if (box.isSelected()) {
                total = total + box.getValue();
                jaak = kogus - total;
                jaakule = total - kogus;

                if (total < kogus) {
                    resultLabel.setText("Sa oled tarbinud " + total + "kcal");
                    GridPane.setConstraints(resultLabel, 1, 14);
                    resultLabel1.setText("Sa võid veel süüa " + jaak + "kcal");
                    GridPane.setConstraints(resultLabel1, 1, 15);
                    resultLabel2.setText(null);
                } else {
                    resultLabel.setText("Sa oled tarbinud - " + total + "kcal");
                    GridPane.setConstraints(resultLabel, 1, 14);
                    resultLabel2.setText("Sa ületasid oma päevanormi - " + jaakule + "kcal");
                    GridPane.setConstraints(resultLabel2, 1, 16);
                    resultLabel1.setText(null);
                }


            }
        }
        if (kogus == 0) {
            resultLabel2.setText(null);
        }

    }
}










