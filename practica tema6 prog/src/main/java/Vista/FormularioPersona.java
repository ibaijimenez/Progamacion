package Vista;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FormularioPersona {
    public void show() {
        try {
            // Buscamos el archivo FXML
            FXMLLoader fxmlLoader = new FXMLLoader(FormularioPersona.class.getResource("/fxml/FormularioPersona.fxml"));

            // Creamos la ventana (Stage)
            Stage stage = new Stage();
            stage.setTitle("Formulario de Registro");
            stage.setScene(new Scene(fxmlLoader.load()));
            stage.show();

        } catch (IOException e) {
            System.err.println("Error al cargar la vista: " + e.getMessage());
        }
    }
}
