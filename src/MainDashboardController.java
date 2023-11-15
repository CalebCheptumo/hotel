import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class MainDashboardController {

    @FXML
    private void openEmployeeManagement() {
        showAlert("Employee Management", "Implement employee management functionality here.");
    }

    @FXML
    private void openScheduling() {
        showAlert("Scheduling", "Implement scheduling functionality here.");
    }

    private void showAlert(String title, String content) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
}