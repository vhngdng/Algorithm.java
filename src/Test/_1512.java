public class _1512 {



    /* Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.

1 <= nums.length <= 100
1 <= nums[i] <= 100

*/
    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs( a ));
    }

    public static int numIdenticalPairs(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    result++;
                }
            }
        }
        
        return result;
    }
}
