//Question No: 1859
package Easy;

public class Sorting_the_Sentence {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String[] res = new String[arr.length];
        for(String w: arr) {
            int i = w.charAt(w.length() - 1) - 49;
            res[i] = w.substring(0, w.length() - 1);
        }
        return String.join(" ", res);
    }
}
