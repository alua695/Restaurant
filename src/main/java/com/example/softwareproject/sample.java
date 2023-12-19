package com.example.softwareproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class sample {
    @FXML
    private VBox vBox;

    @FXML
    private Text text1;

    @FXML
    private Text text2;

    @FXML
    private Text text3;
    @FXML
    private Text total;
    private int totalN = 0;

    @FXML
    private Text amount;

    private int amountN  = 0;
    public Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\SoftwareProject\\src\\main\\resources\\com\\example\\softwareproject\\666.png");




    @FXML
    private ImageView image = new ImageView();


    @FXML
    void add1000(ActionEvent event) {
        image.setImage(img);
        HBox hbox = new HBox();
        Label label = new Label("454");
        hbox.getChildren().add(label);
        hbox.getChildren().add(image);
        vBox.getChildren().add(hbox);
        amountN++;
         text1.setText("Added product to 1000");
         totalN+=1000;
        total.setText("Total is:" + totalN);
        amount.setText(String.valueOf(amountN));


    }

    @FXML
    void add1200text(ActionEvent event) {
        image.setImage(img);
        HBox hbox = new HBox();
        Label label = new Label("666");
        hbox.getChildren().add(label);
        hbox.getChildren().add(image);
        vBox.getChildren().add(hbox);
        text2.setText("Added product for 1200");
        totalN+=1200;
        total.setText("Total is:" + totalN);
    }

    @FXML
    void add500(ActionEvent event) {
         text3.setText("Added product for 500");
         totalN+=500;
        total.setText("Total is:" + totalN);

    }


    @FXML
    void minus(ActionEvent event) {
        totalN-=1000;
        if(amountN == 1){
            text1.setText("");
            amount.setText("");
        }else{
            amountN--;
            amount.setText(String.valueOf(amountN));
        }
        total.setText("Total is:" + totalN);
        image.setImage(img);
    }

    @FXML
    void plus(ActionEvent event) {
        totalN+=1000;
            amount.setText(String.valueOf(amountN));
        amountN++;
        total.setText("Total is:" + totalN);
        image.setVisible(false);

    }

}
