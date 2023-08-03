import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegistrationServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Get form parameters
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        // Validate passwords match
        if (!password.equals(confirmPassword)) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Passwords do not match");
            return;
        }

        // Additional validation logic if needed

        // Register user (e.g. insert into database)
        boolean isRegistered = registerUser(username, email, password);

        if (isRegistered) {
            // Redirect to login page after successful registration
            response.sendRedirect("login.jsp");
        } else {
            // Handle registration failure here
            response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Registration failed. Please try again later.");
        }
    }

    private boolean registerUser(String username, String email, String password) {
        // Implement registration logic here (e.g., insert user into the database)
        // Return true if registration is successful, false otherwise
        // You may use a database connection and queries to insert the user data
        // For demonstration purposes, we assume registration is always successful.
        return true;
    }
}

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signin")
public class SignInServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Perform authentication logic here, e.g., check against a database.
        boolean isAuthenticated = authenticateUser(username, password);

        if (isAuthenticated) {
            response.sendRedirect("welcome.jsp"); // Redirect to the welcome page after successful sign-in.
        } else {
            response.sendRedirect("signin.jsp"); // Redirect back to the sign-in page if authentication fails.
        }
    }

    private boolean authenticateUser(String username, String password) {
        // Implement your authentication logic here, e.g., check username and password against a database.
        // Return true if authentication is successful, false otherwise.
        // You may use a database connection and queries to retrieve user information.
        // Sample pseudo-code:
        // return checkDatabaseForUserCredentials(username, password);
        return false;
    }
}
