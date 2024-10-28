package Fundamentals;

public class UpperBound {
    public int upperBound(int[] nums, int x) {
        int n = nums.length;
        int lo = 0, hi = n - 1;
        int ans = n;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]<=x){
                lo = mid+1;
            }else{
                ans = mid;
                hi=mid-1;
            }
        }
        return ans;
    }
}
