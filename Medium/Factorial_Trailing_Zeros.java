//Question No: 172
package Medium;

public class Factorial_Trailing_Zeros {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n/=5;
            count+=n;
        }     
        return count;
    }
}
