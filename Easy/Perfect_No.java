//Question No: 507
package Easy;

public class Perfect_No {
    public boolean checkPerfectNumber(int num) {
        if(num%2!=0) return false;
        int sum = 0;
        for(int x=1;x<=num/2;x++){
            if(num%x==0) sum += x;
        }
        return sum==num;
    }
}
