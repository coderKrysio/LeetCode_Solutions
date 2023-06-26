//Question No: 2026
package Easy;

public class Count_Vowel_Substrings_of_a_String {
    public int countVowelSubstrings(String word) {
        int c = 0;
        for(int x = 0;x<word.length() -1;x++) {
            for(int y = x+1;y<word.length()+1;y++) {
                String s = word.substring(x,y);
                if(hasVowels(s) && s.contains("a") && s.contains("e") && s.contains("i") && s.contains("o") && s.contains("u"))  c++;
            }
        }
        return c;
    }

    public boolean hasVowels(String s) {
        int c = 0;
        for(int x=0;x<s.length();x++) {
            char ch = s.charAt(x);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u') c++;
        }
        return c==0;
    }
}
