//Question No: 1
package Easy;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int i[] = new int[2];
        for(int x=0;x<nums.length-1;x++){
            for(int y=x+1;y<nums.length;y++){
                if(nums[x]+nums[y]==target){
                    i[0]=x;
                    i[1]=y;
                }
            }
        }
        return i;
    }
}
