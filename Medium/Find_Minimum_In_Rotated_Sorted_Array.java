//Question No: 153
package Medium;

public class Find_Minimum_In_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int min = nums[0];
        for(int x: nums) {
            if(x<min) min = x;
        }
        return min;
    }
}
