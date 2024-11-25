//Crea una classe base Employee con:
//Attributi: String name, double salary.
//Metodo: void displayDetails() che stampa nome e stipendio.

//Crea due classi derivate:
//Manager aggiunge un attributo int numberOfEmployeesManaged.
//Developer aggiunge un attributo String programmingLanguage.
//Sovrascrivi il metodo displayDetails() per includere i nuovi attributi.
//Crea un array di oggetti Employee contenente sia Manager che Developer, e chiama il metodo displayDetails().

package esercizi_25_nov_2024;

public class Manager extends Employee {

    private int numberOfEmployeesManaged;

    public Manager(String name, double salary, int numberOfEmployeesManaged) {
        super(name, salary);
        this.numberOfEmployeesManaged = numberOfEmployeesManaged;
    }

    @Override
    public void displayDetails() {
        System.out.println("Nome: " + name + "\nStipendio: " + salary + "\nNumero di dipendenti gestiti: " + numberOfEmployeesManaged);
    }
}
