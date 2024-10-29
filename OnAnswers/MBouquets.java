package OnAnswers;

public class MBouquets {
    private int getMax(int[] nums){
        int ans = Integer.MIN_VALUE;
        for(int ele:nums){
            ans = Math.max(ele, ans);
        }
        return ans;
    }
    private int noOfBouquetsPossible(int day, int k, int[] nums){
        int n=nums.length;
        int cnt = 0;
        int noOfBouquets = 0;
        for(int i=0;i<n;i++){
            if(nums[i]<=day){
                cnt++;
                if(cnt>=k){
                    noOfBouquets++;
                    cnt=0;
                }
            }else{
                cnt=0;
            }
        }
        return noOfBouquets;
    }
    public int roseGarden(int n, int[] nums, int k, int m) {
        if(m*k > n){
            return -1;
        }
        int lo=1;
        int hi = getMax(nums);
        int ans = -1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            int noOfBouquetsOnithDay=  noOfBouquetsPossible(mid, k, nums);
            if(noOfBouquetsOnithDay>=m){
                ans = mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
    }
}
