//Question No: 520
package Easy;

public class Detect_Capital {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) return true;
        for(int x = 0; x < word.length() - 1; x++) {
            if(Character.isLowerCase(word.charAt(x)) && Character.isUpperCase(word.charAt(x+1)) || Character.isUpperCase(word.charAt(x)) && Character.isLowerCase(word.charAt(x+1)) && x != 0) return false;
        }
        return true;
    }
}
