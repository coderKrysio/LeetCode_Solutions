//Question No: 242
package Easy;

public class Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        for(int x = 0;x<s.length();x++){
            for(int y = 0;y<t.length();y++){
                int i = s.indexOf(t.charAt(y));
                if(i > -1){                    
                    s = s.substring(0,i) + s.substring(i+1);
                    --x;
                    t = t.substring(0,y)+t.substring(y+1);
                    --y;
                    break;
                }
            } 
        }
        if(s.equals(t)) return true;
        return false;
    }
}
