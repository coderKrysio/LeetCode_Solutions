//Question No: 2733
package Easy;

import java.util.Arrays;

public class Neither_Minimum_or_Maximum {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length < 3) return -1;
        Arrays.sort(nums);
        return nums[1];
    }
}
