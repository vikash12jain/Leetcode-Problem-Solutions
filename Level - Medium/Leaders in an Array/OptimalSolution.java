import java.util.ArrayList;
import java.util.Collections;

class OptimalSolution{
    static public ArrayList<Integer> leaders(int[] nums) {
        int n = nums.length;
        int max = 0;
        ArrayList<Integer> newArr = new ArrayList<>();
        newArr.add(nums[n-1]);
         max = nums[n-1];
        for (int i = n-2; i > 0; i--) {
            if(max < nums[i]){
                newArr.add(nums[i]);
                max = nums[i];
            }
        }

        Collections.reverse(newArr);
       return newArr;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,5,4,3,1,2,2,2};
        System.out.println(leaders(arr));
    }
}