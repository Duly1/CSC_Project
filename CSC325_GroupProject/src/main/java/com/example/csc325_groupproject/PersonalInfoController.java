package com.example.csc325_groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class PersonalInfoController {

    @FXML private TextField streetAddressField;
    @FXML private TextField cityField;
    @FXML private TextField stateField;
    @FXML private TextField zipCodeField;

    @FXML
    public void goToOtherInformation(ActionEvent event) throws Exception {
        // Additional logic or validation for address fields if needed
        loadScene("/views/OtherInfo.fxml", event);
    }

    private void loadScene(String fxmlPath, ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}
