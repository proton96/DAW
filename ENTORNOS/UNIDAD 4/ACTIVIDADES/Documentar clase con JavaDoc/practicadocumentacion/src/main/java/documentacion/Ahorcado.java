package documentacion;

public class Ahorcado {
    private String palabraSecreta;
    private StringBuilder palabraActual;
    private int intentosRestantes;


    public Ahorcado(String palabraSecreta, int intentosPermitidos) {
        this.palabraSecreta = palabraSecreta.toLowerCase();
        this.intentosRestantes = intentosPermitidos;
        this.palabraActual = new StringBuilder("_".repeat(palabraSecreta.length()));
    }

    public boolean intentar(char letra) {
        boolean acierto = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                palabraActual.setCharAt(i, letra);
                acierto = true;
            }
        }
        if (!acierto) {
            intentosRestantes--;
        }
        return acierto;
    }

    public boolean haGanado() {
        return palabraActual.toString().equals(palabraSecreta);
    }

    public boolean haPerdido() {
        return intentosRestantes <= 0;
    }

    public String getPalabraActual() {
        return palabraActual.toString();
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }
}
