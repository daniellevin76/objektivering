package com.example.objektivering;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class Controller {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() throws IOException {

        welcomeText.setText("Welcome to JavaFX Application!");

    }

    public static void print(ActionEvent actionEvent) {
        System.out.println("clicked");
    }




}