import java.util.Arrays;

public class _283 {
    // Given an integer array nums, move all 0's to the end of it while maintaining
    // the relative order of the non-zero elements.

    // Note that you must do this in-place without making a copy of the array.
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int k = 0;
        int j = 0;
        if (nums.length == 1)
            return;
        else if (nums.length == 2 && nums[0] == 0) {
            nums[0] = nums[1];
            nums[1] = 0;
        } else if (nums.length == 2 && nums[1] == 0)
            return;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                k++;
            }else{
                nums[j++] = nums[i];
            }
        }
        for (int m = nums.length -1; m >= nums.length -k; m--) {
            nums[m] = 0;
        }

    }
}
