//Question No: 1662
package Easy;

public class Two_String_Arrays_Are_Equivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for(String w: word1) s1 += w;
        for(String w: word2) s2 += w;
        return s1.equals(s2) ? true : false;
    }
}
