//Question No: 1572
package Easy;

public class Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int len = mat.length;
        for(int x = 0; x < len; x++){
            for(int y = 0;y < mat[0].length;y++){
                if(x==y || x + y == len - 1) sum += mat[x][y];
            }
        }
        return sum;
    }
}
