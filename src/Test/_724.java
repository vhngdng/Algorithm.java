import java.util.Arrays;

public class _724 {


    /*
     * Given an array of integers nums, calculate the pivot index of this array.

The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.

If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.

Return the leftmost pivot index. If no such index exists, return -1.

1 <= nums.length <= 104
-1000 <= nums[i] <= 1000
     */
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }


    public static int pivotIndex(int[] nums) {
        int leftSum = -1;
        int rightSum = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) leftSum = 0;
            else {
            int[]left = Arrays.copyOfRange(nums, 0, i);
            leftSum = sum(left);
            }

            if (i == nums.length - 1) rightSum = 0;
            else {
            int[]right = Arrays.copyOfRange(nums, i + 1, nums.length);
            rightSum = sum(right);
            }
            if (leftSum == rightSum) return i;
        }

        return -1;
    }


    public static int sum(int[] nums) {
        int sum = 0;
        for (int list: nums) sum += list;
        return sum;
    }
}
