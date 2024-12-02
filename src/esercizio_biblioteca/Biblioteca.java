package esercizio_biblioteca;

public class Biblioteca implements Gestibile, Ricercabile {

    //Durata massima di base di un prestito
    private int durataPrestito;

    private Libro[] libri;
    private int numeroLibri;

    private Utente[] utenti;
    private int numeroUtenti;

    private Prestito[] prestiti;

    public Biblioteca(int capacitàLibri, int capacitàUtenti, int durataPrestito) {
        libri = new Libro[capacitàLibri];
        utenti = new Utente[capacitàUtenti];
        prestiti = new Prestito[capacitàLibri];
        this.durataPrestito = durataPrestito;
    }


    @Override
    public void aggiungiLibro(Libro libro) {
        //Controllo che ci sia spazio nella biblioteca
        if (numeroLibri >= libri.length) {
            System.out.println("Biblioteca piena, impossibile aggiungere libro " + libro.getId());
            return;
        }

        int index = -1;
        for (int i = 0; i < libri.length; i++) {
            //Controllo che il libro non sia già presente
            if (libri[i] != null && libri[i].getId() == libro.getId()) {
                System.out.println("Libro " + libro.getId() + " già presente");
                return;
            }
            //Salvo la prima posizione disponibile
            if(index == -1 && libri[i] == null) {
                index = i;
            }
        }

        libri[index] = libro;
        numeroLibri++;
        System.out.printf("Libro " + libro.getId() + " aggiunto in posizione %d\n", index);
    }

    @Override
    public void eliminaLibro(int idLibro) {
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] != null && libri[i].getId() == idLibro) {
                libri[i] = null;
                numeroLibri--;
                System.out.println("Libro " + idLibro + " eliminato");
                return;
            }
        }
        System.out.println("Libro " + idLibro + " non trovato");
    }

    @Override
    public String visualizzaLibro(int idLibro) {
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] != null && libri[i].getId() == idLibro) {
                return libri[i].getInfo();
            }
        }
        return "Libro " + idLibro + " non trovato";
    }

    @Override
    public void aggiungiUtente(Utente utente) {
        //Controllo che ci sia spazio nella biblioteca
        if (numeroUtenti >= utenti.length) {
            System.out.println("Limite di utenti raggiunto");
            return;
        }

        int index = -1;
        for (int i = 0; i < utenti.length; i++) {
            //Controllo che l'utente non sia già registrato
            if (utenti[i] != null && utenti[i].getNumeroTessera() == utente.getNumeroTessera()) {
                System.out.println("Utente " + utente.getNumeroTessera() + " già registrato");
                return;
            }
            //Salvo la prima posizione disponibile
            if(index == -1 && utenti[i] == null) {
                index = i;
            }
        }

        utenti[index] = utente;
        utente.setBiblioteca(this);
        numeroUtenti++;
        System.out.println("Utente " + utente.getNumeroTessera() + " registrato correttamente");
    }

    @Override
    public void eliminaUtente(int numeroTessera) {
        for (int i = 0; i < utenti.length; i++) {
            if (utenti[i] != null && utenti[i].getNumeroTessera() == numeroTessera) {
                utenti[i].setBiblioteca(null);
                utenti[i] = null;
                numeroUtenti--;
                System.out.println("Utente " + numeroTessera + " eliminato");
                return;
            }
        }
        System.out.println("Utente " + numeroTessera + " non trovato");
    }

    @Override
    public String visualizzaUtente(int numeroTessera) {
        for (int i = 0; i < utenti.length; i++) {
            if (utenti[i] != null && utenti[i].getNumeroTessera() == numeroTessera) {
                return utenti[i].getInfo();
            }
        }
        return "Utente " + numeroTessera + " non trovato";
    }

    @Override
    public void iniziaPrestito(int idLibro, int numeroTessera, int prolungamentoPrestito) {

        //Controllo che il libro sia presente
        boolean isPresent = false;
        for (Libro libro : libri) {
            if (libro != null && libro.getId() == idLibro) {
                isPresent = true;
            }
        }
        if (!isPresent) {
            System.out.println("Libro " + idLibro + " non disponibile");
            return;
        }

        //Controllo che l'utente sia registrato
        boolean isSigned = false;
        for (Utente utente : utenti) {
            if (utente != null && utente.getNumeroTessera() == numeroTessera) {
                isSigned = true;
            }
        }
        if (!isSigned) {
            System.out.println("Utente " + numeroTessera + " non registrato");
            return;
        }

        int index = -1;
        for (int i = 0; i < prestiti.length; i++) {
            //Controllo che il libro sia disponibile
            if (prestiti[i] != null && prestiti[i].getIdLibro() == idLibro) {
                System.out.println("Libro " + idLibro + " già in prestito");
                return;
            }
            //Salvo la prima posizione disponibile nell'array dei prestiti
            if(index == -1 && prestiti[i] == null) {
                index = i;
            }
        }

        prestiti[index] = new Prestito(idLibro, numeroTessera, durataPrestito + prolungamentoPrestito);
        System.out.println("Libro " + idLibro + " preso in prestito correttamente");
    }

    @Override
    public void chiudiPrestito(int idLibro) {
        for (int i = 0; i < prestiti.length; i++) {
            if (prestiti[i] != null && prestiti[i].getIdLibro() == idLibro) {
                prestiti[i] = null;
                System.out.println("Libro " + idLibro + " restituito");
                return;
            }
        }
        System.out.println("Libro " + idLibro + " non in prestito");
    }

    @Override
    public String ricercaLibro(String chiave) {
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] != null && (libri[i].getTitolo().toLowerCase().equals(chiave.toLowerCase()) || libri[i].getAutore().toLowerCase().equals(chiave.toLowerCase()))) {
                return "Libro con titolo o autore \"" + chiave + "\": \n\n" + libri[i].getInfo() + "\n";
            }
        }
        return "Libro con titolo o autore \"" + chiave + "\" non trovato";
    }

    public Libro[] getLibri() {
        return libri;
    }

    public Utente[] getUtenti() {
        return utenti;
    }

    public Prestito[] getPrestiti() {
        return prestiti;
    }
}
