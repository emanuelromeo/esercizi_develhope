package esercizi_19_nov_2024;

public class Prodotto {

    private String nome;
    private double prezzo;
    private int quantità;

    public Prodotto(String nome, double prezzo, int quantità) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantità = quantità;
    }

    public double calcolaTotale() {
        return prezzo * quantità;
    }

    public void stampaDettagli() {
        System.out.println("Nome: " + nome);
        System.out.printf("Prezzo: %.2f€%n", prezzo);
        System.out.println("Quantità: " + quantità);
    }

}
