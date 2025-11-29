public class Television extends Electrodomestico {
    private int resolucion = 20;
    private boolean netflix = false;
    
  public Television(double precioBase, Colores color, char consumoEnergetico, 
                     double peso, int resolucion, boolean netflix) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.netflix = netflix;
    }
    
    
    public int getResolucion() { return resolucion; }
    public boolean isNetflix() { return netflix; }
    
    @Override
    public String toString() {
        return super.toString() + ", Resolución: " + resolucion + ", Netflix: " + netflix;
    }
    
    @Override
    public double precioFinal() {
        double precio = super.precioFinal();
        if (resolucion > 20) precio *= 1.30;  // 30% del precio actual
        if (netflix) precio += 60;
        return precio;
    }
}
