//Crea una classe base Employee con:
//Attributi: String name, double salary.
//Metodo: void displayDetails() che stampa nome e stipendio.

//Crea due classi derivate:
//Manager aggiunge un attributo int numberOfEmployeesManaged.
//Developer aggiunge un attributo String programmingLanguage.
//Sovrascrivi il metodo displayDetails() per includere i nuovi attributi.
//Crea un array di oggetti Employee contenente sia Manager che Developer, e chiama il metodo displayDetails().

package esercizi_25_nov_2024;

public class Employee {

    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Nome: " + name + "\nStipendio: " + salary);
    }

}
