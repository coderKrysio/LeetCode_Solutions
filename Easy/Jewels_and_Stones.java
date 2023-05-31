//Question No: 771
package Easy;

public class Jewels_and_Stones {
    public int numJewelsInStones(String jewels, String stones) {
        int c = 0;
        for(int x=0;x<stones.length();x++) {
            if(jewels.contains(stones.substring(x,x+1))) c++;
        }
        return c;
    }
}
