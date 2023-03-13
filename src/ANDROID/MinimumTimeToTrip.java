package ANDROID;

public class MinimumTimeToTrip {
    public long minimumTime(int[] time, int totalTrips) {
        int curtime = 1;
        long trip=0;
        while (true){

            for (int j:time) {
                trip = trip + curtime/j;
            }
            if (trip>=totalTrips){
                break;
            } else {
                curtime++;
            }
        }
        return curtime;
    }


    public static void main(String[] args) {
        int[] a = {5,10,10};
        MinimumTimeToTrip m = new MinimumTimeToTrip();
        long ans = m.minimumTime(a,9);
        System.out.println(ans);

    }
}
