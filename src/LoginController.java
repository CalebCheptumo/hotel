import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    private EmployeeManagementApp mainApp;

    public void setMainApp(EmployeeManagementApp mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Hardcoded username and password for demonstration purposes
        if (username.equals("admin") && password.equals("admin")) {
            mainApp.showMainDashboard();
        } else {
            showAlert("Invalid Credentials", "Please enter valid username and password.");
        }
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}