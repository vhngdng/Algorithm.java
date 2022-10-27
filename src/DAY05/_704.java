package DAY05;

import java.util.Arrays;
import java.util.GregorianCalendar;

public class _704 {
    public static void main(String[] args) {
        /*
         * Given an array of integers nums which is sorted in ascending order, and an
         * integer target, write a function to search target in nums. If target exists,
         * then return its index. Otherwise, return -1.
         * 
         * You must write an algorithm with O(log n) runtime complexity.
         */

        int[] nums = { -1, 0, 3, 5, 9, 12 };
        // System.out.println(search(nums, 3));
        System.out.println(recursionSearch(nums, 9));
    }

    public static int search(int[] nums, int target) {
        
        int result = -1;
        int key = nums.length / 2;
        for (int i = 0; i <= key; i++) {
            if (nums[i] == target) {
                return result = i;
            }else if (nums[i + key] == target && i + key < nums.length/2) {
                return result = i + key;
            }
            if (i > key)
                return result = -1;
            
        }

        return result;
    }

    public static int recursionSearch(int[] nums, int target) {
        
        int result = -1;
        int key = nums.length / 2;
        if (key == 1) {
            for (int i = 0; i < nums.length; i ++ ) {
                if (nums[i] == target) return i;
            }
        }
        int[] resultArray = new int [key];
        if (target == nums[key]) return key;
        else if (target < nums[key]) {
            resultArray = Arrays.copyOfRange(nums, 0, key);
            recursionSearch(resultArray, target);
        }else {
            resultArray = Arrays.copyOfRange(resultArray, key, nums.length -1);
            recursionSearch(resultArray, target);
        }

        
        return result;
    }

    public static int search2(int[] nums, int target, int iLeft, int iRight) {
        if (iLeft> iRight) {
            return -1;
        }

        int iMid = (iLeft + iRight)/2;
        if (nums[iMid] == target) {
            return iMid;
        }else if (nums[iMid] > target) {
            return search2(nums, target, iLeft, iMid - 1);
        }else {
            return search2(nums, target, iMid + 1, iRight);
        }
    }

}
