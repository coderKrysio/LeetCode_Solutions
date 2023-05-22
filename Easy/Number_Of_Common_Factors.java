//Question No: 2427
package Easy;

public class Number_Of_Common_Factors {
    public int commonFactors(int a, int b) {
        int count = 0;
        for(int x = 1; x<=(a+b)/2;x++) {
            if(a%x==0 && b%x==0) count++;
        }
        return count;
    }
}
