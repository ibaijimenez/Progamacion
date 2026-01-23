public class Mascota {
    private String raza;
    private String nombre;
    private String fecha_nacimiento;
    private String sexo;
    private String peso;
    private String longitud;
    private Veterinarios veterinario;
    private Cliente dueño;



    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public Mascota( String raza, String nombre, String fecha_nacimiento, String sexo, String peso, String longitud) {
        this.raza = raza;
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sexo = sexo;
        this.peso = peso;
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                ", raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso='" + peso + '\'' +
                ", longitud='" + longitud + '\'' +
                '}';
    }
}
