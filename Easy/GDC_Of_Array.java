//Question No: 1979
package Easy;

public class GDC_Of_Array {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int x: nums) {
            if(x>max) max = x;
            if(x<min) min = x;
        }
        int gdc = 1;
        for(int x=2;x<=(max+min)/2;x++) {
            if(max%x==0 && min%x==0) gdc = x;
        }
        return gdc;
    }
}
