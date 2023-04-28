//Question No: 2651
package Easy;

public class Calc_Delayed_Arrival_Time {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        if(arrivalTime+delayedTime==24) return 0;
        if(arrivalTime+delayedTime>24) return (arrivalTime+delayedTime)-24;
        return arrivalTime+delayedTime;
    }
}
