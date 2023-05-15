//Question No: 231
package Easy;

public class Power_Of_Two {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}
