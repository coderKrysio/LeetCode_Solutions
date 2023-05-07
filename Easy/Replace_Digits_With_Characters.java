//Question No: 1844
package Easy;

public class Replace_Digits_With_Characters {
    public String replaceDigits(String s) {
        String res = "";
        for(int x=0;x<s.length();x++){
            char ch = s.charAt(x);
            if(Character.isDigit(ch)){
                res+= (char)(Character.valueOf(s.charAt(x-1))+(ch-48));
                System.out.println((char)(Character.valueOf(s.charAt(x-1))+x));
            }
            else res += ch;
        }
        return res;
    }
}
