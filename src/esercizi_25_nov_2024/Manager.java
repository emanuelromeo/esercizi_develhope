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
