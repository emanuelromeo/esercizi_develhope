package esercizi_9_dic_2024;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSet = new HashSet<>();
        int numeroCoppie;

        // Richiedo di inserire un numero finché l'input non è valido
        System.out.print("Inserisci il numero di coppie: ");
        while (true) {
            try {

                numeroCoppie = Integer.parseInt(scanner.nextLine().trim());
                if (numeroCoppie < 1 || numeroCoppie > 100000) {
                    throw new IllegalArgumentException("Il numero non è compreso tra 1 e 100000");
                }
                break;

            } catch (IllegalArgumentException e) {
                System.out.print(e.getMessage() + "! Riprova: ");
            }
        }

        System.out.println("Inserisci le coppie:");

        for (int i = 1; i <= numeroCoppie; i++) {

            // Richiedo di inserire la coppia finché l'input non è valido
            System.out.print("\nCoppia " + i + ": ");
            while (true) {
                try {

                    String[] coppia = scanner.nextLine().trim().split(" ");

                    // L'input è valido solo se la coppia è composta da 2 parole con lunghezza minore o uguale a 5
                    if (coppia.length != 2 || coppia[0].length() > 5 || coppia[1].length() > 5) {
                        throw new IllegalArgumentException("Coppia non valida");
                    }

                    hashSet.add(coppia[0].toLowerCase() + " " + coppia[1].toLowerCase());
                    break;

                } catch (IllegalArgumentException e) {
                    System.out.print(e.getMessage() + "! Riprova: ");
                }
            }

            System.out.println("Al momento ci sono " + hashSet.size() + " coppie distinte");
        }



        System.out.println("\nLe coppie sono: " + hashSet);
    }

    // Scrivere un programma Java per trovare l'intersezione di due o più HashSet
    public static HashSet<String> intersezione(HashSet<String>[] hashSetArray) {
        HashSet<String> result = new HashSet<>();

        // Controllo che l'array non sia null o vuoto, e che il primo elemento non sia null
        if (hashSetArray == null || hashSetArray.length == 0 || hashSetArray[0] == null) {
            return result;
        }

        // Popolo result col primo hashSet dell'array
        result.addAll(hashSetArray[0]);

        // Itero sugli elementi successivi dell'array
        for (int i = 1; i < hashSetArray.length; i++) {

            // Se almeno un hashSet è null, l'intesezione è considerata vuota
            if (hashSetArray[i] == null) {
                return new HashSet<>();
            }
            result.retainAll(hashSetArray[i]);
        }

        return result;
    }

    // Scrivere un programma Java per rimuovere elementi da uno o più HashSet in base ad una condizione specifica
    public static void rimuoviPerIniziale(char iniziale, HashSet<String>[] hashSetArray) {

        // Controllo che l'array non sia null
        if (hashSetArray == null) {
            return;
        }

        // Itero sugli elementi dell'array
        for (HashSet<String> hashSet : hashSetArray) {

            // Controllo che l'hashSet non sia null
            if (hashSet != null) {

                Iterator<String> iterator = hashSet.iterator();
                String string;

                // Itero sugli elementi dell'hashSet
                while (iterator.hasNext()) {
                    string = iterator.next();
                    if (string != null && string.charAt(0) == iniziale) {
                        iterator.remove();
                    }
                }
            }

        }
    }

    // Scrivere un programma per rimuovere gli elementi di HashSet contenuti in un altro HashSet
    public static void rimuoviIntersezione(HashSet<String> hashSet, HashSet<String> valoriDaRimuovere) {

        // Controllo che gli hashSet non siano null
        if (hashSet == null || valoriDaRimuovere == null) {
            return;
        }

        // Rimuovo i valori da rimuovere dall'hashSet
        hashSet.removeAll(valoriDaRimuovere);
    }
}
