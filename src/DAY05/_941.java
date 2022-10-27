package DAY05;

import java.util.Arrays;

public class _941 {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 2, 1 };
        System.out.println(validMountainArray(arr));
    }

    public static boolean validMountainArray(int[] arr) {
        boolean isValid = false;
        int lastElement = arr.length - 1;
        String str = Arrays.toString(arr);
        int[] clone = Arrays.copyOfRange(arr, 0, lastElement + 1);
        Arrays.sort(clone);
        int indexOfHightestNum = str.indexOf((String.valueOf(clone[lastElement])));
        if (indexOfHightestNum > 0 && indexOfHightestNum < lastElement) {
            for (int i = 0; i < indexOfHightestNum; i++) {
                if (i + indexOfHightestNum <= lastElement && arr[i] < arr[i + 1]
                        && arr[indexOfHightestNum + i] > arr[i + indexOfHightestNum + 1]) {
                    isValid = true;
                } else {
                    return false;
                }
            }

        } else {
            return isValid;
        }
        return isValid;
    }
}
