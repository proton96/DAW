public class libro {
    
    private String codigo;
    private String nombre;
    // CLAVE
    private String isbn;
    private int paginas;
    private String autor;
    private boolean prestado;



    // CONSTRUCTOR
    public libro(String codigo, String nombre, String isbn, int paginas, String autor, boolean prestado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.isbn = isbn;
        this.paginas = paginas;
        this.autor = autor;
        this.prestado = prestado;
    }



    @Override
    public String toString() {
        return "libro [codigo=" + codigo + ", nombre=" + nombre + ", isbn=" + isbn + ", paginas=" + paginas + ", autor="
                + autor + ", prestado=" + prestado + "]";
    }



    public String getCodigo() {
        return codigo;
    }



    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getIsbn() {
        return isbn;
    }



    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    public int getPaginas() {
        return paginas;
    }



    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    public boolean isPrestado() {
        return prestado;
    }



    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
    





}
