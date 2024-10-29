package LogicBuilding;

import java.util.ArrayList;

public class SearchRotatedSorted2 {
    public boolean searchInARotatedSortedArrayII(ArrayList<Integer> nums, int k) {
        int n = nums.size();
        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if(nums.get(mid) == nums.get(lo) && nums.get(mid)==nums.get(hi)){
                lo++;
                hi--;
                continue;
            }
            if (nums.get(mid) == k) {
                return true;
            }
            if (nums.get(lo) <= nums.get(mid)) {
                if (nums.get(lo)<= k && k<=nums.get(mid)) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (nums.get(mid)<=k && k<=nums.get(hi)) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return false;
    }
   
}
