public class _1672 {
    public static void main(String[] args) {
        int account[][] = { { 1, 2, 3 }, { 3, 2, 1 } };
        System.out.println(maximumWealth(account));
    }

    public static int maximumWealth(int[][] accounts) {
        int result = 0;
        int sum = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts.length + 1; j++) {
                sum += accounts[i][j];
                System.out.println("sum" + sum);
                System.out.println(accounts[i][j]);
                if (j == accounts.length ) {
                    // sum += accounts[0][j];
                    if (result <= sum) {
                        result = sum;
                    }
                    
                    sum = 0;
                }
            }
        }

        return result;
    }
}