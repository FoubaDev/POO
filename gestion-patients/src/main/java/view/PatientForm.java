package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.sql.Connection;
import java.sql.DriverManager;

import controller.PatientController;


public class PatientForm extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gestion_patients", "username", "password");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/PatientForm.fxml"));
        Parent root = loader.load();

        PatientController controller = loader.getController();
        controller.setConnection(connection); // Injecter la connexion dans le contrôleur

        primaryStage.setTitle("Gestion des Patients");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
