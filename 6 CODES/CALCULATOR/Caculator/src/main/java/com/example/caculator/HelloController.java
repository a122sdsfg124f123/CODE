package com.example.caculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private TextField text_result;

    String op ="";
    long number1;
    long number2;

    public void Number (ActionEvent as) {

        String no = ((Button)as.getSource()).getText();
        text_result.setText(text_result.getText()+no);

    }

    public void Operaton (ActionEvent as) {

        String no = ((Button)as.getSource()).getText();
        if (!operation.equals(as))

    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

}