import java.util.Arrays;

public class _905 {
    // Given an integer array nums, move all the even integers at the beginning of
    // the array followed by all the odd integers.

    // Return any array that satisfies this condition.
    public static void main(String[] args) {
        int[] nums = { 3,1,2,4 };
        sortArrayByParity(nums);
        System.out.println(Arrays.toString(nums) );
        System.out.println(nums[0]);
    }

    public static int[] sortArrayByParity(int[] nums) {
        int length = nums.length;
        int m = 0;
        int n = 0;
        int[] arr = new int[length];
        if (length == 1)
            return nums;
        else {
            for (int i = 0; i < length; i++) {
                if (nums[i] % 2 == 0 || nums[i] == 0) {
                    nums[m++] = nums[i];
                } else {
                    arr[n++] = nums[i];
                }
            }     
            for (int i = 0; i < n; i++) {
                nums[m + i] = arr[i]; 
            }
            return nums;
        }

    }
}
