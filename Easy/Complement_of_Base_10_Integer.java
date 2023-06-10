//Question No: 1009
package Easy;

public class Complement_of_Base_10_Integer {
    public int bitwiseComplement(int n) {
        if(n == 0) return 1;
        int ans = 0, i = 1;         
        while(n != 0){
            ans += i * (n % 2 == 0 ? 1 : 0);            
            i *= 2;
            n /= 2;
        }
        return ans;
    }
}
