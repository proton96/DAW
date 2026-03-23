package documentacion;


public class CalculadoraHipoteca {
    private double montoPrestamo;
    private double tasaInteresAnual;
    private int plazoAnios;


    public CalculadoraHipoteca(double montoPrestamo, double tasaInteresAnual, int plazoAnios, double inicial) {
        this.montoPrestamo = montoPrestamo - inicial;
        this.tasaInteresAnual = tasaInteresAnual;
        this.plazoAnios = plazoAnios;
    }


    public double calcularPagoMensual() {
        double tasaInteresMensual = tasaInteresAnual / 100 / 12;
        int plazoMeses = plazoAnios * 12;
        return montoPrestamo * (tasaInteresMensual / (1 - Math.pow(1 + tasaInteresMensual, -plazoMeses)));
    }

    public double calcularTotalPagar() {
        return calcularPagoMensual() * plazoAnios * 12;
    }


    public double calcularTotalPagar(double inicial) {
        return calcularTotalPagar() + inicial;
    }


    public boolean esMontoPrestamoMayorQuePrecioCasa(double precioCasa) {
        return montoPrestamo > precioCasa;
    }

    public boolean esTasaInteresAlta() {
        return tasaInteresAnual > 5;
    }
}
