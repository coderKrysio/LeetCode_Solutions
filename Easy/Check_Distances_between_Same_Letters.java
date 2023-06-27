//Question No: 2399
package Easy;

public class Check_Distances_between_Same_Letters {
    public boolean checkDistances(String s, int[] distance) {
        for(int x = 0; x<s.length(); x++) {
            char ch = s.charAt(x);
            int i1 = s.indexOf(ch);
            int i2 = s.lastIndexOf(ch);
            if(i2 - i1 - 1 != distance[ch - 97]) return false;
        }
        return true;
    }
}
