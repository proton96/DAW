public class Vehiculo {
    

    //Añadimos nuestras variables

    private String matricula;
    private String propietario; 
    private String horaEntrada; 
    private int plaza; 
    private boolean pagado; 



    //CONSTRUCTOR
    public Vehiculo(String horaEntrada, String matricula, boolean pagado, int plaza, String propietario) {
        this.horaEntrada = horaEntrada;
        this.matricula = matricula;
        this.pagado = pagado;
        this.plaza = plaza;
        this.propietario = propietario;
    }



    // GETTERS Y SETTERS 
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getPlaza() {
        return plaza;
    }

    public void setPlaza(int plaza) {
        this.plaza = plaza;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    //METODO toString
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("matricula=").append(matricula);
        sb.append(", propietario=").append(propietario);
        sb.append(", horaEntrada=").append(horaEntrada);
        sb.append(", plaza=").append(plaza);
        sb.append(", pagado=").append(pagado);
        sb.append('}');
        return sb.toString();
    }


    



}
