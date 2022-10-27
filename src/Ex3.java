import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] result = new int[2];
        int k = 0;
        
        for (int i = 0; i < nums.length -1; i ++) {
            if (nums[i] >= 9) break;
            else {
                int x = 9 - nums[i];
                for (int j = nums.length -1; j > 0; j--) {
                    if (x == nums[j]) {
                        result[k] = i;
                        result[k + 1] = j;
                    };
                }
            }

        }
        System.out.println(Arrays.toString(result));
    }

    
}
