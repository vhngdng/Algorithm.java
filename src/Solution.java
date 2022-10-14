import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };

        for (int i = 0; i < nums.length - 1; i++) {
            String string = String.valueOf(nums[i]);
            if (string.length() % 2 == 0)
                System.out.println(string);
        }

        int[] nums2 = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5 };
        System.out.println(Arrays.toString(result(nums2)));
    }

    public static void removeDuplicate() {
        int[] nums = { 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5 };

    }

    public static int[] result(int[] nums) {

        int[] result = new int[nums.length - 1];
        int j = 0;
        int k = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1] && (i + 1) < nums.length) {

                result[j] = nums[i];
                j++;
                if (result[j] != result[j - 1] && j > 1) {
                    k = j;
                }
            }
            if (nums[nums.length - 1] != nums[nums.length - 2])
                result[k] = nums[nums.length - 1];

        }
        return result;
    }

}
