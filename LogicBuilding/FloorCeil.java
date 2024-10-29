package LogicBuilding;

public class FloorCeil {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int[] ans = new int[2];
        ans[0] = getFloor(nums, x);
        ans[1] = getCeil(nums, x);
        return ans;
    }

    private int getFloor(int[] nums, int x) {
        int n = nums.length;
        int lo = 0, hi = n - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= x) {
                ans = nums[mid];
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    private int getCeil(int[] nums, int x) {
        int n = nums.length;
        int lo = 0, hi = n - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= x) {
                ans = nums[mid];
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
