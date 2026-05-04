module com.example.pracitcatema6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;

    opens com.example.pracitcatema6 to javafx.fxml;
    opens Vista to javafx.fxml;
    opens Controlador to javafx.fxml;

    // --- AÑADE ESTO ---
    opens Modelo to javafx.base;
    // ------------------

    exports com.example.pracitcatema6;
    exports Controlador;
}