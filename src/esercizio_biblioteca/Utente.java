package esercizio_biblioteca;

public abstract class Utente {

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
}
