//Question No: 2553
package Easy;

import java.util.LinkedList;
import java.util.List;

public class Separate_Digits_In_Array {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new LinkedList<Integer>();
        for(int x: nums){
            String d = String.valueOf(x);
            for(char ch: d.toCharArray()){
                list.add(Character.getNumericValue(ch));
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
