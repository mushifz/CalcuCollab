package com.example.calculadoracolaborativa;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onRestarButtonClick() {
        abrirVentana("restar.fxml", "Restar");
    }

    // Dividir (Raul :v)
    @FXML protected void onDivisionButtonClick() {
        abrirVentana("division.fxml", "División");
    }


    @FXML
    protected void onMultiplicarButtonClick() {
        abrirVentana("multiplicar.fxml", "Multiplicar");
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
