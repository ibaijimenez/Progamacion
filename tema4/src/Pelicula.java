import java.time.LocalDate;
import java.util.List;

    public class Pelicula {
        String titulo;
        String ano;
        int duracionMin;
        String tipo;
        private List<Estudio> listaEstudios;

        public Pelicula(String titulo, String ano, int duracionMin, String tipo) {
            this.titulo = titulo;
            this.ano = ano;
            this.duracionMin = duracionMin;
            this.tipo = tipo;
        }

        public Pelicula(String titulo, String ano, int duracionMin, String tipo, List<Estudio> listaEstudios) {
            this.titulo = titulo;
            this.ano = ano;
            this.duracionMin = duracionMin;
            this.tipo = tipo;
            this.listaEstudios = listaEstudios;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAno() {
            return ano;
        }

        public void setAno(String ano) {
            this.ano = ano;
        }

        public int getDuracionMin() {
            return duracionMin;
        }

        public void setDuracionMin(int duracionMin) {
            this.duracionMin = duracionMin;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public List<Estudio> getListaEstudios() {
            return listaEstudios;
        }

        public void setListaEstudios(List<Estudio> listaEstudios) {
            this.listaEstudios = listaEstudios;
        }

    }