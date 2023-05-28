//Question No: 81
package Medium;

public class Search_In_Rotated_Array_II {
    public boolean search(int[] nums, int target) {
        for(int x: nums) {
            if(target==x) return true;
        }
        return false;
    }
}
