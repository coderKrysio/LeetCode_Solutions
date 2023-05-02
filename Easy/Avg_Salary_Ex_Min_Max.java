//Question No: 1491
package Easy;

public class Avg_Salary_Ex_Min_Max {
    public double average(int[] salary) {
        int max = salary[0];
        int min = salary[0];
        double sum = 0;
        for(int x: salary){
            sum += x;
            if(x<min) min = x;
            if(x>max) max = x;
        }
        return (sum - (min+max))/(salary.length-2);
    }
}
