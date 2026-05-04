package DAO;

import Modelo.Persona;
import javafx.scene.control.Alert;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static Utilidades.ConexionBD.PASSWORD;
import static com.sun.javafx.css.FontFaceImpl.FontFaceSrcType.URL;
import static sun.net.ftp.FtpDirEntry.Permission.USER;
// Pon tu contraseña si tienes
public class PersonaDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/persona";
    private static final String USER = "root";
    private static final String PASSWORD = "usbw";
    private static final String añadir = "INSERT INTO persona (nombre, apellido, dni, telefono, fecha_nacimiento, edad) VALUES (?, ?, ?, ?, ?, ?)";
    public static void insertarPersona(Persona persona) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(añadir)) {
            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getDni());
            ps.setString(4, persona.getTelefono());
            ps.setString(5, persona.getFechaNacimiento());
            ps.setInt(6, persona.getEdad());
            ps.executeUpdate();
            System.out.println("✅ Persona '" + persona.getNombre() + " " + persona.getApellido() + "' insertada con éxito.");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Exito");
            alert.setHeaderText("Persona Creada");
            alert.setContentText("se ha creado la persona correctamente");
            alert.showAndWait();
        }
        catch (SQLException e) {
            System.err.println("❌ Error al insertar persona: " + e.getMessage());
        }
    }

    public static void borrarPersona(String dni) {
        String borrar = "DELETE FROM persona WHERE dni = ?";
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(borrar)) {
            ps.setString(1, dni);
            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("✅ Persona con DNI '" + dni + "' borrada con éxito.");
            } else {
                System.out.println("⚠️ No se encontró persona con DNI '" + dni + "'.");
            }
        }
        catch (SQLException e) {
            System.err.println("❌ Error al borrar persona: " + e.getMessage());
        }
    }
    private static final String actualizar = "UPDATE persona SET nombre = ?, apellido = ?, telefono = ?, fecha_nacimiento = ?, edad = ? WHERE DNI = ?";

    public static void actualizarPersona(Persona persona) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = con.prepareStatement(actualizar)) {

            ps.setString(1, persona.getNombre());
            ps.setString(2, persona.getApellido());
            ps.setString(3, persona.getTelefono());
            ps.setString(4, persona.getFechaNacimiento());
            ps.setInt(5, persona.getEdad());

            // El DNI va al final porque es el que está después del WHERE
            ps.setString(6, persona.getDni());

            ps.executeUpdate();
            System.out.println("✅ Persona con DNI " + persona.getDni() + " actualizada.");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Exito");
            alert.setHeaderText("Persona actualizada");
            alert.setContentText("se ha actuaqlizado la persona correctamente");
            alert.showAndWait();


        } catch (SQLException e) {
            System.err.println("❌ Error al actualizar: " + e.getMessage());
        }
    }

    public static List<Persona> obtenerTodas() {
        List<Persona> lista = new ArrayList<>();
        String sql = "SELECT * FROM persona"; // Asegúrate de que el nombre coincide con tu tabla

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD); // Tu método de conexión
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                // Extraemos los datos de cada columna de la BD
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String dni = rs.getString("dni");
                String telefono = rs.getString("telefono");
                String fecha = rs.getString("fecha_nacimiento"); // El nombre que tenga en tu BD
                int edad = rs.getInt("edad");

                // Creamos el objeto Persona con esos datos
                Persona p = new Persona(nombre, apellido, dni, telefono, fecha, edad);

                // Lo añadimos a la lista
                lista.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
