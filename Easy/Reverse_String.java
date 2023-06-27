//Question No: 344
package Easy;

public class Reverse_String {
    public void reverseString(char[] s) {
        for(int x = 0; x < s.length / 2; x++) {
            char t = s[x];
            s[x] = s[s.length - 1 - x];
            s[s.length - 1 - x] = t;
        }
    }
}
