//Question No: 27
package Easy;

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        for(int x=0;x<nums.length;x++) {
            if(nums[x]!=val) {
                int t = nums[c];
                nums[c] = nums[x];
                nums[x] = t;
                c++;
            }
        }
        return c;
    }
}
