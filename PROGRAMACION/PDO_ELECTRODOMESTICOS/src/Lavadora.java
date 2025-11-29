public class Lavadora extends Electrodomestico {
    private int carga = 5;
    
    public Lavadora(double precioBase, Colores color, char consumoEnergetico, 
                   double peso, int carga) {
                    // Llama padre
        super(precioBase, color, consumoEnergetico, peso);  
        this.carga = carga;
    }
    
    public int getCarga() { return carga; }
    
    @Override
    public String toString() {
        return super.toString() + ", Carga: " + carga;
    }
    
    @Override
    public double precioFinal() {
        return super.precioFinal() + (carga > 6 ? 50 : 0);
    }
}

