package com.example.csc325_groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class OtherInfoController {

    @FXML private ComboBox<String> incomeRangeComboBox;
    @FXML private ComboBox<String> householdSizeComboBox;

    @FXML
    public void goToPreviousStep(ActionEvent event) {
        // Logic to go back to the Personal Information step
        loadScene("/views/AddressInfo.fxml", event);
    }

    @FXML
    public void goToNextStep(ActionEvent event) {
        // Logic to proceed to the next step (e.g., confirmation or submission)
        loadScene("/views/Confirmation.fxml", event); // Replace with your actual next screen
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
