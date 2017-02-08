import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = { -3, 2, 3, 4, 7, 8, 12 };
        Scanner reader = new Scanner(System.in);

        System.out.print("Valores da Array: " + Arrays.toString(array));
        System.out.println();

        System.out.print("Entre o valor de busca: ");
        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        System.out.println(result);
    }
}