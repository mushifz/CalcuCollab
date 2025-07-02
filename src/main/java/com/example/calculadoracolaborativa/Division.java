package com.example.calculadoracolaborativa;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Division {
    @FXML private TextField txtNum1;
    @FXML private TextField txtNum2;
    @FXML private Label lblResul;

    @FXML
    protected void btnDivide() {
        try {
            // Validar campos vacíos
            if (txtNum1.getText().isEmpty() || txtNum2.getText().isEmpty()) {
                mostrarAlerta("Los campos no pueden estar vacíos.");
                lblResul.setText("Error: Campos vacíos");
                return;
            }

            // Intentar convertir a números
            double num1 = Double.parseDouble(txtNum1.getText());
            double num2 = Double.parseDouble(txtNum2.getText());

            // Validar división por cero
            if (num2 == 0) {
                mostrarAlerta("No se puede dividir por cero.");
                lblResul.setText("Error: División por cero");
                return;
            }

            double result = num1 / num2;
            lblResul.setText("El resultado es: " + result);

        } catch (NumberFormatException e) {
            mostrarAlerta("Ingresa solo números válidos.");
            lblResul.setText("Error: Entrada no válida");
        }
    }

    // Método para mostrar alertas
    private void mostrarAlerta(String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.WARNING);
        alerta.setTitle("Advertencia");
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje);
        alerta.showAndWait();
    }

    @FXML
    protected void volverMenu() {
        Stage stage = (Stage) txtNum1.getScene().getWindow();
        stage.close();
    }
}