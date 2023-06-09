//Question No: 26
package Easy;

public class Remove_Duplicates_from_Sorted_Arrays {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;
        int k = 1;
        for(int x=0;x<nums.length-1;x++) {
            if(nums[x] < nums[x+1]){
                nums[k] = nums[x+1];
                k++;
            }
        }
        return k;
    }
}
