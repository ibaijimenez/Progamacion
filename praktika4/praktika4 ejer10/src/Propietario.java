
import java.util.List;

public class Propietario {
    private String nombre;
    private List<Coche> coches;

    public Propietario(String nombre, List<Coche> coches) {
        this.coches = coches;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Coche> getCoches() {
        return coches;
    }
}
