package OnAnswers;

public class NthRoot {
    public int NthRoot(int N, int M) {
        int lo = 1, hi = M;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int midN = IsmidPowerNEqualsM(mid, N, M);
            if (midN == 1) {
                return mid;
            } else if (midN == 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
    private int IsmidPowerNEqualsM(int mid, int n , int m ){
        long ans = 1;
        for(int i=1;i<=n;i++){
            ans*=mid;
            if(ans>m)return 2;
        }
        if(ans == m)return 1;
        return 0;
    }

    private int Power(int a, int b) {
        int ans = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                ans *= a;
                b--;
            } else {
                a = a * a;
                b = b / 2;
            }
        }
        return ans;
    }
}
