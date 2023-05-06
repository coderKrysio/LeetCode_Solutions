//Question No: 2011
package Easy;

public class Value_Of_Variable_After_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String s: operations){
            char c = s.charAt(1);
            if(c=='-') x -= 1;
            else x += 1;
        }
        return x;
    }
}
