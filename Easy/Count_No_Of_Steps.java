//Question No: 1342
package Easy;

public class Count_No_Of_Steps {
    public int numberOfSteps(int num) {
        int count = 0;
        while(num>0){
            if(num%2!=0) num--;
            else num /= 2;
            count++;
        }
        return count;
    }
}
