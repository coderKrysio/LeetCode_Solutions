//Question No: 342
package Easy;

public class Power_Of_Four {
    public boolean isPowerOfFour(int n) {
        if(n==0) return false;
        else {
            while(n%4==0) n=n/4;
            if(n==1) return true;
        }    
        return false;
    }
}
