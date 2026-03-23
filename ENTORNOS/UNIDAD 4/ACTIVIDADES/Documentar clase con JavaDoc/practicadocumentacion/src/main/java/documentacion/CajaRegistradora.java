package documentacion;


public class CajaRegistradora {
    private double saldo;
    private int numeroTransacciones;


    public CajaRegistradora(double saldoInicial) {
        this.saldo = saldoInicial;
        this.numeroTransacciones = 0;
    }


    public double getSaldo() {
        return saldo;
    }


    public void agregarDinero(double cantidad) {
        saldo += cantidad;
        numeroTransacciones++;
    }


    public void retirarDinero(double cantidad) {
        saldo -= cantidad;
        numeroTransacciones++;
    }


    public boolean estaVacia() {
        return saldo == 0;
    }


    public int getNumeroTransacciones() {
        return numeroTransacciones;
    }


    public boolean haRealizadoMasDe100Transacciones() {
        return numeroTransacciones > 100;
    }
}
