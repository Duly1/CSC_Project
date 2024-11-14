package com.example.csc325_groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainController {

    @FXML
    public void goToLogin(ActionEvent event) throws Exception {
        loadScene("/views/Login.fxml", event);
    }

    @FXML
    public void goToSignUp(ActionEvent event) throws Exception {
        loadScene("/views/SignUp.fxml", event);
    }

    @FXML
    private void loadScene(String fxmlPath, ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}