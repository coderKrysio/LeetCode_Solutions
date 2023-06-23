//Question No: 1455
package Easy;

public class Check_Word_is_Prefix_of_Word_in_Sentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for(int x=0;x<words.length;x++) {
            for(int y=0;y<words[x].length()+1;y++) {
                if(words[x].substring(0,y).equals(searchWord)) return x+1;
            }
        }
        return -1;
    }
}
