package esercizio_biblioteca;

public class Bibliotecario extends Utente implements Gestibile, Ricercabile {

    public Bibliotecario(String nome) {
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
        //Un bibliotecario può tenere un libro un mese in più rispetto a un lettore
        biblioteca.iniziaPrestito(idLibro, getNumeroTessera(), 30);
    }

    public String visualizzaCatalogo() {
        StringBuilder catalogo = new StringBuilder();
        catalogo.append("\nCATALOGO\n----------------");
        for (Libro libro : getBiblioteca().getLibri()) {
            if (libro != null) {
                catalogo.append("\n").append(libro.getInfo()).append("\n----------------");
            }
        }
        return catalogo.append("\n").toString();
    }

    public String visualizzaPrestiti() {
        StringBuilder prestiti = new StringBuilder();
        prestiti.append("\nPRESTITI\n----------------");
        for (Prestito prestito : getBiblioteca().getPrestiti()) {
            if (prestito != null) {
                prestiti.append("\n").append(prestito.getInfo()).append("\n----------------");
            }
        }
        return prestiti.append("\n").toString();
    }

    @Override
    public void aggiungiLibro(Libro libro) {
        Biblioteca biblioteca = getBiblioteca();

        //Controlla se l'utente è registrato in biblioteca
        if (biblioteca == null) {
            System.out.println("L'utente non è registrato in nessuna biblioteca");
            return;
        }

        biblioteca.aggiungiLibro(libro);
    }

    @Override
    public void eliminaLibro(int idLibro) {
        Biblioteca biblioteca = getBiblioteca();

        //Controlla se l'utente è registrato in biblioteca
        if (biblioteca == null) {
            System.out.println("L'utente non è registrato in nessuna biblioteca");
            return;
        }

        biblioteca.eliminaLibro(idLibro);
    }

    @Override
    public String visualizzaLibro(int idLibro) {
        Biblioteca biblioteca = getBiblioteca();

        //Controlla se l'utente è registrato in biblioteca
        if (biblioteca == null) {
            return "L'utente non è registrato in nessuna biblioteca";
        }

        return biblioteca.visualizzaLibro(idLibro);
    }

    @Override
    public void aggiungiUtente(Utente utente) {
        Biblioteca biblioteca = getBiblioteca();

        //Controlla se l'utente è registrato in biblioteca
        if (biblioteca == null) {
            System.out.println("L'utente non è registrato in nessuna biblioteca");
            return;
        }

        biblioteca.aggiungiUtente(utente);
    }

    @Override
    public void eliminaUtente(int numeroTessera) {
        Biblioteca biblioteca = getBiblioteca();

        //Controlla se l'utente è registrato in biblioteca
        if (biblioteca == null) {
            System.out.println("L'utente non è registrato in nessuna biblioteca");
            return;
        }

        biblioteca.eliminaUtente(numeroTessera);
    }

    @Override
    public String visualizzaUtente(int numeroTessera) {
        Biblioteca biblioteca = getBiblioteca();

        //Controlla se l'utente è registrato in biblioteca
        if (biblioteca == null) {
            return "L'utente non è registrato in nessuna biblioteca";
        }

        return biblioteca.visualizzaUtente(numeroTessera);
    }

    @Override
    public void iniziaPrestito(int idLibro, int numeroTessera, int prolungamentoPrestito) {
        Biblioteca biblioteca = getBiblioteca();

        //Controlla se l'utente è registrato in biblioteca
        if (biblioteca == null) {
            System.out.println("L'utente non è registrato in nessuna biblioteca");
            return;
        }

        biblioteca.iniziaPrestito(idLibro, numeroTessera, prolungamentoPrestito);
    }

    @Override
    public void chiudiPrestito(int idLibro) {
        Biblioteca biblioteca = getBiblioteca();

        //Controlla se l'utente è registrato in biblioteca
        if (biblioteca == null) {
            System.out.println("L'utente non è registrato in nessuna biblioteca");
            return;
        }

        biblioteca.chiudiPrestito(idLibro);
    }

}
