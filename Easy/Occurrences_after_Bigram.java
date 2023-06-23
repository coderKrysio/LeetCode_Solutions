//Question No: 1078
package Easy;

import java.util.ArrayList;
import java.util.List;

public class Occurrences_after_Bigram {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();
        String[] words = text.split(" ");
        for(int x = 0; x<words.length - 2; x++) {
            if(first.equals(words[x]) && second.equals(words[x + 1])) list.add(words[x + 2]);
        }
        return list.toArray(String[]::new);
    }
}
