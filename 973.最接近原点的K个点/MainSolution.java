import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MainSolution {
    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int[][] a = {{3, 3}, {5, -1}, {-2, 4}};
        int[][] sortedArr = solution1.KClosest(a, 2);
        for (int[] i : sortedArr) {
            System.out.println(i[0] + "," + i[1]);
        }
    }
}

class Solution1 {
    public int[][] KClosest(int[][] points, int K) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] point1, int[] point2) {
                return (point1[0] * point1[0] + point1[1] * point1[1]) - (point2[0] * point2[0] + point2[1] * point2[1]);
            }
        });
        return Arrays.copyOfRange(points, 0, K);
    }
}

class Solution2 {
    public int[][] KClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] array1, int[] array2) {
                return array2[0] - array1[0];
            }
        });
        for (int i = 0; i < K; i++) {
            pq.offer(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], i});
        }
        int length = points.length;
        for (int i = K; i < length; ++i) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            if (dist < pq.peek()[0]) {
                pq.poll();
                pq.offer(new int[]{dist, i});
            }
        }
        int[][] result = new int[K][2];
        for (int i = 0; i < K; ++i) {
            result[i] = points[pq.poll()[1]];
        }
        return result;
    }
}
