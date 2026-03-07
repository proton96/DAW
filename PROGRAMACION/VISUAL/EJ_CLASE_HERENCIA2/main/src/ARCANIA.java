public class ARCANIA {
    public static void main(String[] args) {
        Personaje heroe = new Guerrero("Aragorn", 5, "Espada");
        Personaje villano = new Mago("Saruman", 7, "Hechizo de Fuego");

        Dragon dragon = new Dragon("Smaug", 10, "Fuego");

        System.out.println("=====ARKANIA=====");
        System.out.println("Personaje 1: " + heroe.getNombre() +  heroe.getClass());
        System.out.println("Personaje 2: " + villano.getNombre() + villano.getClass());


        //Ataque
        heroe.atacar();
        villano.atacar();
        dragon.atacar();

        
    }
}
