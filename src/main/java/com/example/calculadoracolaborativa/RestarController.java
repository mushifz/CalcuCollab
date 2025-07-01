package com.example.calculadoracolaborativa;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RestarController {

    @FXML
    private TextField campo1;

    @FXML
    private TextField campo2;

    @FXML
    private Label resultado;

    @FXML
    protected void calcularResta() {
        try {
            double num1 = Double.parseDouble(campo1.getText());
            double num2 = Double.parseDouble(campo2.getText());
            resultado.setText("Resultado: " + (num1 - num2));
        } catch (NumberFormatException e) {
            resultado.setText("Error: ingresa números válidos.");
        }
    }

    @FXML
    protected void volverMenu() {
        Stage stage = (Stage) campo1.getScene().getWindow();
        stage.close();
    }
}
