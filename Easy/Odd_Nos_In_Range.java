//Question No: 1523
package Easy;

public class Odd_Nos_In_Range {
    public int countOdds(int low, int high) {        
        int nums=high-low+1;  //counting total numbers in range
        
		if(low%2!=0 && high%2!=0)  
            return nums/2 + 1;
        
        else
		return nums/2;
    }
}
