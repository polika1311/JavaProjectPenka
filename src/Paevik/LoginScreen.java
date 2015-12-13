package Paevik;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

import static javafx.scene.control.CheckBox.*;

public class LoginScreen {
    Button button;
    Button button1;
    Button button2;
    Label resultLabel;
    Label resultLabel1;
    Label resultLabel2;
    ListView<String> listView;
    private List<Punnid> intValueCheckboxList = new ArrayList<>();
    Stage primaryStage = new Stage();


    LoginScreen() {
        setupScene();
        setupNupp();


    }

    private void setupNupp() {
        button.setOnAction((event) -> {
            calculate();
        });


        button1.setOnAction((event1) -> {
            primaryStage.close();
        });

        button2.setOnAction ((event2) -> {
            for (Punnid box : intValueCheckboxList) {
                box.setSelected(false);
                resultLabel1.setText(null);
                resultLabel2.setText(null);
                resultLabel.setText(null);
            }
        });

    }


    private void setupScene() {
        resultLabel = new Label();
        resultLabel1 = new Label();
        resultLabel2 = new Label();

        CheckBox box37=new CheckBox("Naine");
        GridPane.setConstraints(box37, 0, 13);
        CheckBox box38 =new CheckBox("Mees");
        GridPane.setConstraints(box38, 0, 14);


        GridPane grid = new GridPane();

        Scene scene = new Scene(grid, 1200, 600);
        grid.setPadding(new Insets(10, 10, 10, 10)); //tekitab 10pixelise ääre ümber
        grid.setVgap(10);//tekitab vertikaalselt vahed
        grid.setHgap(10); //horisontaalselt vahed

        Label tervitus = new Label("Tere kaalujälgija!");
        GridPane.setConstraints(tervitus, 0, 0);//seab sildi esimesse tulpa ja esimesse lahtrisse


        Label Piimatooted = new Label("Piimatooted");
        GridPane.setConstraints(Piimatooted, 0, 2);//esimene on tulba, teine rea number
        Label Piim = new Label("2 portsu");
        GridPane.setConstraints(Piim, 0, 3);

        Punnid box1 = new Punnid("Rasvata piim, 300 ml", 150);
        intValueCheckboxList.add(box1);
        GridPane.setConstraints(box1, 0, 4);
        Punnid box2 = new Punnid("1% piim, 200 ml",100);
        intValueCheckboxList.add(box2);
        GridPane.setConstraints(box2, 0, 5);
        Punnid box3 = new Punnid("2,5% piim, 200 ml");
        intValueCheckboxList.add(box3);
        GridPane.setConstraints(box3, 0, 6);
        Punnid box4 = new Punnid("1% keefiir, 200 ml");
        intValueCheckboxList.add(box4);
        GridPane.setConstraints(box4, 0, 7);
        Punnid box5 = new Punnid("2,5% keefir, 100 ml",33);
        intValueCheckboxList.add(box5);
        GridPane.setConstraints(box5, 0, 8);
        Punnid box6 = new Punnid("jogurt (<100 cal), 100 ml");
        intValueCheckboxList.add(box6);
        GridPane.setConstraints(box6, 0, 9);

        Label teraviljatooted = new Label("Teraviljatooted");
        GridPane.setConstraints(teraviljatooted, 1, 2);
        Label tera = new Label("4 portsu");
        GridPane.setConstraints(tera, 1, 3);

        Punnid box7 = new Punnid("leib, keskmine viil, 30 g");
        intValueCheckboxList.add(box7);
        GridPane.setConstraints(box7, 1, 4);
        Punnid box8 = new Punnid("makaronid keedetud, 100 ml");
        intValueCheckboxList.add(box8);
        GridPane.setConstraints(box8, 1, 5);
        Punnid box9 = new Punnid("puder (riis, tatar, manna jt) 100 ml");
        intValueCheckboxList.add(box9);
        GridPane.setConstraints(box9, 1, 6);
        Punnid box10 = new Punnid("helbed (kaera, riisi jne) 75 ml");
        intValueCheckboxList.add(box10);
        GridPane.setConstraints(box10, 1, 7);
        Punnid box11 = new Punnid("müsli, 3 spl");
        intValueCheckboxList.add(box11);
        GridPane.setConstraints(box11, 1, 8);
        Punnid box12 = new Punnid("herned (toored, konserv) 120 g");
        intValueCheckboxList.add(box12);
        GridPane.setConstraints(box12, 1, 9);
        Punnid box13 = new Punnid("mais (toores, konserv) 80 g");
        intValueCheckboxList.add(box13);
        GridPane.setConstraints(box13, 1, 10);
        Punnid box14 = new Punnid("kartul 2 pisikest v 1 keskmine");
        intValueCheckboxList.add(box14);
        GridPane.setConstraints(box14, 1, 11);

        Label rasvad = new Label("Rasvad");
        GridPane.setConstraints(rasvad, 2, 2);
        Label rasv = new Label("2 portsu");
        GridPane.setConstraints(rasv, 2, 3);

        Punnid box15 = new Punnid("majonees, 1 tl");
        intValueCheckboxList.add(box15);
        GridPane.setConstraints(box15, 2, 4);
        Punnid box16 = new Punnid("taimeõli, 1 tl");
        intValueCheckboxList.add(box16);
        GridPane.setConstraints(box16, 2, 5);
        Punnid box17 = new Punnid("pähklid 7g, ca 5tk");
        intValueCheckboxList.add(box17);
        GridPane.setConstraints(box17, 2, 6);
        Punnid box18 = new Punnid("juust, 30 g");
        intValueCheckboxList.add(box18);
        GridPane.setConstraints(box18, 2, 7);


        Label proteiinid = new Label("Proteiinid");
        GridPane.setConstraints(proteiinid, 3, 2);
        Label prot = new Label("3 portsu");
        GridPane.setConstraints(prot, 3, 3);

        Punnid box19 = new Punnid("liha (kana, veis, väherasvane siga jt) 30 g");
        intValueCheckboxList.add(box19);
        GridPane.setConstraints(box19, 3, 4);
        Punnid box20 = new Punnid("kala (heik, lest jt väherasvased) 60 g");
        intValueCheckboxList.add(box20);
        GridPane.setConstraints(box20, 3, 5);
        Punnid box21 = new Punnid("kala (angerjas, lõhe, räim, suitsukala) 30 g");
        intValueCheckboxList.add(box21);
        GridPane.setConstraints(box21, 3, 6);
        Punnid box22 = new Punnid("kodujuust 80 g");
        intValueCheckboxList.add(box22);
        GridPane.setConstraints(box22, 3, 7);
        Punnid box23 = new Punnid("kohupiim < 10 % rasva, 80 g");
        intValueCheckboxList.add(box23);
        GridPane.setConstraints(box23, 3, 8);
        Punnid box24 = new Punnid("vähk, krabi, krabipulk, 30 g");
        intValueCheckboxList.add(box24);
        GridPane.setConstraints(box24, 3, 9);
        Punnid box25 = new Punnid("vorst, poolfabrikaadid, 30 g");
        intValueCheckboxList.add(box25);
        GridPane.setConstraints(box25, 3, 10);
        Punnid box26 = new Punnid("muna, 1 tk");
        intValueCheckboxList.add(box26);
        GridPane.setConstraints(box26, 3, 11);

        Label puuviljad = new Label("Puuviljad");
        GridPane.setConstraints(puuviljad, 4, 2);
        Label puuv = new Label("3 portsu");
        GridPane.setConstraints(puuv, 4, 3);

        Punnid box27 = new Punnid("apelsin, 1 keskmine");
        intValueCheckboxList.add(box27);
        GridPane.setConstraints(box27, 4, 4);
        Punnid box28 = new Punnid("banaan, 1/2");
        intValueCheckboxList.add(box28);
        GridPane.setConstraints(box28, 4, 5);
        Punnid box29 = new Punnid("greip, 1/2");
        intValueCheckboxList.add(box29);
        GridPane.setConstraints(box29, 4, 6);
        Punnid box30 = new Punnid("kiivi, 1 tk");
        intValueCheckboxList.add(box30);
        GridPane.setConstraints(box30, 4, 7);
        Punnid box31 = new Punnid("õun, 1 keskmine");
        intValueCheckboxList.add(box31);
        GridPane.setConstraints(box31, 4, 8);
        Punnid box32 = new Punnid("viinamarjad 100 g");
        intValueCheckboxList.add(box32);
        GridPane.setConstraints(box32, 4, 9);
        Punnid box33 = new Punnid("nektariin, 1 keskmine");
        intValueCheckboxList.add(box33);
        GridPane.setConstraints(box33, 4, 10);
        Punnid box34 = new Punnid("pirn, 1 keskmine");
        intValueCheckboxList.add(box34);
        GridPane.setConstraints(box34, 4, 11);
        Punnid box35 = new Punnid("ploom, 3 keskmist");
        intValueCheckboxList.add(box35);
        GridPane.setConstraints(box35, 4, 12);
        Punnid box36 = new Punnid("marjad 120 g");
        intValueCheckboxList.add(box36);
        GridPane.setConstraints(box36, 4, 13);



        button = new Button("Arvuta");
        GridPane.setConstraints(button, 1, 14);

        button1 = new Button("Sulge");
        GridPane.setConstraints(button1, 1, 16);

        button2 = new Button("Tühista valiku");
        GridPane.setConstraints(button2, 1, 15);


        grid.getChildren().addAll(tervitus, Piimatooted, Piim, box1, box2, box3, box4, box5, box6, teraviljatooted,
                tera, box7, box8, box9, box10, box11, box12, box13, box14, rasvad, rasv, box15, box16, box17, box18,
                proteiinid, prot, box19, box20, box21, box22, box23, box24, box25, box26, puuviljad, puuv, box27, box28,
                box29, box30, box31, box32, box33, box34, box35, box36,box37,box38, resultLabel, resultLabel1, resultLabel2,
                button, button1, button2);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    private void calculate() {
        int total = 0;
        int kogus = 2000;
        int jaak = 0;
        int jaakule = 0;

        for (Punnid box : intValueCheckboxList) {
            if (box.isSelected()) {
                total = total + box.getValue();
                jaak = kogus - total;
                jaakule = total - kogus;

                if (total < kogus) {
                    resultLabel.setText("Sa oled tarbinud " + total + "kcal");
                    GridPane.setConstraints(resultLabel, 1, 17);
                    resultLabel1.setText("Sa võid veel süüa " + jaak + "kcal");
                    GridPane.setConstraints(resultLabel1, 1, 18);
                } else {
                    resultLabel.setText("Sa oled tarbinud - " + total + "kcal");
                    GridPane.setConstraints(resultLabel, 1, 17);
                    resultLabel2.setText("Sa ületsid oma päevanormi - " + jaakule + "kcal");
                    GridPane.setConstraints(resultLabel2, 1, 18);
                    resultLabel1.setText(null);
                }


            }
        }
    }
}






