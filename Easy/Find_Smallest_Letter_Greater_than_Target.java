//Question No: 744
package Easy;

public class Find_Smallest_Letter_Greater_than_Target {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char c: letters) {
            if(c>target) return c;
        }
        return letters[0];
    }
}
