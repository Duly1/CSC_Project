import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class PersonalInformationForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create Labels
        Label titleLabel = new Label("Let's get you started");
        titleLabel.setStyle("-fx-font-size: 28px; -fx-text-fill: #FFD700;");

        Label subtitleLabel = new Label("Just a few steps to get things going for you!");
        subtitleLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: #FFD700;");

        Label streetAddressLabel = new Label("Street Address:");
        Label aptLabel = new Label("Apt, suite, floor, etc:");
        Label cityLabel = new Label("City:");
        Label stateLabel = new Label("State:");
        Label zipCodeLabel = new Label("Zip Code:");

        // Create Input Fields
        TextField streetAddressField = new TextField();
        streetAddressField.setPromptText("Enter your Street Address");

        TextField aptField = new TextField();
        aptField.setPromptText("Apt, suite, floor, etc");

        TextField cityField = new TextField();
        cityField.setPromptText("Enter your City");

        ComboBox<String> stateComboBox = new ComboBox<>();
        stateComboBox.getItems().addAll("New York"); // Only NY options as per screenshot
        stateComboBox.setPromptText("Select (Only Based In NY)");

        TextField zipCodeField = new TextField();
        zipCodeField.setPromptText("Enter your Zip Code");

        // Create Back and Next Buttons
        Button backButton = new Button("Back");
        backButton.setStyle("-fx-background-color: #FFD700; -fx-font-weight: bold;");
        backButton.setOnAction(e -> System.out.println("Back button clicked!"));

        Button nextButton = new Button("Next");
        nextButton.setStyle("-fx-background-color: #FFD700; -fx-font-weight: bold;");
        nextButton.setOnAction(e -> System.out.println("Next button clicked!"));

        // Organize form in a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(20);
        gridPane.setVgap(15);
        gridPane.setPadding(new Insets(20));

        // Add components to GridPane
        gridPane.add(streetAddressLabel, 0, 0);
        gridPane.add(streetAddressField, 1, 0, 3, 1); // Spanning across multiple columns

        gridPane.add(aptLabel, 0, 1);
        gridPane.add(aptField, 1, 1, 3, 1);

        gridPane.add(cityLabel, 0, 2);
        gridPane.add(cityField, 1, 2);

        gridPane.add(stateLabel, 2, 2);
        gridPane.add(stateComboBox, 3, 2);

        gridPane.add(zipCodeLabel, 0, 3);
        gridPane.add(zipCodeField, 1, 3);

        // Create layout for the title, subtitle, form, and buttons
        HBox buttonBox = new HBox(10, backButton, nextButton);
        buttonBox.setAlignment(Pos.CENTER_RIGHT);

        VBox layout = new VBox(15);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(titleLabel, subtitleLabel, gridPane, buttonBox);

        // Set background color
        layout.setStyle("-fx-background-color: #4E3A4A;");

        // Show Scene
        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setTitle("Personal Information Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

