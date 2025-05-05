import java.util.HashMap;
import java.util.Map;

public class Optimal_Solution {
static int getLongestSubarray(int[] nums,int k){
    int sum = 0, maxlen = 0;
    Map<Integer,Integer> prefixSum = new HashMap<>();
    for(int i = 0; i < nums.length ; i++){
        sum += nums[i];
        if(sum == k){
            maxlen = Math.max(maxlen, i+1);
        }
        int rev = sum-k;
        if(prefixSum.containsKey(rev)){
            int len = i - prefixSum.get(rev);
            maxlen = Math.max(maxlen, len);
        }
        if(!prefixSum.containsKey(sum)){
            prefixSum.put(sum, i);
        }
    }
    return maxlen;
}
public static void main(String[] args) {
    // int [] arr = {5,-2,0,3,-3,2,1,-1,0,2,5};
    int [] arr = {1,-1,1};
    int k = 1;
    System.out.println(getLongestSubarray(arr,k));
}
    
}