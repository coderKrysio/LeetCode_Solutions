//Question No: 2529
package Easy;

public class Maximum_Count_Of_Positive_Negative_Integers {
    public int maximumCount(int[] nums) {
        int pc = 0;
        int nc = 0;
        for (int x = 0; x < nums.length ; x++) {
            if (nums[x] < 0) nc++;
            else if (nums[x] > 0) pc++;
        }
        int ans = Math.max(nc ,pc);
        return ans;
    }
}
