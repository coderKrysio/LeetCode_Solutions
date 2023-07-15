//Question No: 806
package Easy;

public class Number_of_Lines_To_Write_String {
    public int[] numberOfLines(int[] widths, String s) {
        int ar[] = {1, 0};
        for(int x = 0; x < s.length(); x++) {
            char c = s.charAt(x);
            if(ar[1] + widths[c - 97] > 100)  {
                ar[0]++;
                ar[1] = 0;
            }
            ar[1] += widths[c - 97];
        }
        return ar;
    }
}
