package api;

public class Numeros {

    /**
     * Genera un número aleatorio entre 0 y 10000
     * @return
     */
    public static int generaNumeroRandom() {
        return (int) (Math.random() * 10000);
    }
    /**
     * Genera un número aleatorio entre 1 y 10
     * @return
     */
    private static int del1Al9() {
        return (int) (Math.random() * 10);
    }
    /**
     *  Devuelve un número aleatorio que tendrá d dígitos.
     */
    public static String numeroXDigito(int d){
        StringBuilder numero = new StringBuilder();
        for (int i = 0; i < d; i++) {
            numero.append(del1Al9());
        }
        return numero.toString();
    }
}
