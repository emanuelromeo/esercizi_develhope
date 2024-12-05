package esercizio_biblioteca;

public abstract class Utente implements Ricercabile {

    private static int numeroUtenti;

    private String nome;
    private int numeroTessera;
    private Biblioteca biblioteca;

    public Utente(String nome) {
        this.nome = nome;
        this.numeroTessera = numeroUtenti;
        numeroUtenti++;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroTessera() {
        return numeroTessera;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public String getInfo() {
        return String.format("""
                %s
                Numero di tessera: %s""", nome, numeroTessera);
    }

    protected abstract void prendiInPrestito(int idLibro);

    @Override
    public String ricercaLibro(String chiave) {
        Biblioteca biblioteca = getBiblioteca();

        //Controlla se l'utente è registrato in biblioteca
        if (biblioteca == null) {
            return "L'utente non è registrato in nessuna biblioteca";
        }

        return biblioteca.ricercaLibro(chiave);
    }
}
