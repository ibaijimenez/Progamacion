package Modelo;

import javafx.beans.property.*;

public class Persona {
    private final StringProperty nombre = new SimpleStringProperty();
    private final StringProperty apellido = new SimpleStringProperty();
    private final StringProperty dni = new SimpleStringProperty();
    private final StringProperty telefono = new SimpleStringProperty();
    private final StringProperty fechaNacimiento = new SimpleStringProperty();
    private final IntegerProperty edad = new SimpleIntegerProperty();

    public Persona(String nombre, String apellido, String dni, String telefono, String fechaNacimiento, int edad) {
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        setTelefono(telefono);
        setFechaNacimiento(fechaNacimiento);
        setEdad(edad);
    }

    // --- NOMBRE ---
    public String getNombre() { return nombre.get(); }
    public void setNombre(String value) { nombre.set(value); }
    public StringProperty nombreProperty() { return nombre; }

    // --- APELLIDO ---
    public String getApellido() { return apellido.get(); }
    public void setApellido(String value) { apellido.set(value); }
    public StringProperty apellidoProperty() { return apellido; }

    // --- DNI ---
    public String getDni() { return dni.get(); }
    public void setDni(String value) { dni.set(value); }
    public StringProperty dniProperty() { return dni; }

    // --- TELEFONO ---
    public String getTelefono() { return telefono.get(); }
    public void setTelefono(String value) { telefono.set(value); }
    public StringProperty telefonoProperty() { return telefono; }

    // --- FECHA NACIMIENTO ---
    public String getFechaNacimiento() { return fechaNacimiento.get(); }
    public void setFechaNacimiento(String value) { fechaNacimiento.set(value); }
    public StringProperty fechaNacimientoProperty() { return fechaNacimiento; }

    // --- EDAD ---
    public int getEdad() { return edad.get(); }
    public void setEdad(int value) { edad.set(value); }
    public IntegerProperty edadProperty() { return edad; }
}