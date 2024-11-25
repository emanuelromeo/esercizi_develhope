package esercizi_25_nov_2024;

public class Student extends Person {

    private String university;

    public Student(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    @Override
    public void displayInfo() {
        System.out.println("Nome: " + name + "\nEtà: " + age + "\nUniversità: " + university);
    }
}
