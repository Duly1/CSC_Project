package com.example.csc325_groupproject;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class PlanSelectionController {

    @FXML
    public void selectPatriotHealth(ActionEvent event) {
        showAlert(AlertType.INFORMATION, "Plan Selected", "You have selected the Patriot Health Platinum plan.");
    }

    @FXML
    public void selectHealthFirst(ActionEvent event) {
        showAlert(AlertType.INFORMATION, "Plan Selected", "You have selected the HealthFirst Insurance plan.");
    }

    @FXML
    public void selectBlueCross(ActionEvent event) {
        showAlert(AlertType.INFORMATION, "Plan Selected", "You have selected the Blue Cross Blue Shield plan.");
    }

    @FXML
    public void handleLogout(ActionEvent event) {
        // Navigate back to Main.fxml or Login.fxml
        try {
            loadScene("/views/Login.fxml", event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showAlert(AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void loadScene(String fxmlPath, ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlPath));
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}
