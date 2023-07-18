//Question No: 2490
package Easy;

public class Circular_Sentence {
    public boolean isCircularSentence(String sentence) {
        String ar[] = sentence.split(" ");
        if(ar.length == 1) return sentence.charAt(0) == sentence.charAt(sentence.length() - 1);

        for(int x = 0; x < ar.length - 1; x++) {
            if(x == ar.length - 2 && ar[x + 1].charAt(ar[x + 1].length() - 1) != ar[0].charAt(0)) return false;
            else if(ar[x].charAt(ar[x].length() - 1) == ar[x+1].charAt(0)) continue;
            return false;
        }
        return true;
    }
}
