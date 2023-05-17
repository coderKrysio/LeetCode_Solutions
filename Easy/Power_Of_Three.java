//Question No: 326
package Easy;

public class Power_Of_Two {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        else {
            while(n%3==0) n=n/3;
            if(n==1) return true;
        }    
        return false;
    }
}
