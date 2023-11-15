import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EmployeeManagementApp extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        showLogin();
    }

    public void showLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(EmployeeManagementApp.class.getResource("Login.fxml"));
            Parent root = loader.load();

            primaryStage.setTitle("Employee Management System - Login");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();

            // Set the EmployeeManagementApp reference in the LoginController
            LoginController loginController = loader.getController();
            loginController.setMainApp(this);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showMainDashboard() {
        try {
            FXMLLoader loader = new FXMLLoader(EmployeeManagementApp.class.getResource("MainDashboard.fxml"));
            Parent root = loader.load();

            primaryStage.setTitle("Employee Management System - Main Dashboard");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}