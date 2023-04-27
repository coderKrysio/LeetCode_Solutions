//Question No: 34
package Medium;

public class First_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int iar[] = {-1,-1};
        for(int x = 0;x<nums.length;x++) {
        	if(nums[x] == target) {
        		iar[0] = x;
        		while(x<nums.length && nums[x]==target) {
        			iar[1] = x;
        			x++;
        		}
                break;
        	}
        }
        return iar;
	}
}
