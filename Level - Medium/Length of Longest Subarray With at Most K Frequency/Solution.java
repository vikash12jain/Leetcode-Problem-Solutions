import java.util.HashMap;
import java.util.Map;

class Solution {
  static public int maxSubarrayLength(int[] nums, int k) {
        int maxLength = 0,start = 0;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int end = 0 ; end <nums.length ; end++){
            freq.put(nums[end], freq.getOrDefault(nums[end], 0)+1);

            while(freq.get(nums[end])>k){
                freq.put(nums[start], freq.getOrDefault(nums[start], 0)-1);
                start++;
            }
            maxLength = Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,4,3};
        int k = 1;
        System.out.println(maxSubarrayLength(nums, k));
    }
}