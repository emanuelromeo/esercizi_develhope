package esercizi_19_nov_2024;

import java.security.PrivilegedAction;

public class Catalogo {

    private Prodotto[] prodotti;

    public Catalogo(Prodotto[] prodotti) {
        this.prodotti = prodotti;
    }

    public Prodotto[] getProdotti() {
        return prodotti;
    }

    public double calcolaValoreTotale() {
        double totale = 0;
        for (Prodotto prodotto : prodotti) {
            totale += prodotto.calcolaTotale();
        }
        return totale;
    }
}
