package com.example.csc325_groupproject;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.UserRecord;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class SignUpController {

    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;
    @FXML private TextField passwordField;
    @FXML private TextField confirmPasswordField;

    @FXML
    public void handleSignUp(ActionEvent event) {
        String email = emailField.getText();
        String password = passwordField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if (!password.equals(confirmPassword)) {
            showAlert(Alert.AlertType.ERROR, "Sign Up Failed", "Passwords do not match.");
            return;
        }

        FirebaseService.initializeFirebase(); // Ensure Firebase is initialized
        FirebaseAuth auth = FirebaseAuth.getInstance();

        UserRecord.CreateRequest request = new UserRecord.CreateRequest()
                .setEmail(email)
                .setPassword(password);

        try {
            UserRecord userRecord = auth.createUser(request);
            showAlert(Alert.AlertType.INFORMATION, "Sign Up Successful", "User created: " + userRecord.getEmail());
            // Navigate to Login.fxml
        } catch (FirebaseAuthException e) {
            showAlert(Alert.AlertType.ERROR, "Sign Up Failed", e.getMessage());
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
