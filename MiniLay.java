package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.text.Font;

public class MiniLay extends Application{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }
    Font font = new Font("SansSerif", 30);
    Font font2 = new Font("SansSerif", 20);
    Button knappPlus;
    Button knappMinus;
    Button knappMulti;
    Button knappDela;
    Button knappComma;
    Button knappLika;
    Button knapp0;
    Button knapp1;
    Button knapp2;
    Button knapp3;
    Button knapp4;
    Button knapp5;
    Button knapp6;
    Button knapp7;
    Button knapp8;
    Button knapp9;
    Stage stage;
    Scene scene;
    BorderPane mainLayout;

    @Override
    public void start(Stage primaryStage) throws Exception {
        stage=primaryStage;

        knappComma = new Button(",");
        knappComma.setMinSize(75, 75);
        knappComma.setFont(font);
        knapp0 = new Button("0");
        knapp0.setMinSize(75, 75);
        knapp0.setFont(font);
        knappLika = new Button("=");
        knappLika.setMinSize(75, 75);
        knappLika.setFont(font);
        knappDela = new Button("/");
        knappDela.setMinSize(75, 75);
        knappDela.setFont(font2);

        knapp1 = new Button("1");
        knapp1.setMinSize(75, 75);
        knapp1.setFont(font2);
        knapp2 = new Button("2");
        knapp2.setMinSize(75, 75);
        knapp2.setFont(font2);
        knapp3 = new Button("3");
        knapp3.setMinSize(75, 75);
        knapp3.setFont(font2);
        knappPlus = new Button("+");
        knappPlus.setMinSize(75, 75);
        knappPlus.setFont(font);

        knapp4 = new Button("4");
        knapp4.setMinSize(75, 75);
        knapp4.setFont(font2);
        knapp5 = new Button("5");
        knapp5.setMinSize(75, 75);
        knapp5.setFont(font2);
        knapp6 = new Button("6");
        knapp6.setMinSize(75, 75);
        knapp6.setFont(font2);
        knappMinus = new Button("-");
        knappMinus.setMinSize(75, 75);
        knappMinus.setFont(font);

        knapp7 = new Button("7");
        knapp7.setMinSize(75, 75);
        knapp7.setFont(font2);
        knapp8 = new Button("8");
        knapp8.setMinSize(75, 75);
        knapp8.setFont(font2);
        knapp9 = new Button("9");
        knapp9.setMinSize(75, 75);
        knapp9.setFont(font2);
        knappMulti = new Button("*");
        knappMulti.setMinSize(75, 75);
        knappMulti.setFont(font);

        mainLayout = new BorderPane();

        HBox box1 = new HBox(knapp1,knapp2,knapp3,knappPlus);
        box1.setMinSize(75, 75);
        HBox box2 = new HBox(knapp4,knapp5,knapp6,knappMinus);
        box2.setMinSize(75, 75);
        HBox box3 = new HBox(knapp7,knapp8,knapp9,knappMulti);
        box3.setMinSize(75, 75);
        HBox box4 = new HBox(knappComma,knapp0,knappLika,knappDela);
        box4.setMinSize(75, 75);

        VBox box = new VBox(box1,box2,box3,box4);
        box.setMinSize(300, 300);
        mainLayout.setCenter(box);

        TextField field = new TextField();
        field.setMinSize(300, 50);
        mainLayout.setTop(field);

        //Creating a scene object
        scene = new Scene(mainLayout, 300, 350);
        //Setting title to the Stage
        stage.setTitle("Miniräknare");

        stage.setScene(scene);

        stage.show();
    }

}
