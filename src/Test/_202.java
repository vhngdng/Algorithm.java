import java.util.Arrays;

public class _202 {
    /*
     * Write an algorithm to determine if a number n is happy.
     * 
     * A happy number is a number defined by the following process:
     * 
     * Starting with any positive integer, replace the number by the sum of the
     * squares of its digits.
     * Repeat the process until the number equals 1 (where it will stay), or it
     * loops endlessly in a cycle which does not include 1.
     * Those numbers for which this process ends in 1 are happy.
     * Return true if n is a happy number, and false if not.
     * 
     * 1 <= n <= 231 - 1
     * 
     */

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    public static boolean isHappy(int n) {
        boolean isValid = false;
        String str = String.valueOf(n);
        if (str.length() == 1 && n != 1) {
        int arr[] = new int[2];
            arr = convertToArray(n);
            int result = changeNumber(arr);
            isValid = isHappy(result);
            return isValid;
        }else if (str.length() == 1 && n == 1)
            isValid = true;
        else {
            int[] arr = convertToArray(n);
            int result = changeNumber(arr);
            if (result == 1) {
                return true;
            }else {  
                   isValid = isHappy(result);
                   return isValid;
            }
            
        }
        return isValid;


    }

    public static int changeNumber(int[] arr) {
        int result = 0;
       for (int list: arr) {
        result += Math.pow(list, 2);
       }
        return result;
    }

    public static int[] convertToArray(int n) {
        String str = String.valueOf(n);
        int length = str.length();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.valueOf(String.valueOf(str.charAt(i)));
        }

        return arr;
    }

}
