import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class RegistrationForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create Labels
        Label titleLabel = new Label("Let's get you started");
        titleLabel.setStyle("-fx-font-size: 28px; -fx-text-fill: #FFD700;");

        Label subtitleLabel = new Label("Just a few steps to get things going for you!");
        subtitleLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: #FFD700;");

        Label firstNameLabel = new Label("First Name:");
        Label middleNameLabel = new Label("Middle Name:");
        Label lastNameLabel = new Label("Last Name:");
        Label genderLabel = new Label("Gender:");
        Label dobLabel = new Label("Date of Birth (MM/DD/YYYY):");
        Label mobileLabel = new Label("Mobile Phone Number:");
        Label emailLabel = new Label("Email Address:");
        Label passwordLabel = new Label("Password:");
        Label confirmPasswordLabel = new Label("Confirm Password:");

        // Create Input Fields
        TextField firstNameField = new TextField();
        firstNameField.setPromptText("Enter your First Name");

        TextField middleNameField = new TextField();
        middleNameField.setPromptText("Enter your Middle Name");

        TextField lastNameField = new TextField();
        lastNameField.setPromptText("Enter your Last Name");

        ComboBox<String> genderComboBox = new ComboBox<>();
        genderComboBox.getItems().addAll("Male", "Female", "Other");
        genderComboBox.setPromptText("Select");

        TextField dobField = new TextField();
        dobField.setPromptText("(MM/DD/YYYY)");

        TextField mobileField = new TextField();
        mobileField.setPromptText("XXX-XXX-XXXX");

        TextField emailField = new TextField();
        emailField.setPromptText("Enter your Email Address");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your Password");

        PasswordField confirmPasswordField = new PasswordField();
        confirmPasswordField.setPromptText("Confirm your Password");

        // Create Next Button
        Button nextButton = new Button("Next");
        nextButton.setStyle("-fx-background-color: #FFD700; -fx-font-weight: bold;");
        nextButton.setOnAction(e -> System.out.println("Next button clicked!"));

        // Organize form in a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(20);
        gridPane.setVgap(15);
        gridPane.setPadding(new Insets(20));

        // Add components to GridPane
        gridPane.add(firstNameLabel, 0, 0);
        gridPane.add(firstNameField, 1, 0);

        gridPane.add(middleNameLabel, 2, 0);
        gridPane.add(middleNameField, 3, 0);

        gridPane.add(lastNameLabel, 0, 1);
        gridPane.add(lastNameField, 1, 1);

        gridPane.add(genderLabel, 2, 1);
        gridPane.add(genderComboBox, 3, 1);

        gridPane.add(dobLabel, 0, 2);
        gridPane.add(dobField, 1, 2);

        gridPane.add(mobileLabel, 2, 2);
        gridPane.add(mobileField, 3, 2);

        gridPane.add(emailLabel, 0, 3);
        gridPane.add(emailField, 1, 3);

        gridPane.add(passwordLabel, 2, 3);
        gridPane.add(passwordField, 3, 3);

        gridPane.add(confirmPasswordLabel, 2, 4);
        gridPane.add(confirmPasswordField, 3, 4);

        // Create layout for the title, subtitle, form, and button
        VBox layout = new VBox(15);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(titleLabel, subtitleLabel, gridPane, nextButton);

        // Set background color
        layout.setStyle("-fx-background-color: #4E3A4A;");

        // Show Scene
        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
