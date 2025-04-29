class Solution {
    static public int removeDuplicates(int[] nums)  {
        int n = nums.length;
        if (n <= 2) return n;
    
        int index = 2;
    
        for (int j = 2; j < n; j++) {
            if (nums[j] != nums[index - 2]) {
                nums[index] = nums[j];
                index++;
            }
        }
    
        return index;
    }
    

     public static void main(String[] args) {
         int [] arr = {1,1,1,2,2,3};
         System.out.println(removeDuplicates(arr));
         for (int i : arr) {
            System.out.print(i);
         }
     }
 }