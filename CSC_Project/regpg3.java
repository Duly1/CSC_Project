import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class OtherInformationForm extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create Labels
        Label titleLabel = new Label("Let's get you started");
        titleLabel.setStyle("-fx-font-size: 28px; -fx-text-fill: #FFD700;");

        Label subtitleLabel = new Label("Just a few steps to get things going for you!");
        subtitleLabel.setStyle("-fx-font-size: 16px; -fx-text-fill: #FFD700;");

        Label incomeRangeLabel = new Label("Income Range:");
        Label householdSizeLabel = new Label("Household Size:");

        // Create Combo Boxes for Income Range and Household Size
        ComboBox<String> incomeRangeComboBox = new ComboBox<>();
        incomeRangeComboBox.getItems().addAll("Select", "$0 - $25,000", "$25,000 - $50,000", "$50,000 - $75,000", "$75,000 - $100,000", "Above $100,000");
        incomeRangeComboBox.setPromptText("Select");

        ComboBox<String> householdSizeComboBox = new ComboBox<>();
        householdSizeComboBox.getItems().addAll("Select", "1", "2", "3", "4", "5", "6+");
        householdSizeComboBox.setPromptText("Select");

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
        gridPane.add(incomeRangeLabel, 0, 0);
        gridPane.add(incomeRangeComboBox, 1, 0, 3, 1); // Spanning across multiple columns

        gridPane.add(householdSizeLabel, 0, 1);
        gridPane.add(householdSizeComboBox, 1, 1, 3, 1);

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
        primaryStage.setTitle("Other Information Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
