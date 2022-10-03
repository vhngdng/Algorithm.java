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
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (n == 0) {
            return;
        }

        int[] cloneArray = new int[m + n];
        int k = 0;
        int j = 0;
        for (int i = m + n - 1; i >= 0; i--) {
            

            if (k == m + n) break;

            if (n > 1 && nums1[i] != 0 && nums1[i] > nums2[n - 1 - j]) {
                
                cloneArray[m + n - 1 - k++] = nums1[i];
                
            } else if (n > 1 && nums1[i] != 0 && nums1[i] == nums2[n - 1 - j]) {
                
                cloneArray[m + n - 1 - k++] = nums1[i];
                cloneArray[m + n - 1 - k++] = nums2[n - 1 - j++];
                
            } else if (n > 1 && nums1[i] != 0 && nums1[i] < nums2[n - 1 - j]) {
                
                cloneArray[m + n - 1 - k++] = nums2[n - 1 - j++];
                i++;
            }   
            if (j == n && nums1[i] != 0) {
                cloneArray[m + n - 1 - k++] = nums1[--i];
            } else if (i == 0) {

            cloneArray[m + n - 1 - k++] = nums2[n - 1 - j++];
            }

        }
        for (int i = 0; i < cloneArray.length; i ++) nums1[i] = cloneArray[i];
        System.out.println(Arrays.toString(cloneArray));
        nums1 = cloneArray;

    }
}
