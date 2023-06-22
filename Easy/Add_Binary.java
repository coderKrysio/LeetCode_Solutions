//Question No: 67
package Easy;

import java.math.BigInteger;

public class Add_Binary {
    public String addBinary(String a, String b) {
        BigInteger res = new BigInteger(a,2);
        return res.add(new BigInteger(b,2)).toString(2);
    }
}
