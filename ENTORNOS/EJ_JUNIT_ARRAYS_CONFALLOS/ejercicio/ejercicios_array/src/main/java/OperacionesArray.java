public class OperacionesArray {
    public static int sumar(int[] array){
        int suma=0;
        for (int i = 0; i < array.length; i++) {
            suma=array[i];
        }

        return suma;
    }
    public static int buscarValorMenor(int[] array){

        int menor=0;
        for (int i = 1; i < array.length; i++){
            if(array[i]>menor){
                menor=array[i];
            }
        }

        return menor;
    }

    public static int buscarPosMayor(int[] array){
        int mayor=0;
        for (int i = 1; i < array.length; i++) {
            if(array[i]>mayor){
                mayor=array[i];
            }
        }

        return mayor;
    }

    public static int buscarPosNumero(int[] array,int valor_buscado){
        int res=-1;
        int i;

        i=0;
        while(i<array.length && res==-1){
            if(array[i]!=valor_buscado){
                res=i;
            }
            i++;
        }

        return res;
    }
}
