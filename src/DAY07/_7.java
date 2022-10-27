package DAY07;

import java.util.Arrays;

public class _7 {
    /*
     * Given a signed 32-bit integer x, return x with its digits reversed. If
     * reversing x causes the value to go outside the signed 32-bit integer range
     * [-231, 231 - 1], then return 0.
     * 
     * Assume the environment does not allow you to store 64-bit integers (signed or
     * unsigned).
     */
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        
        String result = String.valueOf(x);
        if (result.length() == 1) return x;
        char[] arr = result.toCharArray();
        
        if (result.length() > 1 && arr[0] != '-') {
            char[] arrResult = new char[arr.length];
            int j = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                arrResult[j++] = arr[i];
                System.out.println(arrResult[j - 1]);
            }

            int num = Integer.valueOf(String.valueOf(arrResult));
            
            if (num <= Math.pow(2, 31) - 1 && num >= -Math.pow(-2, 31))
                ;
            return num;

        } else if (result.length() > 1 && arr[0] == '-') {
            int j = 1;
            char[] arrResult = new char[arr.length];
            arrResult[0] = '-';
            for (int i = arr.length - 1; i >= 1; i--) {
                arrResult[j++] = arr[i];
            }
            System.out.println(Arrays.toString(arrResult));
            int num = Integer.valueOf(String.valueOf(arrResult));
            if (num <= Math.pow(2, 31) - 1 && num >= -Math.pow(-2, 31));
            return num;
        } else {
            return 0;
        }

    }
}
