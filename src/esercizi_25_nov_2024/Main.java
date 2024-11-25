package esercizi_25_nov_2024;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Mario", 23, "Università degli studi di Roma \"La Sapienza\"");
        student.displayInfo();

        System.out.println("\n-----------------------");

        Employee[] employees = new Employee[] {
                new Manager("Steve", 2000, 5),
                new Developer("Mark", 2500, "Python")
        };

        for (Employee employee : employees) {
            System.out.println();
            employee.displayDetails();
        }
    }
}
