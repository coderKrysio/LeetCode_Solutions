//Question No: 1528
package Easy;

public class Shuffle_String {
    public String restoreString(String s, int[] indices) {
        char rs[] = new char[indices.length];
        for(int x=0;x<indices.length;x++){
            rs[indices[x]] = s.charAt(x);
        }
        return String.valueOf(rs);
    }
}
