public  class Calc_base {
        //atributos
        private double n1;
        private double n2;
        

        public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }


       //Constructores

       public Calc_base(double n1, double n2){
                this.n1 = n1;
                this.n2 = n2;
       }
       // Metodos de las operaciones basicas
       public double sumar(){
                double suma = this.n1 + this.n2;
                return suma;
       }
        public double restar(){
                double resta = this.n1 - this.n2;
                return resta;
       }
        public double multiplicar(){
                double multiplicacion = this.n1 * this.n2;
                return multiplicacion;
       }
        public double dividir(){
                double division = this.n1 / this.n2;
                return division;
       }

    



}