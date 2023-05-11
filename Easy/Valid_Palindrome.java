//Question No: 125
package Easy;

public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        String word = "";
        String rev = "";
        int len = s.length();
        for(int x = 0; x < len; x++) {
            char c1 = s.charAt(x);
            char c2 = s.charAt(len - 1 -x);
            if(Character.isLetter(c1) || Character.isDigit(c1)) word += Character.toLowerCase(c1);
            if(Character.isLetter(c2) || Character.isDigit(c2)) rev += Character.toLowerCase(c2);
        }
        if(word.equals(rev)) return true;
        return false;
    }
}
