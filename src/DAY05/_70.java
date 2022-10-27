package DAY05;

public class _70 {
    /*
     * You are climbing a staircase. It takes n steps to reach the top.
     * 
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can
     * you climb to the top?
     */
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }

    public static int climbStairs(int n) {
        
        switch (n) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:

                int resultArray[] = new int[n + 1];
                resultArray[0] = 0;
                resultArray[1] = 1;
                resultArray[2] = 2;
                for (int i = 3; i <= n; i++) {
                    resultArray[i] = resultArray[i - 1] + resultArray[i - 2];
                }

                return resultArray[n];
        }

    }


    public static int climbStairs2(int n) {
        int[] arr = new int[46];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i ++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
