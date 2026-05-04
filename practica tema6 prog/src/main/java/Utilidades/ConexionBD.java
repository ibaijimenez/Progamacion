package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    // Cambia "tu_base_de_datos" por el nombre real que le hayas puesto
    private static final String URL = "jdbc:mysql://localhost:3306/persona";
    private static final String USER = "root";
    public static final String PASSWORD = "usbw";

    private static Connection connection = null;

    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                // Registro del driver (opcional en versiones modernas de Java)
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("¡Conexión establecida con éxito!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}