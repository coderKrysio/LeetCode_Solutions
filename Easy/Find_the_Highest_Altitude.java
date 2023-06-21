//Question No: 1732
package Easy;

import java.util.Arrays;

public class Find_the_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int al[] = new int[gain.length+1];
        al[0] = 0;
        for(int x = 0;x<gain.length;x++){
            al[x+1] = al[x] + gain[x];
        }
        Arrays.sort(al);
        return al[al.length-1];
    }
}
