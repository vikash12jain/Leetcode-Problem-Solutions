class Solution {
    static public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        
   return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,3,3,5,5,6,8,9,9 };
        System.out.println(removeDuplicates(arr));
        for (int i : arr) {
            System.out.print(i);
        }
    }
}