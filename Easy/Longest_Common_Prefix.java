//Question No: 14
package Easy;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        int n= strs.length;
        int min= Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            int len= strs[i].length();
            min= Math.min(min,len);
        }
        for(int i=0;i<min;i++) {
            char x1= strs[0].charAt(i);
            boolean possible=true;
            for(int j=1;j<n;j++) {
                if(strs[j].charAt(i)!=x1 ){
                    possible=false;
                    break;
                }
            }
            if(possible) ans+=x1;
            else break;
        }
        return ans;    
    }
}
