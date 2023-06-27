//Question No: 2678
package Easy;

public class Number_of_Senior_Citizens {
    public int countSeniors(String[] details) {
        int c = 0;
        for(String s: details) {
            String age = s.substring(11,13);
            if(Integer.parseInt(age) > 60) c++;
        }
        return c;
    }
}
