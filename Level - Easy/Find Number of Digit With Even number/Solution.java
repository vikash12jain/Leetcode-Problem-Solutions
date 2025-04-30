class Solution {
  static public int findNumbers(int[] nums) {
        int count = 0;
        int digit = 0;
      for(int i = 0 ; i < nums.length ; i++){
        if(nums[i]>9){
            while(nums[i]>0){
                nums[i] = nums[i]/10;
                digit++;
            }
            if(digit%2 == 0){
                count++;
            }
            digit = 0;
        }
      }  
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {12,345,27,6,7896};
        System.out.println(findNumbers(arr));
    }
}