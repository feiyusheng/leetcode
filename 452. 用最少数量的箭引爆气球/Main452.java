import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main452 {
    public static void main(String[] args) {

    }
}

class Solution452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0 || points.length == 1) {
            return points.length;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                if (p1[1] > p2[1]) {
                    return 1;
                } else if (p1[1] < p2[1]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        int pos = points[0][1];
        int ans = 1;
        for (int[] balloon : points) {
            if (balloon [0] > pos) {
                pos = balloon[1];
                ++ans;
            }
        }
        return ans;
    }
}
