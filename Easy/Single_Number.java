//Question No: 136
package Easy;

import java.util.Arrays;

public class Single_Number {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int x=0;x<nums.length-1;x++) {
            for(int y=x+1;y<nums.length;y++) {
                if(nums[x]==nums[y]) {
                    x++;
                    break;
                }
                if(y==nums.length-1) return nums[x];
            }
        }
        return nums[nums.length-1];
    }
}
