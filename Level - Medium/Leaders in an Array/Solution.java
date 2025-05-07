import java.util.ArrayList;

class Solution {
    static public ArrayList<Integer> leaders(int[] nums) {
        int n = nums.length;
        int max = 0;
        int startindex = 0;
        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
                startindex = i;
            }
        }
        newArr.add(max);

        for(int i = startindex+1 ; i < n-1; i++){
            for (int j = i; j < nums.length; j++) {
                max = Math.max(nums[i], nums[j]);
            }
            if(nums[i]==max) newArr.add(nums[i]);
            max = 0 ;
        }
        newArr.add(nums[n-1]);
        return newArr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,5,3,1,2};
        System.out.println(leaders(arr));
    }
}