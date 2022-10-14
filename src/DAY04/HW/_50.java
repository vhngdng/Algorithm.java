package DAY04.HW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

// Example 1:

// Input: x = 2.00000, n = 10
// Output: 1024.00000
// Example 2:

// Input: x = 2.10000, n = 3
// Output: 9.26100
// Example 3:

// Input: x = 2.00000, n = -2
// Output: 0.25000
// Explanation: 2^-2 = 1/(2^2) = 1/4 = 0.25

// Constraints:

// -100.0 < x < 100.0
// -2^31 <= n <= 2^31-1
// n is an integer.
// -10^4 <= xn <= 10^4

public class _50 {
    public static void main(String[] args) {
        System.out.println(myPow(7, 7));
        System.out.println(nonRecur(
                2.00000,
                -2));

    }

    public static double myPow(double x, int n) {
        if (n == 0)
            return 1;
        else if (n > 0) {
            --n;
            x *= myPow(x, n);
            return x;
        } else {
            ++n;
            x /= myPow(x, n);
            return 1 / x;
        }
        
    }

    public static double nonRecur(double x, int n) {
        double result = 1.0;
        long N = n;
        if (n < 0) {
            x = 1 / x;
            N *= -1;
        }
        double y = x;
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                result *= y;
            }
            y *= y;
        }
        return result;
    }



}
