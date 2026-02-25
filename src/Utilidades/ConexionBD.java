package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    // Definimos las credenciales como constantes para que sea más limpio
    private static final String URL = "jdbc:mysql://localhost:3306/titulares";
    private static final String USER = "root";
    private static final String PASS = "usbw";

    public static Connection getConnection() {
        Connection con = null;
        try {
            // Cargar el driver (opcional en versiones modernas de JDBC, pero recomendado)
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        return con;
    }
}

