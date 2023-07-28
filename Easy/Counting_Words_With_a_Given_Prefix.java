//Question No: 2185
package Easy;

public class Counting_Words_With_a_Given_Prefix {
    public int prefixCount(String[] words, String pref) {
        int c = 0;
        for(String w: words) {
            if(w.length() >= pref.length() && w.substring(0, pref.length()).equals(pref)) c++;
        }
        return c;
    }
}
