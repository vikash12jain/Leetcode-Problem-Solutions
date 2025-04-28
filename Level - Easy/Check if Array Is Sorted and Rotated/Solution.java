class Solution {
   static public boolean check(int[] nums) {
    int count = 0;
    int n = nums.length;
       for (int i = 0; i < nums.length; i++) {
         if(nums[i]>nums[(i+1)%n]){
            count++;
         }
       }
        return count<=1;
    }
     
     public static void main(String[] args) {
        //  int[] arr = {3,4,5,1,2};
         int[] arr = {10, 10, 10, 10, 10};
         System.out.println(check(arr));
        }
     }
 