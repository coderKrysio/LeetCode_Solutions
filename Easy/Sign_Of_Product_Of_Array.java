//Question No: 1822
package Easy;

public class Sign_Of_Product_Of_Array {
    public int arraySign(int[] nums) {
        double product = 1;
        for(int x: nums){
            product *= x;
        }
        return product>0 ? 1 : (product<0 ? -1 : 0);
    }
}
