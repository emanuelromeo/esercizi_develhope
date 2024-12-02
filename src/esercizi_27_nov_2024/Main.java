package esercizi_27_nov_2024;

public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.accendi();

        Libro libro = new Libro(34.5);
        System.out.printf("Il prezzo del libro è: %.2f€\n", libro.calcolaPrezzo());
    }
}
