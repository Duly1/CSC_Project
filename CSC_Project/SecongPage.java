import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SecondPage extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Left side - Sign Up
        Label signUpLabel = new Label("I'm here to Sign Up");
        Button signUpButton = new Button("Sign Up");

        // Right side - Log In
        Label loginLabel = new Label("I'm here to Login");
        Button loginButton = new Button("Login");

        // Layout
        GridPane layout = new GridPane();
        layout.add(signUpLabel, 0, 0);
        layout.add(signUpButton, 0, 1);
        layout.add(loginLabel, 1, 0);
        layout.add(loginButton, 1, 1);

        Scene scene = new Scene(layout, 800, 600);
        primaryStage.setTitle("Health Insurance App - Discover More");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
