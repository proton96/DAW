package documentacion;


public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private String genero;


    public Libro(String titulo, String autor, int paginas, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.genero = genero;
    }

    public Libro(String titulo, String autor) {
        this(titulo, autor, 0, "");
    }


    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public int getPaginas() {
        return paginas;
    }


    public String getGenero() {
        return genero;
    }


    public boolean esDeGenero(String nombreGenero) {
        return genero.equalsIgnoreCase(nombreGenero);
    }


    public boolean esLargo() {
        return paginas > 500;
    }
}
