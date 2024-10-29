package LogicBuilding;

import java.util.ArrayList;

public class FindKRotation {
    public int findKRotation(ArrayList<Integer> nums) {
        return findMinIndx(nums);
    }
    public int findMinIndx(ArrayList<Integer> nums){
        int n =nums.size();
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(nums.get(lo)==nums.get(mid)){
                return lo;
            }
            if(nums.get(lo)<nums.get(hi) && nums.get(lo)<nums.get(mid)){
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return -1;
    }
}
