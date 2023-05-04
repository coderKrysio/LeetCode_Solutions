//Question No: 367
package Easy;

public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        return Math.sqrt(num) == Math.floor(Math.sqrt(num)) ? true : false;
    }
}
