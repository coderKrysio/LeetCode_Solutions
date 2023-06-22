//Question No: 1304
package Easy;

public class Find_N_Unique_Integers_sum_upto_Zero {
    public int[] sumZero(int n) {
        int[] ar = new int[n];
        int i = 0;    
        if (n % 2 == 1) ar[i++] = 0;  
        for (int x = 1; x <= n/2; x++) {
            ar[i++] = x;
            ar[i++] = -x;
        }        
        return ar; 
    }
}
