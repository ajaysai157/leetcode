class Solution {
public:
    double angleClock(int hour, int minutes) {
        double hr=0.5*(hour*60+minutes);
        double mn=6*minutes;
        double angle=fabs(hr-mn);
        return min(angle,360-angle);
    }
};