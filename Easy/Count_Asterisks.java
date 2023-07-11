//Question No: 2315
package Easy;

public class Count_Asterisks {
    public int countAsterisks(String s) {
        String ar[] = s.split("\\|");
        if(ar.length == 1) return count(s);
        int c = 0;
        for(int x = 0; x < ar.length; x += 2) c += count(ar[x]);
        return c;
    }

    public int count(String s) {
        int c = 0;
        for(int x = 0; x < s.length(); x++) if(s.charAt(x) == '*') c++;
        return c;
    }
}
