import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] numList = new int[5];
        int x = 6;

        for (int i = 0; i < 5; i++) {
            numList[i] = i + 1;
            System.out.println(numList[i]);
        }

        int[] numListAdd = new int[6];
        numListAdd[0] = x;
        for (int i = 0; i < 5; i++) {
            numListAdd[i + 1] = numList[i];

        }

        System.out.println(Arrays.toString(numListAdd));

        int[] array = new int[6];
        for (int i = 0; i < 5; i++) {
            array[i] = numList[i];
        }

        array[5] = x;

        System.out.println(Arrays.toString(array));
        // System.out.println(Arrays.toString(insertLast(array, 6)));

        int[] arrayX = { 5, 7, 1, 9, 3, 2 };

        System.out.println(Arrays.toString(sortDesc(arrayX)));

    }

    // public static int[] insertLast(int[] array, int x) {
    // int[] array1 = new int[x];
    // for (int i = 0; i < 5; i++) {
    // if(i == array1.length -1) array1[i] = x;
    // else array1[i] = array[i];
    // }
    // return array1;
    // }

    public static int[] insert(int[] array1, int x, int position) {
        int[] array2 = new int[x];
        array2[position + 1] = array2[position];
        array2[position] = x;

        return array2;
    }

    public static int[] sortDesc(int[] array) {
        int n = 0;

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    n = array[i];
                    array[i] = array[j];
                    array[j] = n;

                }
            }
        }

        return array;

    }

}