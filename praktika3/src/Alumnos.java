import java.util.List;

public class Alumnos {
    private String nombre;
    private String dni;
    private String clase;
    private List<Libro> listaLibros;

    public Alumnos(String nombre, String dni, String clase, List<Libro> listaLibros) {
        this.nombre = nombre;
        this.dni = dni;
        this.clase = clase;
        this.listaLibros = listaLibros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", clase='" + clase + '\'' +
                ", listaLibros=" + listaLibros +
                '}';
    }
    public static void alquilarLibro(Libro libro){

    }

    public static void devolberLibro(Libro libro){

    }
}
