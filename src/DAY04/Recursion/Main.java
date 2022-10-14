package DAY04.Recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // recursion();
        System.out.println(f(5));
        System.out.println(giaiThua(5));
        System.out.println(fibonacy(5));
        System.out.println("De quy: " + DeQuyFibonacci(6));
    }

    public static void recursion() {
        System.out.println("Đệ quy");
        recursion();
    }

    public static int giaiThua (int n) {
        if (n == 0) return 1;
        else return n*giaiThua(n - 1);
        
        
    }

    public static int f(int n) {
        int result = 1;
        if (n == 0 || n == 1) {
            return result;
        }else {
            for (int i = 2;i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }

    public static int fibonacy(int n) {
        int[] f = new int [n + 2];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i -1] + f[i -2];
        }
        return f[n];
    }

    public static int DeQuyFibonacci (int n) {
        switch (n) {
            case 0, 1: return n;
            default: return DeQuyFibonacci(n - 1) + DeQuyFibonacci(n - 2);
        }
    }
}
