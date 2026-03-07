public abstract class Personaje implements HabilidadEspecial_I{
    protected int nivel;
    protected String nombre;

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public abstract void atacar();

    public void subirNivel() {
        this.nivel++;
        System.out.println(nombre + " ha subido al nivel " + nivel);
    }

    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
