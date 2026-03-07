public class Examen {


    public static int calcularFactorial(int numero){
        if(numero<0){
            throw new IllegalArgumentException("No se puede hacer factorial de un número negativo");
        }
        int factorial=1;

        for (int i=1;i<=numero;i++){
            factorial*=i;
        }

        return factorial;
    }

    public static int[] inventirArray(int[] array){

        int[] invertido=new int[array.length];
        
        for(int i=array.length-1;i>=0;i--){
            invertido[array.length-i-1]=array[i];
        }
        return invertido;
    }

    public static int contarCambios(int[] array){
        int cambios=0;

        for(int i=1;i<array.length;i++){
            if((array[i-1]<0 && array[i]>0) || (array[i-1]>0 && array[i]<0)){
                cambios++;
            }
        }

        return cambios;
    }

    public static int posicionPrimerNegativo(int[] array){
        int resultado=-1;

        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                resultado=array[i];
            }
        }

        return resultado;
    }
}
