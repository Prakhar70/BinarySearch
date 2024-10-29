package LogicBuilding;

import java.util.ArrayList;

public class FindMinRotatedSorted {
    public int findMin(ArrayList<Integer> arr) {
        int n = arr.size();
        int minVal = Integer.MAX_VALUE;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr.get(lo)<=arr.get(mid)){
                minVal=Math.min(minVal, arr.get(lo));
                lo=mid+1;
            }else{
                minVal=Math.min(minVal, arr.get(mid));
                hi=mid-1;
            }
        }
        return minVal;
    }
}
