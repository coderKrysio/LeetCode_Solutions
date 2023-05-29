//Question No: 268
package Easy;

public class Missing_Number {
    public int missingNumber(int[] nums) {
        int n = nums.length*(nums.length+1)/2;
        for(int x: nums) n-=x;
        return n;
    }
}
