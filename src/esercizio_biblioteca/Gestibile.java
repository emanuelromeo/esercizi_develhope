package esercizio_biblioteca;

public interface Gestibile {

    void aggiungiLibro(Libro libro);
    void eliminaLibro(int idLibro);
    String visualizzaLibro(int idLibro);

    void aggiungiUtente(Utente utente);
    void eliminaUtente(int numeroTessera);
    String visualizzaUtente(int numeroTessera);

    void iniziaPrestito(int idLibro, int numeroTessera, int prolungamentoPrestito);
    void chiudiPrestito(int idLibro);

}
