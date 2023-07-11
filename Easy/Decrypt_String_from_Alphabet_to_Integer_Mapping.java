//Question No: 1309
package Easy;

public class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public String freqAlphabets(String s) {
        String res = "";
        for(int x = 0; x < s.length(); x++) {
            if (x + 2 < s.length() && s.charAt(x + 2) == '#') {
                int num = Integer.parseInt(s.substring(x, x + 2)) - 10;
                res += (char) ('j' + num);
                x += 2;
            } else {
                res += (char) ('a' + s.charAt(x) - '0' - 1);
            }
        }
        return res;
    }
}
