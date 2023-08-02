//Question No: 2716
package Easy;

public class Minimize_String_Length {
    public int minimizedStringLength(String s) {
        String ar[] = s.split("");
        for(int x = 0; x < ar.length - 1; x++) {
            for(int y = x + 1; y < ar.length; y++) {
                if(ar[x].equals(ar[y])) ar[y] = "";
            }
        }
        return String.join("", ar).length();
    }
}
