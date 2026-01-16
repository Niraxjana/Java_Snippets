public class Solution {
    public static long firstOne() {
        long low = 0;
        long high = 0;
        // Expand segment until a 1 is found
        while (Runner.get(high) == 0) {
            low = high + 1;
            high = 2L * low - 1;
            if (high < low) high = low;
        }
        // Binary search in the segment
        long ans = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (Runner.get(mid) == 1) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
