package Dao;

import Modelo.Titular;
import Utilidades.ConexionBD; // Importante para usar tu conexión
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TitularDao {

    // La consulta SQL (asegúrate que tu tabla se llame 'titulares')
    private static final String SQL_INSERT = "INSERT INTO titulares (nombre, dni) VALUES (?, ?)";
    private static final String SQL_Select = "SELECT * FROM titulares WHERE nombre = ?";
    public static void añadirTitular(String nombre, String dni) {
        // Usamos try-with-resources para que la conexión se cierre sola al terminar
        try (Connection conn = ConexionBD.getConnection();
             PreparedStatement ps = conn.prepareStatement(SQL_INSERT)) {

            // Sustituimos los "?" por los datos reales
            ps.setString(1, nombre);
            ps.setString(2, dni);

            // Ejecutamos la inserción
            ps.executeUpdate();
            System.out.println("¡Titular guardado en la base de datos!");

        } catch (SQLException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }

    }
    public static String buscarTitular(String nombre) {
        String resultado = "";
        try {
            Connection conn = ConexionBD.getConnection();
            PreparedStatement ps = conn.prepareStatement(SQL_Select);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            System.out.println("Titular buscado en la base de datos!");
            boolean encontroAlgo = false;
            while (rs.next()) {
                encontroAlgo = true;
                // Sacamos los datos por el nombre de la columna en la BD
                String nombreBD = rs.getString("nombre");
                String dniBD = rs.getString("dni");
                String idBD = rs.getString("id");

                resultado ="ID: "+ idBD + " | Nombre: " + nombreBD + " | DNI: " + dniBD;
            }

            if (!encontroAlgo) {
                resultado = ("No se encontró ningún titular con ese nombre.");
            }
        }
        catch (SQLException e) {
            resultado = ("Error al buscar: " + e.getMessage());
        }
        return resultado;
    }

}
