//Question No: 162
package Medium;

public class Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int i = 0;
        for(int x=1;x<nums.length;x++){
            if(nums[x]>max) {
                i=x;
                max = nums[x];
            }
        }
        return i;
    }
}
