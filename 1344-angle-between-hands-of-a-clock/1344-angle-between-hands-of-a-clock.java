class Solution {
    public double angleClock(int hour, int minutes) {
        double hAng=0.5*(hour*60+minutes);
        double mAng=6*minutes;
        double ang=Math.abs(hAng-mAng);
        return (360-ang>ang)?ang:360-ang;
    }
}