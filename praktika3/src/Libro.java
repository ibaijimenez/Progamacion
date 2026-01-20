public class Libro {
    private String titulo;
    private String editorial;
    private int numPaginas;
    private Autor autor;
    private int ejemplaresDispo = 3;

    public Libro(String titulo, String editorial, int numPaginas, Autor autor) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.numPaginas = numPaginas;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", numPaginas=" + numPaginas +
                ", autor=" + autor +
                '}';
    }


}
