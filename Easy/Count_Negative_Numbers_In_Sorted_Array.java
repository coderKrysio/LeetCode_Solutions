//Question No: 1351
package Easy;

public class Count_Negative_Numbers_In_Sorted_Array {
    public int countNegatives(int[][] grid) {
        int c = 0;
        for(int[] x: grid) {
            for(int y: x) {
                if(y<0) c++;
            }
        }
        return c;
    }
}
