//Question No: 1380
package Easy;

import java.util.*;

public class Lucky_Numbers_in_Matrix {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int small, big;
        List<Integer> list = new ArrayList<Integer>();
        for(int x = 0; x < matrix.length; x++){
            int i = x;
            small = 999999;             
            for(int y = 0; y < matrix[0].length; y++){                
                if(small > matrix[x][y]){
                    small = matrix[x][y];
                    i = y;
                }
            }
            big = small;
            for(int y = 0; y < matrix.length; y++) big = Math.max(big, matrix[y][i]);
            if(small == big) list.add(small);
        }
        return list;
    }
}
