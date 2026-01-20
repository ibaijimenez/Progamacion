import java.time.LocalDate;

public class Autor {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String pasiNacimiento;

    public Autor(String nombre, LocalDate fechaNacimiento, String pasiNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.pasiNacimiento = pasiNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPasiNacimiento() {
        return pasiNacimiento;
    }

    public void setPasiNacimiento(String pasiNacimiento) {
        this.pasiNacimiento = pasiNacimiento;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", pasiNacimiento='" + pasiNacimiento + '\'' +
                '}';
    }
}
