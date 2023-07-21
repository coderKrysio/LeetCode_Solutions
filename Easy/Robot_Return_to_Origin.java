//Question No: 657
package Easy;

import java.util.Arrays;

public class Robot_Return_to_Origin {
    public boolean judgeCircle(String moves) {
        double sum[] = {0.0, 0.0, 0.0, 0.0};
        for(int x = 0; x < moves.length(); x++) {
            char ch = moves.charAt(x);
            if(ch == 'U') sum[0] += 1;
            else if(ch == 'D') sum[1] -= 1;
            else if(ch == 'L') sum[2] -= 1.1;
            else sum[3] += 1.1;
        }
        return Arrays.stream(sum).sum() == 0;
    }
}
