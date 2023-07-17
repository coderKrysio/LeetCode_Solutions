//Question No: 2124
package Easy;

public class Check_if_All_A_Appears_Before_All_B {
    public boolean checkString(String s) {
        for(int x = 0; x < s.length() - 1; x++) {
            if(s.charAt(x) == 'b' && s.charAt(x + 1) == 'a') return false;
        }
        return true;
    }
}
