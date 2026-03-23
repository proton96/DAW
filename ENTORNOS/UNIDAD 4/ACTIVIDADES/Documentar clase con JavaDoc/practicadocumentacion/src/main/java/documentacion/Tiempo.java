package documentacion;

public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Tiempo(){
        this.hora=0;
        this.minuto=0;
        this.segundo=0;
    }
    
    public Tiempo(int hora,int minuto,int segundo){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=segundo;
    }
    
    public Tiempo(int hora,int minuto){
        this.hora=hora;
        this.minuto=minuto;
        this.segundo=0;
    }
    
    public Tiempo(int hora){
        this.hora=hora;
        this.minuto=0;
        this.segundo=0;
    }
    
    public void setSegundo(int segundo){
        if(segundo>=0 && segundo<=59){
            this.segundo=segundo;
        }else{
            System.out.println("Dato erroneo");
        }
    }
    
    public void setMinuto(int minuto){
        if(minuto>=0 && minuto<=59){
            this.minuto=minuto;
        }else{
            System.out.println("Dato erroneo");
        }
    }
    
    public void setHora(int hora){
        if(hora>=0 && hora<=23){
            this.hora=hora;
        }else{
            System.out.println("Dato erroneo");
        }
    }
    
    public void mostrarTiempo(){
        System.out.println(completar(this.hora)+":"
                          +completar(this.minuto)+":"
                          +completar(this.segundo));
        
    }

    public String toString(){
        String res;
        
        res=completar(this.hora)+":"
                          +completar(this.minuto)+":"
                          +completar(this.segundo);
        
        return res;
    }
    
    private String completar(int n){
        String res="";
        if(n<10){
            res+="0"+n;
        }else{
            res+=n;
        }
        return res;
    }
    
    
}
