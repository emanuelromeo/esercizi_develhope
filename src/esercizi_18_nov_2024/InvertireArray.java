// Dato un array di stringhe, invertire ogni stringa dell'array e stampare l'array modificato.

package esercizi_18_nov_2024;

public class InvertireArray {
    public static void main(String[] args) {

        String[] parole = {"hello", "world", "java"};
        Array.printIn(parole);

        String[] paroleInvertite = new String[parole.length];
        int index = 0;

        for (String parola : parole) {
            char[] lettere = parola.toCharArray();
            paroleInvertite[index] = "";
            for (char lettera : lettere) {
                paroleInvertite[index] = lettera + paroleInvertite[index];
            }
            index++;
        }

        Array.printOut(paroleInvertite);
    }
}
