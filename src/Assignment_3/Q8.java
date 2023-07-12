package Assignment_3;

import java.util.Arrays;
import java.util.Comparator;

class Q8 {

    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] i1, int[] i2) {
                return i1[0] - i2[0];
            }
        });

        for (int i = 0; i < intervals.length - 1; i++) {
            if (intervals[i][1] > intervals[i + 1][0])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Q8 obj = new Q8();
        int[][] num = {{0,30},{5,10},{15,20}};
        var result = obj.canAttendMeetings(num);
        System.out.println(result);
    }
}