import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PasswordChangeUI extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("EarthHero - Password Change");

        // Create labels and fields
        Label currentPasswordLabel = new Label("Current Password:");
        PasswordField currentPasswordField = new PasswordField();

        Label newPasswordLabel = new Label("New Password:");
        PasswordField newPasswordField = new PasswordField();

        // Create a button to change the password
        Button changePasswordButton = new Button("Change Password");
        changePasswordButton.setOnAction(e -> handleChangePassword(currentPasswordField.getText(), newPasswordField.getText()));

        // Create the layout and add elements
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20, 20, 20, 20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.add(currentPasswordLabel, 0, 0);
        gridPane.add(currentPasswordField, 1, 0);
        gridPane.add(newPasswordLabel, 0, 1);
        gridPane.add(newPasswordField, 1, 1);
        gridPane.add(changePasswordButton, 1, 2);

        Scene scene = new Scene(gridPane, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleChangePassword(String currentPassword, String newPassword) {
        // Implement the password change logic here.
        // You can use your existing backend methods to change the user's password securely.

        // For this example, let's just print the passwords for demonstration purposes.
        System.out.println("Current Password: " + currentPassword);
        System.out.println("New Password: " + newPassword);
    }
}
