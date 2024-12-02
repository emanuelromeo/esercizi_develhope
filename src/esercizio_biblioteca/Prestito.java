package esercizio_biblioteca;

import java.util.Calendar;
import java.util.Date;

public class Prestito {

    private int idLibro, numeroTessera;
    private Date dataInizio, dataRestituzione;

    public Prestito(int idLibro, int numeroTessera, int durata) {
        this.idLibro = idLibro;
        this.numeroTessera = numeroTessera;
        this.dataInizio = new Date();
        this.dataRestituzione = calcolaRestituzione(durata);
    }

    private Date calcolaRestituzione(int durata) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_MONTH, durata);
        return cal.getTime();
    }

    public int getIdLibro() {
        return idLibro;
    }

    public int getNumeroTessera() {
        return numeroTessera;
    }

    public Date getDataInizio() {
        return dataInizio;
    }

    public Date getDataRestituzione() {
        return dataRestituzione;
    }

    public String getInfo() {
        return String.format("""
                Id libro: %d
                Numero di tessera: %d
                Data di inizio: %tD
                Data di restituzione: %tD""", idLibro, numeroTessera, dataInizio, dataRestituzione);
    }
}
