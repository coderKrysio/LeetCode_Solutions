//Question No: 434
package Easy;

public class Number_of_Segments_in_String {
    public int countSegments(String s) {
        int c=0;
        for(int x=0;x<s.length();x++){
            if((x==0 || s.charAt(x - 1) == ' ') && s.charAt(x) != ' '){
                c++;
            }
        }
        return c;
    }
}
