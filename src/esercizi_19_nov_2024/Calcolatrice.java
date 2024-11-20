package esercizi_19_nov_2024;

import java.util.Scanner;

public class Calcolatrice {

    private static double addizione(double a, double b) {
        return a + b;
    }

    private static double sottrazione(double a, double b) {
        return a - b;
    }

    private static double moltiplicazione(double a, double b) {
        return a * b;
    }

    private static double[] divisione(double a, double b) {
        double[] result = {a, 0};
        if (b != 0){
            result[0] = a / b;
            result[1]++;
        }
        return result;
    }

    private static double[] richiediNumeri(Scanner scanner) {
        double[] numbers = new double[2];

        System.out.print("\nPrimo numero: ");
        numbers[0] = scanner.nextDouble();

        System.out.print("Secondo numero: ");
        numbers[1] = scanner.nextDouble();

        return numbers;
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleziona un'operazione:\n\n>> Addizione\n>> Sottrazione\n>> Moltiplicazione\n>> Divisione\n");
        String operazione = scanner.next();
        double[] numbers = new double[2];

        switch (operazione.toLowerCase()) {
            case "addizione":
                numbers = richiediNumeri(scanner);
                System.out.println("\nLa somma tra questi due numeri è: " + addizione(numbers[0], numbers[1]));
                break;
            case "sottrazione":
                numbers = richiediNumeri(scanner);
                System.out.println("\nLa differenza tra questi due numeri è: " + sottrazione(numbers[0], numbers[1]));
                break;
            case "divisione":
                numbers = richiediNumeri(scanner);
                double[] result = divisione(numbers[0], numbers[1]);
                if (result[1] == 1){
                    System.out.println("\nIl rapporto tra questi due numeri è: " + result[0]);
                } else {
                    System.out.println("\nLa divisione per zero è indefinita");
                }
                break;
            case "moltiplicazione":
                numbers = richiediNumeri(scanner);
                System.out.println("\nIl prodotto tra questi due numeri è: " + moltiplicazione(numbers[0], numbers[1]));
                break;
            default:
                System.out.println("\nOperazione non valida\n");
                menu();
                break;
        }

        scanner.close();
    }

}
