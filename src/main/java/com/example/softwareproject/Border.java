package com.example.softwareproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class Border implements Initializable { // MenuController

    @FXML
    private Button bolognese;

    @FXML
    private BorderPane borderPane;

    @FXML
    private ScrollPane chinese;

    @FXML
    private Button chineseButton;

    @FXML
    private Button contacButton;

    @FXML
    private ScrollPane contact;

    @FXML
    private ScrollPane drink;

    @FXML
    private AnchorPane italian;

    @FXML
    private Button italianButton;

    @FXML
    private Button locationsButton;

    @FXML
    private ScrollPane order;

    @FXML
    private Button ordersButton;

    @FXML
    private ScrollPane scroll;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private VBox vbox;
    private Map<String, Integer> dishQuantities = new HashMap<>();

    private int total = 0;
    private int amountOfCalamari = 0;
    private int amountOfBolognese = 0;
    private int amountOfBrio = 0;
    private int amountOfChow = 0;
    private int amountOfCider = 0;
    private int amountOfCoke = 0;
    private int amountOfDuck = 0;
    private int amountOfDump = 0;
    private int amountOfFish = 0;
    private int amountOfWine = 0;
    private int amountOfHouse = 0;
    private int amountOfLobster = 0;
    private int amountOfMimosa = 0;
    private int amountOfOrange = 0;
    private int amountOfPao = 0;
    private int amountOfSalmon = 0;
    private int amountOfSpitz = 0;
    private int amountOfVerm = 0;
    private int amountOfPollo = 0;
    private int amountOfSuey = 0;






    @FXML
    void bolognese3400(ActionEvent event) {
        updateTotal("Bolognese", 3400);
        showSuccessDialog("Added Bolognese to cart");
    }

    private void showSuccessDialog(String message) {
        System.out.println("Successfully added");
    }

    private void updateAmount(String bolognese) {

    }

    private void updateTotal(String dishName, int price) {
        updateAmount(dishName);

        HBox hbox = createDishBox(dishName, price);
        vbox.getChildren().add(hbox);
    }
    private HBox createDishBox(String dishName, int price) {
        HBox hbox = new HBox();
        ImageView image = new ImageView(new Image(getClass().getResourceAsStream(dishName.toLowerCase() + ".jpg")));
        image.setFitWidth(100);
        image.setFitHeight(100);
        Label name = new Label(dishName);
        hbox.getChildren().addAll(image, name);
        return hbox;
    }

    @FXML
    void brio3000(ActionEvent event) {
        updateTotal("Bolognese", 3400);
        showSuccessDialog("Added Bolognese to cart");
    }

    @FXML
    void calamari3200(ActionEvent event) {

    }

    @FXML
    void chineseButtonClicked(ActionEvent event) {
      borderPane.setCenter(chinese);
    }

    @FXML
    void chow2300(ActionEvent event) {

    }

    @FXML
    void cider1450(ActionEvent event) {

    }

    @FXML
    void coke500(ActionEvent event) {

    }

    @FXML
    void contacButtonClicked(ActionEvent event) {
            borderPane.setCenter(contact);
    }

    @FXML
    void duck2900(ActionEvent event) {

    }

    @FXML
    void dump3200(ActionEvent event) {

    }

    @FXML
    void fish2900(ActionEvent event) {

    }

    @FXML
    void italianButtonCLicked(ActionEvent event) {
         borderPane.setCenter(scroll);
    }

    @FXML
    void lobster2500(ActionEvent event) {

    }

    @FXML
    void locationsButtonClicked(ActionEvent event) {
         borderPane.setCenter(drink);
    }

    @FXML
    void mimosa1600(ActionEvent event) {

    }

    @FXML
    void orange1100(ActionEvent event) {

    }

    @FXML
    void ordersButtonClicked(ActionEvent event) {
      borderPane.setCenter(order);
    }

    @FXML
    void pao2250(ActionEvent event) {

    }

    @FXML
    void pollo2900(ActionEvent event) {

    }

    @FXML
    void salmon2600(ActionEvent event) {

    }

    @FXML
    void spitz1750(ActionEvent event) {

    }

    @FXML
    void suey2800(ActionEvent event) {

    }

    @FXML
    void verm2400(ActionEvent event) {

    }

    @FXML
    void white2500(ActionEvent event) throws FileNotFoundException {
        HBox hbox = new HBox();
        ImageView image = new ImageView();
        Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\SoftwareProject\\src\\main\\resources\\com\\example\\softwareproject\\item-800000006186777559_1698688804.jpg");
        image.setImage(img);
        image.setFitHeight(200);
        image.setFitWidth(200);
        Label name = new Label("White Wine");
        hbox.getChildren().addAll(image,name);
        vbox.getChildren().add(hbox);
        Button max = new Button("+");

        ErrorPassOrName("Added");



    }

    @FXML
    void wine2300(ActionEvent event) {
        HBox hbox = new HBox();
        ImageView image = new ImageView();
        Image img = new Image("C:\\Users\\ПК\\IdeaProjects\\SoftwareProject\\src\\main\\resources\\com\\example\\softwareproject\\item-800000000911965726_1680282277.jpg");
        image.setImage(img);
        hbox.getChildren().add(image);
        vbox.getChildren().add(hbox);
    }

    void ErrorPassOrName(String message) throws FileNotFoundException {
        Stage stage = new Stage();
        Button ok = new Button("OK");
        Button cancel = new Button("Cancel");
        Text text = new Text(message + ", try again!");
        text.setFill(Color.WHITE);
        HBox hBox = new HBox(8,text);
        hBox.setAlignment(Pos.CENTER);
        HBox hBox1 = new HBox(8, ok, cancel);
        hBox1.setAlignment(Pos.CENTER);
        VBox vBox = new VBox(25, hBox,hBox1);
        vBox.setAlignment(Pos.CENTER);
        StackPane stackPane = new StackPane(vBox);
        stackPane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(stackPane,450, 200);
        text.setStyle("-fx-font-weight: 500;-fx-font-size: 14");
        ok.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-radius: 7px;-fx-background-radius: 7px; -fx-border-color: black");
        cancel.setStyle("-fx-background-color: white; -fx-text-fill: black; -fx-border-radius: 7px;-fx-background-radius: 7px;-fx-border-color: black");
        stackPane.setStyle("-fx-background-color: #061251");
        stage.setScene(scene);
        stage.show();
        ok.setOnAction(e -> {
            Stage stage1 = (Stage) ok.getScene().getWindow();
            stage1.close();

        });
        cancel.setOnAction(e -> {
            Stage stage1 = (Stage) cancel.getScene().getWindow();
            stage1.close();
        });
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Initialized");
    }
}
