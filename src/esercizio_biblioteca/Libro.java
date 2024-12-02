package esercizio_biblioteca;

public class Libro {

    private static int numeroLibri;

    private String titolo, autore;
    private int anno, id;

    public Libro(String titolo, String autore, int anno) {
        this.titolo = titolo;
        this.autore = autore;
        this.anno = anno;
        this.id = numeroLibri;
        numeroLibri++;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public String getInfo() {
        return String.format("""
                %s
                Autore: %s
                Anno: %d
                Id: %d""", titolo.toUpperCase(), autore, anno, id);
    }
}
