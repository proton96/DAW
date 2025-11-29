enum Colores {
    BLANCO, NEGRO, PLATEADO, ROJO, AZUL, GRIS
}

public class Electrodomestico {
    protected double precioBase = 100;
    protected Colores color = Colores.BLANCO;
    protected char consumoEnergetico = 'A';
    protected double peso = 10;
    
    // Constructor vacío (valores por defecto)
    public Electrodomestico() {}
    
    // Constructor completo
    public Electrodomestico(double precioBase, Colores color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    
    // PRIVADO: Solo se usa al crear objeto
    private char comprobarConsumoEnergetico(char letra) {
        if (letra >= 'A' && letra <= 'F') return letra;
        // Por defecto si inválido
        return 'A';  
    }
    
    // Getters y Setters
    public double getPrecioBase() { return precioBase; }
    public void setPrecioBase(double precioBase) { this.precioBase = precioBase; }
   
    
    @Override
    public String toString() {
        return "Precio base: " + precioBase + ", Consumo: " + consumoEnergetico + ", Peso: " + peso;
    }
    
    public double precioFinal() {
        double precio = precioBase;
        
        // Bonus consumo energético
        switch(consumoEnergetico) {
            case '+': precio+= 120; break;
            case 'A': precio += 100; break;
            case 'B': precio += 80; break;
            case 'C': precio += 60; break;
            case 'D': precio += 50; break;
            case 'E': precio += 30; break;
            case 'F': precio += 10; break;
            default: precio += 100;  
        }
        
        // Bonus peso
        if (peso <= 19) precio += 10;
        else if (peso <= 49) precio += 30;
        else if (peso <= 79) precio += 50;
        else precio += 100;
        
        return precio;
    }

     // ... (resto getters/setters similares)
    public Colores getColor() {
        return color;
    }

    public void setColor(Colores color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
