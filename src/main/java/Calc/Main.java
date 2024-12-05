package main.java.Calc;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.TextField;





public class Main extends Application {

    @FXML
    private TextField resultField;

    @Override
    public void start(Stage primaryStage) throws IOException {
        // Загружаем FXML файл
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Calc/Calcv1.0.fxml"));
        loader.setController(new Main());
        Parent root = loader.load();

        // Устанавливаем сцену
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);


        // Настройки окна
        primaryStage.setTitle("Мое Окно");
        primaryStage.show();
    }

    @FXML
    private void initialize() {
        resultField.setText("Hello, World!");
    }

    public static void main(String[] args) {
        launch(args);
    }
}

