package com.example.pracitcatema6;

import Vista.FormularioPersona;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
// El "/" inicial busca directamente en la raíz de la carpeta resources
// Añadimos "Vista/" porque el archivo está dentro de esa subcarpeta
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Vista/FormularioPersona.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}