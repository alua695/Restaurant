package com.example.softwareproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class Flavour {

    @FXML
    private Button aboutUsButton;

    @FXML
    private Button chineseButton;

    @FXML
    private Button contactUsButton;

    @FXML
    private Button italianButton;

    @FXML
    void aboutUsButtonClicked(ActionEvent event) {

    }

    @FXML
    void chineseButtonClicked(ActionEvent event) throws IOException {

    }

    @FXML
    void contactUsButtonClicked(ActionEvent event) throws IOException {
      HelloApplication d = new HelloApplication();
      d.changeScene("ddd.fxml");
    }

    @FXML
    void italianButtonClicked(ActionEvent event) throws IOException {
        HelloApplication d = new HelloApplication();
        d.changeScene("ddd.fxml");
    }

}
