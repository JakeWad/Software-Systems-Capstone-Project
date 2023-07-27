import java.util.HashMap;
import java.util.Map;

public class User {
    private String username;
    private String password;

    // Constructor
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to change password
    public void changePassword(String currentPassword, String newPassword) {
        if (!currentPassword.equals(password)) {
            System.out.println("Incorrect current password. Password change failed.");
        } else {
            password = newPassword;
            System.out.println("Password change successful. Your new password is: " + password);
        }
    }

    public static void main(String[] args) {
        // Sample usage
        User user = new User("user123", "pass123");
        user.changePassword("pass123", "newpass123"); // Password change successful.
        user.changePassword("wrongpass", "newpass123"); // Incorrect current password. Password change failed.
    }
}
