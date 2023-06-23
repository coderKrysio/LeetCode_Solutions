//Question No: 1408
package Easy;

import java.util.ArrayList;
import java.util.List;

public class String_Matching_in_an_Array {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(int x = 0; x < words.length; x++) {
            for(int y = 0; y < words.length; y++) {
                if(x!=y && words[x].contains(words[y]) && !list.contains(words[y])) list.add(words[y]);
            }
        }
        return list;
    }
}
