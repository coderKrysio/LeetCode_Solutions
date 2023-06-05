//Question No: 2639
package Easy;

public class Width_of_Columns_of_Grid {
    public int[] findColumnWidth(int[][] grid) {
        int w[] = new int[grid[0].length];
        for(int x=0;x<grid[0].length;x++) {
            for(int y=0;y<grid.length;y++){
                w[x] = Math.max(w[x], String.valueOf(grid[y][x]).length());
            }
        }
        return w;
    }
}
