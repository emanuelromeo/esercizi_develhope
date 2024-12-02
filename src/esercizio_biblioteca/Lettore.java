package esercizio_biblioteca;

public class Lettore extends Utente {
    public Lettore(String nome) {
        super(nome);
    }

    @Override
    public void prendiInPrestito(int idLibro) {
        Biblioteca biblioteca = getBiblioteca();

        //Controlla se l'utente è registrato in biblioteca
        if (biblioteca == null) {
            System.out.println("L'utente non è registrato in nessuna biblioteca");
            return;
        }

        biblioteca.iniziaPrestito(idLibro, getNumeroTessera(), 0);
    }
}
