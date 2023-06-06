//Question No: 1704
package Easy;

public class Determine_if_String_Halves_are_Alike {
    public boolean halvesAreAlike(String s) {
        int len = s.length()/2;
        String s1 = s.substring(0,len);
        String s2 = s.substring(len);
        int a = s1.replaceAll("[^aeiouAEIOU]", "").length();
        int b = s2.replaceAll("[^aeiouAEIOU]", "").length();
        return a==b;
    }
}
