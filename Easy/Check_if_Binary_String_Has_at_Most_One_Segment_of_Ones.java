//Question No: 1784
package Easy;

public class Check_if_Binary_String_Has_at_Most_One_Segment_of_Ones {
    public boolean checkOnesSegment(String s) {
        for(int x = 1; x < s.length() - 1; x++) {
            if(s.charAt(x) == '0' && s.charAt(x + 1) == '1') return false;
        }
        return true;
    }
}
