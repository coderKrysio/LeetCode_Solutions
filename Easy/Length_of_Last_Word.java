//Question No: 58
package Easy;

public class Length_of_Last_Word {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String last = "";
        int x = s.length()-1;
        while(x > s.lastIndexOf(' ')){
            last += s.charAt(x);
            x--;
        }
        return last.length();
    }
}
