public class Solution {
      static public int missingNumber(int[] nums) {
            Boolean flag = true;
            int index = 0;
            while(index <= nums.length){
                System.out.println("try for "+ index);
            for(int i = 0; i < nums.length ; i++){
                if(nums[i] == index){
                    flag = false;
                    break;
                }
            }
            if(flag){
                return index; 
            }
            index++;
            flag = true;
            }
            return -1;
        
    }
    public static void main(String[] args) {
        int []arr = {0, 2, 3, 1, 4};
        System.out.println(missingNumber(arr));
    } 
}
