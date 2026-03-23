package documentacion;

import java.util.Random;

public class Cuenta {
    private String numero_cuenta;
    private String contraseña;
    private double saldo;

    public Cuenta(String numero_cuenta, String contraseña) {
        this.numero_cuenta = numero_cuenta;
        this.contraseña = contraseña;
        this.saldo=0;
    }

    public Cuenta(String numero_cuenta, String contraseña, double saldo) {
        this.numero_cuenta = numero_cuenta;
        this.contraseña = contraseña;
        this.saldo = saldo;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        if(!numero_cuenta.equals("")){    
            this.numero_cuenta = numero_cuenta;
        }
    }
    
    public void ingresar(double cantidad){
        if(cantidad>0){
            saldo+=cantidad;
        }else{
            System.out.println("ERROR: Mayor de 0 please¡¡¡");
        }
    }
    
    public boolean validar_contraseña(String contraseña){
        return this.contraseña.equals(contraseña);
    }
    
    public void sacar(String contraseña,double cantidad){
        if(validar_contraseña(contraseña)){
            if(cantidad<=saldo){
                saldo-=cantidad;
            }else{
                System.out.println("No tienes suficiente");
            }
        }else{
            System.out.println("Contraseña erronea");
        }
    }
        
    private String generar_contraseña(){
        Random generador=new Random();
        String res="";
        for(int i = 0; i < 4; i++) {
            res+=generador.nextInt(10);
        }
 
        return res;
    }
    
    public void cambiar_contraseña(String antigua){
        if(validar_contraseña(antigua)){
            this.contraseña=generar_contraseña();
            System.out.println(this.contraseña);
        }else{
            System.out.println("Contraseña erronea");
        }
    }
    
    public void mostrar_datos(String contraseña){
        if(validar_contraseña(contraseña)){
            System.out.println("----------------");
            System.out.println("NUMERO DE CUENTA:"+numero_cuenta);
            System.out.println("SALDO:"+saldo);
            System.out.println("----------------");
        }else{
            System.out.println("Contraseña erronea");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
}
