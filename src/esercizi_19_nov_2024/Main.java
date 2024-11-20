package esercizi_19_nov_2024;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------------------");

        Animale tasso = new Animale("Tasso del miele", "Mustelide", "Grrr");
        System.out.println(tasso.getNome() + "\n");

        System.out.println("Il verso del tasso del miele è: " + tasso.emettiVerso());

        System.out.println("-----------------------------------------");

        Cerchio cerchio = new Cerchio(16.4);
        System.out.println("Cerchio di raggio " + cerchio.getRaggio() + "\n");

        System.out.println("L'area del cerchio è: " + cerchio.calcolaArea());
        System.out.println("La circonferenza del cerchio è: " + cerchio.calcolaCirconferenza());

        System.out.println("-----------------------------------------");

        Esame[] esami = {
                new Esame("Biologia", 18),
                new Esame("Storia", 17),
                new Esame("Matematica", 29),
                new Esame("Fisica", 24),
                new Esame("Italiano", 15)
        };

        for (int i = 0; i < esami.length - 1; i++) {
            Esame esame = esami[i];
            System.out.print(esame.getNomeCorso() + ": " + esame.getPunteggio() + ", ");
        }
        Esame ultimoEsame = esami[esami.length - 1];
        System.out.println(ultimoEsame.getNomeCorso() + ": " + ultimoEsame.getPunteggio() + "\n");

        for (Esame esame : esami) {
            System.out.println(esame.getNomeCorso() + ": " + esame.isSuperato());
        }

        System.out.println("-----------------------------------------");

        System.out.println("Prodotto\n");
        Prodotto mela = new Prodotto("Mela", 1.5, 499);

        mela.stampaDettagli();
        System.out.printf("\nIl valore totale di questo prodotto è di: %.2f€%n", mela.calcolaTotale());

        System.out.println("-----------------------------------------");

        System.out.println("Catalogo\n");

        Prodotto[] prodotti = {
                new Prodotto("Mela", 1.5, 499),
                new Prodotto("Banana", 2, 300),
                new Prodotto("Pera", 2.3, 650)
        };
        Catalogo catalogo = new Catalogo(prodotti);

        System.out.println("I prodotti del catalogo sono:\n");
        for (Prodotto prodotto : catalogo.getProdotti()) {
            prodotto.stampaDettagli();
            System.out.println();
        }

        System.out.printf("Il valore totale del catalogo è di: %.2f€%n", catalogo.calcolaValoreTotale());

        System.out.println("-----------------------------------------");

        System.out.println("Calcolatrice\n");

        Calcolatrice.menu();

        System.out.println("-----------------------------------------");

    }
}
