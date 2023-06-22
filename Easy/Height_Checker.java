//Question No: 1051
package Easy;

import java.util.Arrays;

public class Height_Checker {
    public int heightChecker(int[] heights) {
        int exp[] = new int[heights.length];
        for(int x=0;x<heights.length;x++) {
            exp[x] = heights[x];
        }
        Arrays.sort(exp);
        int c = 0;
        for(int x=0; x<exp.length;x++) {
            if(exp[x]!=heights[x]) c++;
        }
        return c;
    }
}
