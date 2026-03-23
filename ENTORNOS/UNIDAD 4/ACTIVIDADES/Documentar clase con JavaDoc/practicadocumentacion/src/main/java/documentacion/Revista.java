package documentacion;


public class Revista {
    private String titulo;
    private String autor;
    private int paginas;


    public Revista(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
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


    public String resumen() {
        return "El libro '" + titulo + "' escrito por " + autor + " tiene " + paginas + " páginas.";
    }

    public boolean esLargo() {
        return paginas > 300;
    }


    public boolean esDeAutor(String nombreAutor) {
        return autor.equals(nombreAutor);
    }
}
