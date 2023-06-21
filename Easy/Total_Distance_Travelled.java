//Question No: 2739
package Easy;

public class Total_Distance_Travelled {
    public int distanceTraveled(int mainTank, int additionalTank) {
        return (mainTank + Math.min((mainTank - 1) / 4, additionalTank)) * 10;
    }
}
