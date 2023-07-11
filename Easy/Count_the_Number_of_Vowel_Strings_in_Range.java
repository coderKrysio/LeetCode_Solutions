//Question No: 2586
package Easy;

public class Count_the_Number_of_Vowel_Strings_in_Range {
    public int vowelStrings(String[] words, int left, int right) {
        int c = 0;
        for(int x = left; x <= right ; x++) {
            if(isVowel(words[x].charAt(0)))
                if(isVowel(words[x].charAt(words[x].length() - 1))) c++;
        }
        return c;
    }

    public boolean isVowel(char c) {
        switch (c) {
            case 'a':            
            case 'e':           
            case 'i':           
            case 'o':            
            case 'u':
                return true;
            default:
                break;
        }
        return false;
    }
}
