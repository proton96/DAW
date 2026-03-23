package documentacion;

public class Carta {
    private int numero;
    private char palo;
    
    public Carta() {
        this.numero = 1;
        this.palo = 'c';
    }
    
    public Carta(int numero,char palo) {
        this.numero = numero;
        this.palo = palo;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public char getPalo() {
        return palo;
    }
    
    public void setNumero(int numero) {
        if (numero>0 && numero <14){
            this.numero = numero;
        }else{
            System.out.println("Error");
        }
    }
    
    public void setPalo(char palo) {
        if (palo=='c'||palo=='p'||palo=='r'||palo=='t') {
            this.palo=palo;
        }else{
            System.out.println("Error");
        }
    }
    
    public String toString() {
        String res="";
        if (this.numero > 1 && this.numero <11) {
            res+="Es el "+this.numero+" de: ";
        }else{
            if (this.numero==1) {
                res+="Es el As de: ";
            }else if (this.numero==11) {
                res+="Es el Jack de: ";
            }else if (this.numero==12) {
                res+="Es la reina de: ";
            }else if (this.numero==13) {
                res+="Es el rey de: ";
            }
        }
        
        if (this.palo=='c') {
            res+="Corazones";
        }else if (palo=='p') {
            res+="Picas";
        }else if (palo=='r') {
            res+="Rombos";
        }else if (palo=='t') {
            res+="Treboles";
        }
        
        return res;
    }
    
    public void CompararCarta(Carta c) {  
        if (c.numero<this.numero) {
            System.out.println("La carta 1 gana");
        }else if (c.numero>this.numero) {
            System.out.println("La carta 2 gana");
        }else{  
            if (this.palo==c.palo) { 
                System.out.println("Empate");
            }else if (this.palo=='t') {
                System.out.println("La carta 1 gana");
            }else if (c.palo=='t') {
                System.out.println("La carta 2 gana");
            }else if (this.palo=='r') {
                System.out.println("La carta 1 gana");
            }else if (c.getPalo()=='r') {
                System.out.println("La carta 2 gana");
            }else if (this.palo=='p') {
                System.out.println("La carta 1 gana");
            }else if (c.getPalo()=='p') {
                System.out.println("La carta 2 gana");
            }else if (this.palo=='c') {
                System.out.println("La carta 2 gana");
            }else if (c.getPalo()=='c') {
                System.out.println("La carta 2 gana");
            }
        }
    }
}
