package com.example.calculadoracolaborativa;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        abrirVentana("suma.fxml", "suma");
    }

    @FXML
    protected void onRestarButtonClick() {
        abrirVentana("resta.fxml", "Restar");
    }

    @FXML
    protected void onMultiplicarButtonClick() {
        abrirVentana("multiplicacion.fxml", "Multiplicar");
    }

    @FXML
    protected void onDividirButtonClick() {
        abrirVentana("Division.fxml", "Dividir");
    }



    private void abrirVentana(String fxml, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle(titulo);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
