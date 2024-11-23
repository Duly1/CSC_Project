package com.example.csc325_groupproject;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;

    @FXML
    public void handleLogin(ActionEvent event) {
        String email = usernameField.getText();
        String password = passwordField.getText();

        FirebaseService.initializeFirebase(); // Ensure Firebase is initialized
        FirebaseAuth auth = FirebaseAuth.getInstance();

        try {
            FirebaseToken token = auth.verifyPassword(email, password);
            showAlert(Alert.AlertType.INFORMATION, "Login Successful", "Welcome, " + email + "!");
            // Navigate to PlanSelection.fxml
        } catch (FirebaseAuthException e) {
            showAlert(Alert.AlertType.ERROR, "Login Failed", e.getMessage());
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
