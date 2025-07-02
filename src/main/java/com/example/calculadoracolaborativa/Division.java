package com.example.calculadoracolaborativa;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Division {
    // Elementos del diseño
    @FXML private TextField txtNum1;
    @FXML private TextField txtNum2;
    @FXML private Label lblResul;

    // Operación para la división
    @FXML
    protected void btnDivide(){
        //Variables necesarias
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());

        try {
            if (txtNum1.getText().equals("") || txtNum2.getText().equals("")) {
                lblResul.setText("El valor no puede estar vacío");
                return;
            }

            if (num2 == 0) {
                lblResul.setText("Error: División por cero");
            } else {
                double result = num1 / num2;
                lblResul.setText("El resultado es: " + result);
            }
        } catch (NumberFormatException e){
            lblResul.setText("Error: ingresa números válidos.");
        }
    }

    // Función para cerrar la ventana y volver al menú principal
    @FXML
    protected void btnVolverMenu() {
        try {
            // Cargar la vista del menú principal
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Parent root = loader.load();

            // Crear una nueva ventana (Stage) con la vista del menú
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Menú Principal");
            stage.show();

            // Cerrar la ventana actual
            Stage currentStage = (Stage) txtNum1.getScene().getWindow();
            currentStage.close();
//
        } catch (IOException e) {
            e.printStackTrace(); // Para el error en consola si falla la carga
        }
    }
}
