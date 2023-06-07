//Question No: 077
package Easy;

import java.util.Arrays;

public class Squares_of_Sorted_Array {
    public int[] sortedSquares(int[] nums) {
        for(int x=0;x<nums.length;x++) {
            nums[x] *= nums[x];
        }
        Arrays.sort(nums);
        return nums;
    }
}
