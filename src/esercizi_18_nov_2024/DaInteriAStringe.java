// Data un'array di numeri interi, convertire ogni numero intero nella sua rappresentazione in stringa.

package esercizi_18_nov_2024;

public class DaInteriAStringe {
    public static void main(String[] args) {

        int[] numeri = {1, 2, 3};
        Array.printIn(numeri);

        String[] stringhe = new String[numeri.length];
        int index = 0;

        for (int numero : numeri) {
            stringhe[index] = "\"" + numero + "\"";
            index++;
        }

        Array.printOut(stringhe);
    }
}
