package esercizio_biblioteca;

public class Main {
    public static void main(String[] args) {

        //Istanziamento biblioteca
        Biblioteca biblioteca = new Biblioteca(5, 5, 30);

        //Istanziamento libri
        Libro book1949 = new Libro("1984", "George Orwell", 1949);
        Libro bookTGG = new Libro("Il grande Gatsby", "F. Scott Fitzgerald", 1925);
        Libro book100y = new Libro("Cent'anni di solitudine", "Gabriel García Márquez", 1967);
        Libro bookFurore = new Libro("Furore", "John Steinbeck", 1939);
        Libro bookOP = new Libro("Orgoglio e pregiudizio", "Jane Austen", 1813);

        //Istanziamento lettori
        Lettore mario = new Lettore("Mario");
        Lettore massimo = new Lettore("Massimo");
        Lettore davide = new Lettore("Davide");
        Lettore simone = new Lettore("Simone");

        /*
        Istanziamento bibliotecario
        Il bibliotecario può:
            - Iniziare e chiudere prestiti
            - Visualizzare il catalogo dei libri e la lista degli utenti
            - Visualizzare, aggiungere o eliminare libri
            - Visualizzare, aggiungere o eliminare utenti
        */
        Bibliotecario bibliotecario = new Bibliotecario("Luca");

        //Tutti gli utenti possono ricercare libri per titolo o autore e prendere in prestito libri

        //Registrazione utenti in biblioteca
        biblioteca.aggiungiUtente(bibliotecario);
        biblioteca.aggiungiUtente(mario);
        biblioteca.aggiungiUtente(massimo);
        biblioteca.aggiungiUtente(davide);
        biblioteca.aggiungiUtente(simone);

        //Il bibliotecario aggiunge ed elimina libri
        bibliotecario.aggiungiLibro(book1949);
        bibliotecario.aggiungiLibro(bookOP);
        bibliotecario.aggiungiLibro(bookFurore);
        bibliotecario.aggiungiLibro(bookTGG);
        bibliotecario.aggiungiLibro(book100y);

        bibliotecario.eliminaLibro(bookTGG.getId());

        //Gli utenti prendono in prestito dei libri
        mario.prendiInPrestito(book100y.getId());
        mario.prendiInPrestito(book1949.getId());

        davide.prendiInPrestito(bookTGG.getId());

        bibliotecario.prendiInPrestito(bookOP.getId());

        //Il bibliotecario cerca il libro "Il grande Gatsby"
        System.out.println(bibliotecario.ricercaLibro("Il grande Gatsby"));

        //Davide cerca un libro di Jane Austen
        System.out.println(davide.ricercaLibro("JanE AuSTen"));

        //Il bibliotecario chiude un prestito
        bibliotecario.chiudiPrestito(book1949.getId());

        //Il bibliotecario visualizza il catalogo e i prestiti della biblioteca
        System.out.println(bibliotecario.visualizzaCatalogo());
        System.out.println(bibliotecario.visualizzaPrestiti());

    }
}
