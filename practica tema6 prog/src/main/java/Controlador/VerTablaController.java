package Controlador;

import DAO.PersonaDAO;
import Modelo.Persona;
import com.example.pracitcatema6.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class VerTablaController {
    @FXML
    private TableView<Persona> tablaPersonas;

    @FXML
    private TableColumn<Persona, String> colNombre;

    @FXML
    private TableColumn<Persona, String> colApellido;

    @FXML
    private TableColumn<Persona, String> colTelefono;

    @FXML
    private TableColumn<Persona, String> colDNI;

    @FXML
    private TableColumn<Persona, String> colFecha;

    @FXML
    private TableColumn<Persona, String> colEdad;

    @FXML
    public void initialize() {
        // 1. Configurar las columnas (esto se hace SOLO UNA VEZ al arrancar)
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        colDNI.setCellValueFactory(new PropertyValueFactory<>("dni"));
        colFecha.setCellValueFactory(new PropertyValueFactory<>("fechaNacimiento"));
        colEdad.setCellValueFactory(new PropertyValueFactory<>("edad"));
        // ... configurar el resto de columnas ...

        // 2. LLAMAR A LA CARGA DE DATOS AQUÍ
        this.refrescarTabla();
    }

    // Creamos un método aparte para poder llamarlo cuando queramos actualizar
    private void refrescarTabla() {
        try {
            // Traemos la lista de la base de datos a través del DAO
            List<Persona> listaBD = PersonaDAO.obtenerTodas();

            // La convertimos al formato que entiende la tabla
            ObservableList<Persona> listaObservable = FXCollections.observableArrayList(listaBD);

            // ¡MAGIA! Metemos los datos en la tabla
            tablaPersonas.setItems(listaObservable);

            System.out.println("Datos cargados: " + listaObservable.size() + " personas encontradas.");

        } catch (Exception e) {
            System.err.println("Error al cargar datos en la tabla: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void onSalir() {
        System.exit(0);
    }
}
