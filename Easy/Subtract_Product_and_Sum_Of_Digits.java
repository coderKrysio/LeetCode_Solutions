//Question No: 1281
package Easy;

public class Subtract_Product_and_Sum_Of_Digits {
    public int subtractProductAndSum(int n) {
        int d,prod=1,sum=0;
        while(n!=0) {
            d=n%10;
            prod=prod*d;
            sum=sum+d;
            n=n/10;
        }
        return prod-sum;
    }
}
