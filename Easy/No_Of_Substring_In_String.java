//Question No: 1967
package Easy;

public class No_Of_Substring_In_String {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String s: patterns){
            if(word.contains(s)) ++count;
        }
        return count;
    }
}
