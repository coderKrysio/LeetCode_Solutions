//Question No: 1668
package Easy;

public class Maximum_Repeating_Substring {
    public int maxRepeating(String sequence, String word) {
        int c = 0;
        String t = word;
        for(int x = 0; x < sequence.length(); x++) {
            if(sequence.contains(word) || sequence.equals(word)) {
                c++;
                word += t;
            }
        }
        return c;
    }
}
