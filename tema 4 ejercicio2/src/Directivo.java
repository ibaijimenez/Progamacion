import java.util.ArrayList;
import java.util.List;

public class Directivo extends Empleado{
    private String categoria;
    private List<Empleado> listaEmpleados = new ArrayList<>();

    public Directivo(String nombre, int edad, double sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                '}';
    }
}
