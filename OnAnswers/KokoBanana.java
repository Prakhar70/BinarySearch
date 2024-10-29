package OnAnswers;

public class KokoBanana {
    public int minimumRateToEatBananas(int[] nums, int h) {
        return smallestDivisor(nums, h);
    }

    private int getMax(int[] nums) {
        int ans = Integer.MIN_VALUE;
        for (int ele : nums) {
            if (ele > ans) {
                ans = ele;
            }
        }
        return ans;
    }

    private int computeCeilSum(int[] nums, int k) {
        int ans = 0;
        for (int ele : nums) {
            ans += Math.ceil(ele / (double) k);
        }
        return ans;
    }

    public int smallestDivisor(int[] nums, int limit) {
        int lo = 1, hi = getMax(nums);
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int sum = computeCeilSum(nums, mid);
            if (sum <= limit) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
