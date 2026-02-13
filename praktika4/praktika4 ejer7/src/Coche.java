public class Coche {
        private String matricula;
        private String marca;
        private int ano;
        private double precio;

        public Coche(String matricula, String marca, int ano, double precio) {
            this.matricula = matricula;
            this.marca = marca;
            this.ano = ano;
            this.precio = precio;
        }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", precio=" + precio +
                '}';
    }
     }
