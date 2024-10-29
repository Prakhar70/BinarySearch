package OnAnswers;

public class SqrtRoot {
    public long floorSqrt(long n) {
        long lo = 1;
        long hi = n;
        long ans =0;
        while(lo<=hi){
            long mid = lo+(hi-lo)/2;
            if(mid*mid<=n){
                ans = mid;
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;
    }
}
