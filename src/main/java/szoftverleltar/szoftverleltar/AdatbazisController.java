package com.szoftverleltar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.lang.module.Configuration;

public class AdatbazisController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onOlvasMenuItemClick(ActionEvent actionEvent) {
    }

    public void OnCreateTelepites(ActionEvent actionEvent) {
        System.out.println("Beír()........");
    }
}