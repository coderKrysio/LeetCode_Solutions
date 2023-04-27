//Question No: 2520
package Easy;

public class Count_Digits_Dividing_No {
    public int countDigits(int num) {
        int count = 0;
        for(int x=num;x!=0;x/=10){
            if(num % (x % 10) == 0) count++;
        }
        return count;
    }
}
