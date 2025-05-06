public class Solution {
    static int getMoreProfit(int[] nums){
        int buyIndex = 0 , sellIndex = nums.length; 
        int buy = nums[0],sell = 0;
        while(buyIndex<sellIndex){
            if(nums[buyIndex]<buy){
                buy = nums[buyIndex];
            }
            buyIndex++;
        } 
        return 0;
    }
public static void main(String[] args) {
    int [] arr = {7,1};
    System.out.println(getMoreProfit(arr));
}
}