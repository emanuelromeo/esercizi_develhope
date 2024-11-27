package esercizi_27_nov_2024;

public abstract class Prodotto {

    protected double prezzo;

    protected Prodotto(double prezzo) {
        this.prezzo = prezzo;
    }

    protected abstract double calcolaPrezzo();

}
