
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] array) {
        int temp = array[1];
        for (int x : array) {
            if (temp > x) {
                temp = x;
            }
        }
        return temp;
    }

    public static int indexOfTheSmallest(int[] array) {

        int i = 0;
        for (int x : array) {
            if (x == smallest(array)) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int j = index;
        int temp = array[index];
        for (int i = index; i < array.length; i++) {
            if (temp > array[i]) {
                temp = array[i];
            }
        }

        for (int i = index; i < array.length; i++) {
            if (temp == array[i]) {
                break;
            } else {
                j++;
            }
        }

        return j;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = 0;
        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int theIndexOfTheSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, theIndexOfTheSmallest);
            System.out.println( Arrays.toString(array) );
        }
    }

}
