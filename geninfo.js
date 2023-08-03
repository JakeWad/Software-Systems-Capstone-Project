<!-- account.jsp -->
<!DOCTYPE html>
<html>
<head>
    <title>Account Information</title>
</head>
<body>
    <h1>Account Information</h1>
    <p>Username: <%= username %></p>
    <p>Email: <%= email %></p>
    <!-- Add other account information here -->
</body>
</html>

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
            // For demonstration purposes, assuming we have user information available.
            String email = getUserEmail(username); // Implement this method to get the user's email from the database or any source.

            // Store the account information in request attributes to be accessed in the JSP.
            request.setAttribute("username", username);
            request.setAttribute("email", email);

            // Forward the request to the account.jsp to display the account information.
            request.getRequestDispatcher("account.jsp").forward(request, response);
        } else {
            response.sendRedirect("signin.jsp"); // Redirect back to the sign-in page if authentication fails.
        }
    }

    // Other methods (authenticateUser, checkDatabaseForUserCredentials, etc.) remain the same.
    // ...
}
