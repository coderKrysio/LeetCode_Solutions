//Question No: 2710
package Easy;

public class Remove_Trailing_Zeros_From_a_String {
    public String removeTrailingZeros(String num) {
        int i = num.length();
        for(int x = num.length(); x >= 0; x--) {
            if(num.charAt(x - 1) != '0') {
                i = x;
                break;
            }
            
        }
        return i == num.length() ? num : num.substring(0, i);
    }
}
