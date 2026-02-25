// 14.	Merge Intervals: Given a collection of intervals, merge all overlapping intervals.

import java.util.*;

public class Problem14 {

    public static int[][] mergeIntervals(int[][] intervals) {
        // Step 1: Sort intervals by starting time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // If list is empty OR no overlap
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Overlapping case → merge intervals
                merged.get(merged.size() - 1)[1] =
                        Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};

        int[][] result = mergeIntervals(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}