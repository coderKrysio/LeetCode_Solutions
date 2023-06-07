//Question No: 1768
package Easy;

public class Merge_Strings_Alternately {
    public String mergeAlternately(String word1, String word2) {
        int m = Math.min(word1.length(),word2.length());
        String s = "";
        for(int x=0;x<m;x++) {
            s = s + (char)word1.charAt(x) + (char)word2.charAt(x);
        }
        return m==word1.length() ? s+word2.substring(m) : s+word1.substring(m);
    }
}
