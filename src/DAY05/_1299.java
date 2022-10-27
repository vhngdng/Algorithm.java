package DAY05;

import java.util.Arrays;

public class _1299 {
    /*
     * Given an array arr, replace every element in that array with the greatest
     * element among the elements to its right, and replace the last element with
     * -1.
     * 
     * After doing so, return the array.
     */

    public static void main(String[] args) {
        int[] arr = { 17, 18, 5, 4, 6, 1 };
    }

    public static int[] replaceElements(int[] arr) {
        int length = arr.length;
        int firstNum = arr[0];
        int lastElemen = arr[length - 1];
        
        int cloneArray[] = Arrays.copyOfRange(arr, 0, arr.length - 2);
        Arrays.sort(cloneArray);
        String clone =  cloneArray.toString();
        String resultString = arr.toString();
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                if (resultString.charAt(i) == clone.charAt(j)) {
                    arr[i] = cloneArray[j - 1];
                    // clone.ch
                    // cloneArray = test.
                    break;
                }
                    
            }
        }

        return null;
    }
}
