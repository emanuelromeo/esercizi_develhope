// Ordinare un array di numeri interi in ordine crescente

package esercizi_18_nov_2024;

public class ArrayCrescente {
    public static void main(String[] args) {

        int[] numeri = {5, 3, 8, 1, 2};
        Array.printIn(numeri);

        int temp;

        for (int i = 0; i < numeri.length - 1; i++) {
            for (int j = i + 1; j < numeri.length; j++) {
                   if (numeri[j] < numeri[i]) {
                       temp = numeri[j];
                       numeri[j] = numeri[i];
                       numeri[i] = temp;
                   }
            }
        }

        Array.printOut(numeri);
    }
}
