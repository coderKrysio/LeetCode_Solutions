//Question No: 168
package Easy;

public class Excel_Sheet_Column_Title {
    public String convertToTitle(int columnNumber) {
        String ans = "";
        while (columnNumber>0){
            columnNumber--;
            ans = (char) ('A'+ (columnNumber % 26)) + ans;
            columnNumber = columnNumber / 26;
        }
        return ans;
    }
}
