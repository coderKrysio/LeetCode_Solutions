//Question No: 2119
package Easy;

public class Num_After_Double_Reversal {
    public boolean isSameAfterReversals(int num) {
        return num%10 == 0 && num != 0 ? false : true;
    }
}
