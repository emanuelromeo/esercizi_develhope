package esercizi_27_nov_2024;

public class Libro extends Prodotto {

    public Libro(double prezzo) {
        super(prezzo);
    }

    @Override
    public double calcolaPrezzo() {
        return super.prezzo;
    }

}
