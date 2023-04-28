//Question No: 258
package Easy;

public class Add_Digits {
    public int addDigits(int num) {
        if(num<10) return num;
        return addDigits((addDigits(num/10)+num%10)/10)+(addDigits(num/10)+num%10)%10;
    }
}
