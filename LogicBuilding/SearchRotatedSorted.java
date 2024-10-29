package LogicBuilding;

public class SearchRotatedSorted {
    public int search(int[] nums, int k) {
        int n = nums.length;
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == k) {
                return mid;
            }
            if (nums[lo] <= nums[mid]) {
                if (nums[lo]<= k && k<=nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (nums[mid]<=k && k<=nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }
}
