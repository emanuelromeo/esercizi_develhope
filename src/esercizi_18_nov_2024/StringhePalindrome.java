// Dato un array di stringhe, verificare se ciascuna stringa è palindroma (si legge allo stesso modo in avanti e all'indietro).
// Stampare “Sì” o “No” per ogni stringa.

package esercizi_18_nov_2024;

public class StringhePalindrome {
    public static void main(String[] args) {

        String[] parole = {"madam", "java", "racecar"};
        Array.printIn(parole);

        String[] palindrome = new String[parole.length];
        int index = 0;

        for (String parola : parole) {
            char[] lettere = parola.toCharArray();
            String palindroma = "Yes";

            for (int i = 0; i < lettere.length / 2; i++) {
                if (lettere[i] != lettere[lettere.length - 1 - i]) {
                    palindroma = "No";
                    break;
                }
            }

            palindrome[index] = palindroma;
            index++;
        }

        Array.printOut(palindrome);
    }
}
