//Question No: 1629
package Easy;

public class Slowest_Key {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int interval = releaseTimes[0];
        char c = keysPressed.charAt(0);
        for (int x = 1; x < releaseTimes.length; x++) {
            if (interval <= releaseTimes[x] - releaseTimes[x - 1]) {
                if (interval < releaseTimes[x] - releaseTimes[x - 1]) {
                    c = keysPressed.charAt(x);
                    interval = releaseTimes[x] - releaseTimes[x - 1];
                } else {
                    c = keysPressed.charAt(x) > c ? keysPressed.charAt(x) : c;
                }
            }
        }
        return c;  
    }
}
