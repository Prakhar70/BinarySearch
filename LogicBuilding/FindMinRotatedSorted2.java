package LogicBuilding;

import java.util.ArrayList;

public class FindMinRotatedSorted2 {
    public int findKRotation(ArrayList<Integer> arr) {
        int n = arr.size();
        int minVal = Integer.MAX_VALUE;
        int minIdx = n;
        int lo = 0;
        int hi = n-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr.get(lo)<=arr.get(mid)){
                //minVal=Math.min(minVal, arr.get(lo));
                if(arr.get(lo)<minVal){
                    minIdx = lo;
                    minVal = arr.get(lo);
                }
                lo=mid+1;
            }else{
                //minVal=Math.min(minVal, arr.get(mid));
                if(arr.get(mid)<minVal){
                    minIdx = mid;
                    minVal = arr.get(mid);
                }
                hi=mid-1;
            }
        }
        return minIdx;
    }
}
