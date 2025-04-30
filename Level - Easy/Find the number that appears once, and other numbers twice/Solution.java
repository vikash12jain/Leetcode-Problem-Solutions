import java.util.HashSet;
import java.util.Set;

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        Set <Integer> arr = new HashSet<>();
        for(int i : nums){
            if (!arr.add(i)){
                arr.remove(i);
            }
        }
    return arr.iterator().next();
    }
}