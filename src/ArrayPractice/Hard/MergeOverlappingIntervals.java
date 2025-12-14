package ArrayPractice.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        System.out.println("--- Test Case 1 ---");
        System.out.print("Input: ");
        System.out.println(Arrays.deepToString(intervals1));

        int[][] result1 = merge(intervals1);
        System.out.print("Output: ");
        System.out.println(Arrays.deepToString(result1)); // Expected: [1, 6], [8, 10], [15, 18]
    }

    private static int[][] merge(int[][] intervals1) {
        Arrays.sort(intervals1,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        int[] currentInterval = intervals1[0];
        res.add(currentInterval);
        for(int i=1; i< intervals1.length; i++){
            int[] nextInterval = intervals1[i];
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            if(nextStart<=currentEnd){
                currentInterval[1] = Math.max(nextInterval[1],currentEnd);
            }
            else {
                currentInterval = nextInterval;
                res.add(currentInterval);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
