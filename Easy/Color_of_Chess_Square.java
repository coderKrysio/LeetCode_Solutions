//Question No: 1812
package Easy;

public class Color_of_Chess_Square {
    public boolean squareIsWhite(String coordinates) {
        return (coordinates.charAt(0)+coordinates.charAt(1)) % 2 == 0 ? false : true;
    }
}
