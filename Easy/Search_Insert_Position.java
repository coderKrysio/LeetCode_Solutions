//Question No: 35
package Easy;

public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        for(int x = 0;x<nums.length;x++) {
            if(nums[x]+1==target || nums[x]+1<=target && x==nums.length-1) return x+1;
            if(target==nums[x] || target==nums[x]-1 && x>0) return x;
        }
        return 0;
    }
}
