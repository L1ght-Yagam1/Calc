package main.java.Calc;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    // Some data from FXML
    @FXML
    private TextField resultField;

    // Clearing TextField
    @FXML
    private void handleClear() {
        resultField.clear();
        resultField.setPromptText("0");
        resultField.setFocusTraversable(false);
    }

    // Handle numbers buttons
    @FXML
    private void handleNumber(javafx.event.ActionEvent event) {
        // Определяем, какая кнопка была нажата
        Button button = (Button) event.getSource();
        // Получаем текст кнопки ("1", "2", и т.д.)
        String buttonText = button.getText();

        // Добавляем текст кнопки в поле
        resultField.appendText(buttonText);
    }

    // Handle operators buttons
    @FXML
    private void handleOperator(javafx.event.ActionEvent event) {
        Button button = (Button) event.getSource();
        String buttonText = button.getText();

        String currentText = resultField.getText();

        // Если поле пустое, не добавляем оператор
        if (currentText.isEmpty()) {
            return;
        }

        // Если последний символ оператор = не добавляем оператор
        char lastChar = currentText.charAt(currentText.length() - 1);
        if (isOperator(lastChar)) {
            return;
        }

        // Добавляем оператор в конец строки
        resultField.appendText(buttonText);
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    @FXML
    private void handleResult(javafx.event.ActionEvent event) {
        String expression = resultField.getText();

        if (expression.isEmpty()) {
            return; // Если поле пустое, ничего не делаем
        }

        try {
            // Какая-то реализация...
            resultField.setText("Result");
        } catch (Exception e) {
            resultField.setText("Ошибка");
        }
    }

    // Этот метод вызывается автоматически после загрузки FXML
    @FXML
    public void initialize() {
        resultField.setStyle("-fx-font-size: 22px;");
        resultField.setText("Hello, World!");
        resultField.setEditable(false);
        resultField.setAlignment(Pos.CENTER_RIGHT);
    }
}