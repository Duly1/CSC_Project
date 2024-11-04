import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Logo and Header
        Label logoLabel = new Label("LOGO EXAMPLE");
        logoLabel.setFont(new Font("Arial", 24));

        Button loginButton = new Button("Log In");
        Button signUpButton = new Button("Sign Up");

        // Discover More Section
        Label discoverLabel = new Label("SEE EVERY OPTION,\nDISCOVER YOUR IDEAL COVERAGE.");
        discoverLabel.setFont(new Font("Arial", 20));

        Button discoverButton = new Button("DISCOVER MORE");
        discoverButton.setOnAction(e -> openSecondPage(primaryStage));  // Navigate to second page

        StackPane discoverPane = new StackPane();
        discoverPane.getChildren().addAll(discoverLabel, discoverButton);

        // Footer Section
        Label footerLabel = new Label("Navigating health insurance made simple\n"
                + "Sign up, see what you qualify for, and find a plan option that works for you");
        footerLabel.setFont(new Font("Arial", 16));

        // Main layout
        BorderPane layout = new BorderPane();
        layout.setTop(logoLabel);  // Add Logo at the top
        layout.setCenter(discoverPane);  // Add Discover section in the center
        layout.setBottom(footerLabel);  // Add footer text at the bottom

        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setTitle("Health Insurance App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openSecondPage(Stage primaryStage) {
        // Instantiate the second page UI
        SecondPage secondPage = new SecondPage();
        secondPage.start(primaryStage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
