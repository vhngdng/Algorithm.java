package DAY01;

import java.util.Arrays;

public class _27 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int[] nums2 = { 3, 2, 2, 3, 4, 3, 3  };
        int[] nums3 = { 3, 3 };
        int[] nums4 = {1};
        System.out.println(removeElement(nums4, 1));
        System.out.println(Arrays.toString(nums4));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        int[] expectedNums = new int[1];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                k++;
                expectedNums = Arrays.copyOf(expectedNums, k );
                expectedNums[k - 1] = nums[i];
                System.out.println(Arrays.toString(expectedNums));
            }
             
        }
        if (k == 0) {
            expectedNums = Arrays.copyOf(expectedNums, 0);
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < k) nums[i] = expectedNums[i];
            else nums[i] = val;
        }
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(expectedNums));
        return expectedNums.length;

    }
}
