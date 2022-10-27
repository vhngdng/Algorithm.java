package DAY01;

import java.util.Arrays;

public class _88 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int[] nums3 = { 1, 0 };
        int[] nums4 = { 2 };

        merge(nums3, 1, nums4, 1);
        System.out.println(Arrays.toString(nums3));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = n - nums2.length;
        if (m == 0) {
            if (n >= 0) System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        if (n == 0) {
            return;
        }
        
        for (int i = m; i < nums1.length; i++) {
            if (k == nums2.length) {
                break;
            }
            nums1[i] = nums2[0];
            nums2 = Arrays.copyOfRange(nums2, 1, n--);
        }
        Arrays.sort(nums1);

    }
}
