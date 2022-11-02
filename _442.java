import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class _442 {
    public static void main(String[] args) {
        
    }
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> numSet = new LinkedHashSet<>();
        Set<Integer> numSet2 = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i ++) {
            if (!numSet.contains(nums[i])) {
                numSet.add(nums[i]);
            }else{
                numSet2.add(nums[i]);
                
            }
        }
        result = numSet2.stream().toList();
        return result;

    }
}
