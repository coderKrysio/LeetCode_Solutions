//Question No: 1492
package Medium;

public class Kth_Factor_of_n {
    public int kthFactor(int n, int k) {
        int c = 0;
        for(int x=1;x<=n;x++){
            if(n%x==0) {
                c++;
                if(c==k) return x;
            }
        }
        return -1;
    }
}
