//Question No: 1837
package Easy;

public class Sum_Of_Digits_In_Base_K {
    public int sumBase(int n, int k) {
        int sum=0;
        while(n>0) {
            sum+=n%k;
            n/=k;
        }
        return sum;
    }
}
