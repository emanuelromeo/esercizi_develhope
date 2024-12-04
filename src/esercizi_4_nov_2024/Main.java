package esercizi_4_nov_2024;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        stringLenght(null);

        System.out.println("----------");

        System.out.println("La stringa opzionale restituita è: " + stringToOptional("Hello world!"));

        System.out.println("----------");

        String[] names = new String[] {"Mario", "Matteo", null, "Marco"};
        System.out.println("Le stringhe non nulle sono:");
        nameStamp(names);
    }

    public static void stringLenght(String string) {
        Optional<String> optionalString = Optional.ofNullable(string);

        if (optionalString.isEmpty()) {
            System.out.println("La variabile è nulla");
            return;
        }

        System.out.println("La lunghezza della stringa è: " + string.length());
    }

    public static Optional<String> stringToOptional(String string) {
        Optional<String> optionalString = Optional.ofNullable(string);
        optionalString.ifPresent(stampString -> System.out.println("La stringa inserita è: \"" + stampString + "\""));
        return optionalString;
    }

    public static void nameStamp(String[] names) {
        for (String name : names) {
            if (name != null) {
                System.out.println(name);
            }
        }
    }
}
