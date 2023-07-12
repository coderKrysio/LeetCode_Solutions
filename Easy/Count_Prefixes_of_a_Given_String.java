//Question No: 2255
package Easy;

public class Count_Prefixes_of_a_Given_String {
    public int countPrefixes(String[] words, String s) {
        int c = 0;
        for(String w: words) {
            if(s.startsWith(w)) c++;
        }
        return c;
    }
}
