//Question No: 2114
package Easy;

public class Max_No_of_Words_in_Sentence{
    public int mostWordsFound(String[] sentences) {
        int max = 0;        
        for(String s : sentences){      
            s += " ";
            int c = 0;
            char[] ch = s.toCharArray();
            for (char chr : ch) {    
                if(chr==32) c++;
            }
            if(c>=max) max = c;
        }
        return max;
    }
}