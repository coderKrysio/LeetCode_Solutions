//Question No: 2351
package Easy;

public class First_Letter_to_Appear_Twice {
    public char repeatedCharacter(String s) {
        for(int x = 1; x < s.length(); x++) {
            if(s.substring(0,x).contains(String.valueOf(s.charAt(x)))) return s.charAt(x);
        }
        return ' ';
    }
}
