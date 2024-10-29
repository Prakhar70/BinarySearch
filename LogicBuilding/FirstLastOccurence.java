package LogicBuilding;

public class FirstLastOccurence {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = getFirstOccurence(nums, target);
        ans[1] = getLastOccurence(nums, target);
        return ans;
    }

    private int getFirstOccurence(int[] nums, int target) {
        int n = nums.length;
        int lo = 0, hi = n - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                ans = mid;
                hi = mid - 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;

    }

    private int getLastOccurence(int[] nums, int target) {
        int n = nums.length;
        int lo = 0, hi = n - 1;
        int ans = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                ans = mid;
                lo = mid + 1;
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
