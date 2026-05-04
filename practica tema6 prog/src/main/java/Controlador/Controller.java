package Controlador;

import DAO.PersonaDAO;
import Modelo.Persona;
import com.example.pracitcatema6.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class Controller {

    // Los IDs del FXML deben coincidir aquí
    @FXML
    private TextField Nombre;
    @FXML
    private TextField Apellido;
    @FXML
    private TextField Telefono;
    @FXML
    private TextField DNI;
    @FXML
    private TextField Edad;

    @FXML
    private Button añadir;
    @FXML
    private Button modificar;
    @FXML
    private Button borrar;

    @FXML
    private DatePicker Calendario;

    // Los métodos onAction del FXML deben coincidir aquí
    @FXML
    void onAnadirClick(ActionEvent event) {
        // 1. Pillamos la fecha del DatePicker. getValue() la da en formato YYYY-MM-DD (perfecto para MySQL)
        String fechaReal = "";

        if (Calendario.getValue() != null) {
            fechaReal = Calendario.getValue().toString();
        } else {
            // Si el usuario no elige nada, podrías avisar o poner una por defecto
            fechaReal = "2000-01-01";
        }

        // 2. Ahora sí, le pasamos la fechaReal que ha puesto el usuario
        Persona persona = new Persona(
                Nombre.getText(),
                Apellido.getText(),
                DNI.getText(),
                Telefono.getText(),
                fechaReal,
                Integer.parseInt(Edad.getText())
        );
        PersonaDAO.insertarPersona(persona);
    }

        @FXML
        void onModificarClick (ActionEvent event){
            String fechaReal = "";

            if (Calendario.getValue() != null) {
                fechaReal = Calendario.getValue().toString();
            } else {
                // Si el usuario no elige nada, podrías avisar o poner una por defecto
                fechaReal = "2000-01-01";
            }
            Persona persona = new Persona(
                    Nombre.getText(),
                    Apellido.getText(),
                    DNI.getText(),
                    Telefono.getText(),
                    fechaReal,
                    Integer.parseInt(Edad.getText())
            );
            PersonaDAO.actualizarPersona(persona);
        }

        @FXML
        void onBorrarClick (ActionEvent event){
            PersonaDAO.borrarPersona(DNI.getText());
        }

        @FXML
        void onVertablaclick (ActionEvent event) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Vista/MostrarTabla.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 320, 240);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setTitle("Listado de Personas");
                stage.setScene(scene);
                stage.show();
            }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    }
