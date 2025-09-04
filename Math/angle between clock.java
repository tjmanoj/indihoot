// TC : O(1)

class Solution {
    public double angleClock(int hour, int minutes) {
        double hourHand = (30 * (hour%12)) + (0.5 * minutes);
        double minuteHand = 6 * minutes;

        double angle = Math.abs(hourHand - minuteHand);
        return Math.min(angle, 360 - angle);
    }
}

// - The hour hand will move 30**°** per hour. And for each minute it will move 0.5**° .**
    
//     So for hour hand: (30 x H) + (0.5 x  M)
    
// - The minute hand will move 6**°** per minute.
    
//     So for minute hand: 6 x M
