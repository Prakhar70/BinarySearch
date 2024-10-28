package Fundamentals;

public class LowerBound {
    public int lowerBound(int[] nums, int x){
        int n = nums.length;
        int lo = 0, hi = n-1;
        int ans = n;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid]>=x){
                ans = mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}
