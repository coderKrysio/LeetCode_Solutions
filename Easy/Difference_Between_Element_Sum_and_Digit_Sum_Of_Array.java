//Question No: 2535
package Easy;

public class Difference_Between_Element_Sum_and_Digit_Sum_Of_Array {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int x: nums){
            sum += x;
            int t = x;
            while(x>0) {
                t = x%10;
                sum -= t;
                x = x/10;
            }
        }
        return Math.abs(sum);
    }
}
