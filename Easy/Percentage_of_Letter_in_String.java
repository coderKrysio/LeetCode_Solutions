//Question No: 2278
package Easy;

public class Percentage_of_Letter_in_String {
    public int percentageLetter(String s, char letter) {
        int c = 0;
        for(int x = 0; x < s.length(); x++) {
            char ch = s.charAt(x);
            if(ch == letter) c++;
        }
        return c > 0 ? (int) Math.floor((double) c / s.length() * 100) : 0;
    }
}
