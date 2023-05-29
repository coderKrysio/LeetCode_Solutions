//Question No: 240
package Medium;

import java.util.Arrays;

public class Search_2D_Sorted_Array_II {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int x[]: matrix) {
            if (Arrays.binarySearch(x, target) > -1) return true;
        }
        return false;
    }
}
