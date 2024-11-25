package esercizi_25_nov_2024;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Nome: " + name + "\nEtà: " + age);
    }
}
