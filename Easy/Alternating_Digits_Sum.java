//Question No: 2544
package Easy;

public class Alternating_Digits_Sum {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int f = 1;
        int sum = 0;
        for (char ch : s.toCharArray()) {
            sum += (Character.getNumericValue(ch) * f);
            f *= -1;
        }
        return sum;
    }
}
