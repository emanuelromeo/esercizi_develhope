package esercizi_25_nov_2024;

public class Developer extends Employee {

    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Nome: " + name + "\nStipendio: " + salary + "\nLinguaggio di programmazione: " + programmingLanguage);
    }
}
