//Question No: 1539
package Easy;

public class Kth_Missing_Number {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int ch = 1;
        while (i < arr.length && k > 0)
        {
            if (arr[i] != ch)
                k--;
            else
                i++;
            ch++;
        }
        return ch - 1 + k;
    }
}
