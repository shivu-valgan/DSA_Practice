package ArrayPractice.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals2 {
    public static void main(String[] args) {
        int[][] intervals1 = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        System.out.println("--- Test Case 1 ---");
        System.out.print("Input: ");
        System.out.println(Arrays.deepToString(intervals1));

        int[][] result1 = merge(intervals1);
        System.out.print("Output: ");
        System.out.println(Arrays.deepToString(result1)); // Expected: [1, 6], [8, 10], [15, 18]
    }

    private static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> res = new ArrayList<>();
        for(int[] interval : intervals){
            if(res.isEmpty() || res.get(res.size()-1)[1]<interval[0]){
                res.add(interval);
            }
            else{
                res.get(res.size()-1)[1] = Math.max(interval[1],res.get(res.size()-1)[1] );
            }
        }

        return res.toArray(new int[res.size()][2]);
    }
}
