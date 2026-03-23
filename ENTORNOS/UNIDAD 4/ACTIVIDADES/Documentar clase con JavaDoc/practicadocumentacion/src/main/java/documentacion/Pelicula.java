package documentacion;


public class Pelicula {
    private String titulo;
    private String director;
    private int duracionMinutos;


    public Pelicula(String titulo, String director, int duracionMinutos) {
        this.titulo = titulo;
        this.director = director;
        this.duracionMinutos = duracionMinutos;
    }


    public Pelicula(String titulo) {
        this(titulo, "", 0);
    }


    public String getTitulo() {
        return titulo;
    }


    public String getDirector() {
        return director;
    }


    public int getDuracionMinutos() {
        return duracionMinutos;
    }


    public boolean esDirigidaPor(String nombreDirector) {
        return director.equalsIgnoreCase(nombreDirector);
    }


    public boolean esLarga() {
        return duracionMinutos > 120;
    }
}
