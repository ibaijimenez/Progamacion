import java.util.List;

public class Veterinarios {
    private String nombre;
    private String direccion;
    private String telefono;
    private String dni;
    private String num_ss;
    private List<Mascota> mascotas_cargo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNum_ss() {
        return num_ss;
    }

    public void setNum_ss(String num_ss) {
        this.num_ss = num_ss;
    }

    public List<Mascota> getMascotas_cargo() {
        return mascotas_cargo;
    }

    public void setMascotas_cargo(List<Mascota> mascotas_cargo) {
        this.mascotas_cargo = mascotas_cargo;
    }

    public Veterinarios(String nombre, String direccion, String telefono, String dni, String num_ss) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.dni = dni;
        this.num_ss = num_ss;
    }

    @Override
    public String toString() {
        return "Veterinarios{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", dni='" + dni + '\'' +
                ", num_ss='" + num_ss + '\'' +
                ", mascotas_cargo=" + mascotas_cargo +
                '}';
    }
}
