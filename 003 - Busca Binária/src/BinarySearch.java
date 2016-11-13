import java.util.Arrays;

public class BinarySearch {

    public static boolean search(int[] array, int valorDeBusca) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int media = (inicio + fim) / 2;
            if (array[media] == valorDeBusca) {
                return true;
            }
            if (array[media] > valorDeBusca) {
                fim = media - 1;
            } else {
                inicio = media + 1;
            }
        }
        return false;
    }

}
