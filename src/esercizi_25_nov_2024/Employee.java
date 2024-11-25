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
