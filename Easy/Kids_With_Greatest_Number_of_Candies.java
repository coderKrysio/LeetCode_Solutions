//Question No: 1431
package Easy;

import java.util.*;

public class Kids_With_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int t[] = candies.clone();;
        Arrays.sort(t);
        int max = t[t.length-1];
        for(int x: candies) {
            if(x+extraCandies >= max) arr.add(true);
            else arr.add(false);
        }
        return arr;
    }
}
