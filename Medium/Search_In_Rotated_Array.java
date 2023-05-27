//Question No: 33
package Medium;

public class Search_In_Rotated_Array {
    public int search(int[] nums, int target) {
        for(int x=0;x<nums.length;x++) {
            if(target==nums[x]) return x;
        }
        return -1;
    }
}
