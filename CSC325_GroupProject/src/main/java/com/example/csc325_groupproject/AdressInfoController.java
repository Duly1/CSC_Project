package com.example.csc325_groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddressInfoController {

    @FXML private TextField streetAddressField;
    @FXML private TextField aptField;
    @FXML private TextField cityField;
    @FXML private ComboBox<String> stateComboBox;
    @FXML private TextField zipCodeField;

    @FXML
    public void goToPreviousStep(ActionEvent event) {
        // Logic to go back to the Account Information step
        loadScene("/views/AccountInfo.fxml", event);
    }

    @FXML
    public void goToNextStep(ActionEvent event) {
        // Validate fields if necessary
        loadScene("/views/AdditionalInfo.fxml", event);
    }

    private void loadScene(String fxmlPath, ActionEvent event) {
        try {
            javafx.scene.Parent root = javafx.fxml.FXMLLoader.load(getClass().getResource(fxmlPath));
            javafx.stage.Stage stage = (javafx.stage.Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new javafx.scene.Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
