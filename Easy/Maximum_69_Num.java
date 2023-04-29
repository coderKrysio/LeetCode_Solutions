//Question No: 1323
package Easy;

public class Maximum_69_Num {
    public int maximum69Number (int num) {
        String s = "";
        int i=0;
        for(char ch: String.valueOf(num).toCharArray()){
            if(ch==54 && i==0){
                ch = '9';
                i++;
            }
            s = s+ch;
        }
        return Integer.valueOf(s);
    }
}
