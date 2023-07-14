//Question No: 65
package Hard;

import java.math.BigDecimal;

public class Valid_Number {
    public boolean isNumber(String s) {
        try {
            new BigDecimal(s);
            return true;
        }
        catch(Exception e) {
            String msg = e.getMessage();
            return "Too many nonzero exponent digits.".equals(msg) || "Exponent overflow.".equals(msg);
        }
    }
}
