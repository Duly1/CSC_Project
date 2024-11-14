package com.example.csc325_groupproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AccountController {

    @FXML private TextField usernameField;
    @FXML private TextField emailField;
    @FXML private TextField passwordField;
    @FXML private TextField incomeRangeField;
    @FXML private TextField householdSizeField;

    @FXML
    public void editAccount(ActionEvent event) {
        // Logic for editing account information
        showAlert(AlertType.INFORMATION, "Account Updated", "Your account information has been updated.");
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
