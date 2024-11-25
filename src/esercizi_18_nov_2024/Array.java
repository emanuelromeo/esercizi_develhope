// Questa classe ha il solo scopo di semplificare la stampa degli input e degli output dei vari esercizi

package esercizi_18_nov_2024;

public class Array {

    public static void printIn(int[] array) {
        System.out.print("Input: [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static void printIn(String[] array) {
        System.out.print("Input: [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static void printOut(int[] array) {
        System.out.print("Output: [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    public static void printOut(String[] array) {
        System.out.print("Output: [");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}
