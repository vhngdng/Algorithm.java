import java.util.Arrays;

public class _1122 {
    /*
     * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all
     * elements in arr2 are also in arr1.
     * 
     * Sort the elements of arr1 such that the relative ordering of items in arr1
     * are the same as in arr2. Elements that do not appear in arr2 should be placed
     * at the end of arr1 in ascending order.
     */
    public static void main(String[] args) {
        // [26,21,11,20,50,34,1,18]
// [21,11,26,20]
        int[] arr1 = {26,21,11,20,50,34,1,18};
        int[] arr2 = {21,11,26,20};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int k = 0;
        int l = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = k; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    l = arr1[k];
                    arr1[k++] = arr2[i];
                    arr1[j] = l;
                }
            }
        }
        
        for (int i = k; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] > arr1[j]) {
                    l = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = l;

                }
            }
        }
        return arr1;
    }
}