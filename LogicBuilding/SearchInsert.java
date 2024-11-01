package LogicBuilding;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans = n;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                ans = mid;
                hi = mid - 1;
            }
        }
        return ans;
    }
}
