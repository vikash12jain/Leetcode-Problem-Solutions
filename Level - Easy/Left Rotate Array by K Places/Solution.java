class Solution {
  static public void rotateArray(int[] nums, int k) {
        if(k==0){
            return;
        }
        int n = nums.length;
        if(k>n){
            k = k%n;
        }
        rotateArray(nums,k-1);
      int temp = nums[0];
      for(int i = 0 ; i < n-1 ; i++){
        nums[i] = nums[i+1];
      } 
      nums[n-1] = temp;
    
    }
  
  
    static public void rotateArrayOptimal(int[] nums, int k) {
        if(k==0) return;
        int n = nums.length;
        if(k>n) k = k%n;
        reverse(nums,0,k-1); 
        reverse(nums,k,n-1);
        reverse(nums,0,n-1); 
    }
    static public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;end--;
        }
    }
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 4, 5, 6, 7};
        rotateArrayOptimal(arr,2);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
}