//Question No: 1512
package Easy;

public class No_Of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int x=0;x<nums.length-1;x++){
            for(int y=x+1;y<nums.length;y++){
                if(nums[x]==nums[y]) count++;
            }
        }
        return count;
    }
}
