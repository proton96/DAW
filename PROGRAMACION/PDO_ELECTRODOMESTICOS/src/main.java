public class main {
    public static void main(String[] args) {

        //MENU
        System.out.println("###### BIENVENIDO ######");
        System.out.println(" Estos son los articulos que has elegido: ");

        // Lavadora AEG: 'P' → 'A' por validación
        Lavadora lavadoraAEG = new Lavadora(400, Colores.PLATEADO, 'P', 30, 7);
        System.out.println("## Lavadora AEG ## \n"  +lavadoraAEG);
        // 580€
        System.out.println("Precio final: " + lavadoraAEG.precioFinal());  
        
        // TV Samsung por defecto
        Television tvSamsung = new Television(100, Colores.GRIS, 'A' , 10, 20, false);
        // 210€
        System.out.println("## Nuestra TV por defecto ## \n" +  tvSamsung ); 
        System.out.println("Precio final:" + tvSamsung.precioFinal()); 
        
        // TV Samsung modificada
        tvSamsung = new Television(190, Colores.NEGRO, 'A', 10, 24, true);
        // 437€
        System.out.println("## TV Samsung ## \n" + tvSamsung);
        System.out.println("Precio final: " + tvSamsung.precioFinal());  
    }
}
