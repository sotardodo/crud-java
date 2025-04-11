public class Main {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        try {
            // Create
            userDAO.create("John Doe", "john.doe@example.com");

            // Read
            userDAO.read();

            // Update
            userDAO.update(1, "John Updated", "john.updated@example.com");

            // Delete
            userDAO.delete(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

