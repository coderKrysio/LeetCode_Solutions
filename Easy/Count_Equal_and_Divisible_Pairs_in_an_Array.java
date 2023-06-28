//Question No: 2176
package Easy;

public class Count_Equal_and_Divisible_Pairs_in_an_Array {
    public int countPairs(int[] nums, int k) {
        int c = 0;
        for(int x = 0; x < nums.length - 1; x++) {
            for(int y = x + 1; y < nums.length; y++) {
                if(nums[x] == nums[y] && (x * y) % k == 0) c++;
            }
        }
        return c;
    }
}
