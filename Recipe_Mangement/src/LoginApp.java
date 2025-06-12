import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login Page");

        // Create a GridPane layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // Add "Login" label
        Label loginLabel = new Label("Login");
        loginLabel.setId("login-label"); // For CSS styling
        grid.add(loginLabel, 0, 0, 2, 1); // Span two columns

        // Email field
        Label emailLabel = new Label("Email:");
        grid.add(emailLabel, 0, 1);

        TextField emailTextField = new TextField();
        emailTextField.setPromptText("your@email.com");
        grid.add(emailTextField, 1, 1);

        // Password field
        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 2);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 2);

        // Forgot Password?
        Button forgotPasswordButton = new Button("Forgot Password?");
        forgotPasswordButton.setStyle("-fx-background-color: transparent; -fx-text-fill: #007bff; -fx-underline: true;");
        // You would add an action for this button
        forgotPasswordButton.setOnAction(e -> System.out.println("Forgot Password clicked!"));
        grid.add(forgotPasswordButton, 1, 3); // Position below password field, right-aligned

        // Sign In Button
        Button signInButton = new Button("Sign In");
        signInButton.setPrefWidth(200); // Example width
        signInButton.getStyleClass().add("sign-in-button"); // For CSS styling
        signInButton.setOnAction(e -> {
            String email = emailTextField.getText();
            String password = passwordField.getText();
            System.out.println("Email: " + email + ", Password: " + password);
            // Add your authentication logic here
        });
        VBox signInBox = new VBox(10);
        signInBox.setAlignment(Pos.CENTER);
        signInBox.getChildren().add(signInButton);
        grid.add(signInBox, 0, 4, 2, 1); // Span two columns

        // "Or Continue With" label
        Label orContinueWith = new Label("Or Continue With");
        grid.add(orContinueWith, 0, 5, 2, 1);
        GridPane.setHalignment(orContinueWith, javafx.geometry.HPos.CENTER);


        // Social login buttons (placeholders)
        Button googleButton = new Button("G");
        Button facebookButton = new Button("f");
        Button twitterButton = new Button("t"); // Example
        googleButton.getStyleClass().add("social-button");
        facebookButton.getStyleClass().add("social-button");
        twitterButton.getStyleClass().add("social-button");


        GridPane socialButtonsGrid = new GridPane();
        socialButtonsGrid.setAlignment(Pos.CENTER);
        socialButtonsGrid.setHgap(10);
        socialButtonsGrid.add(googleButton, 0, 0);
        socialButtonsGrid.add(facebookButton, 1, 0);
        socialButtonsGrid.add(twitterButton, 2, 0);
        grid.add(socialButtonsGrid, 0, 6, 2, 1); // Span two columns

        // "Don't have an account yet? Register for free"
        Label registerLabel = new Label("Don't have an account yet?");
        Button registerButton = new Button("Register for free");
        registerButton.setStyle("-fx-background-color: transparent; -fx-text-fill: #007bff; -fx-underline: true;");
        registerButton.setOnAction(e -> System.out.println("Register clicked!"));

        VBox registerBox = new VBox(5);
        registerBox.setAlignment(Pos.CENTER);
        registerBox.getChildren().addAll(registerLabel, registerButton);
        grid.add(registerBox, 0, 7, 2, 1); // Span two columns


        // Main VBox to hold the form and potentially other elements
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(grid);
        root.setStyle("-fx-background-color: #FEEEDD;"); // Light orange background for the entire scene

        Scene scene = new Scene(root, 800, 600); // Set initial window size
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm()); // Link CSS file

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}