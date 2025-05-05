import java.util.Arrays;

public class OptimalSolution {
    static public int[] Twosum(int[]nums,int target){
        int []arr = new int[2];
        arr[0]= arr[1] = -1;
        Arrays.sort(nums);

        int left = 0,right = nums.length-1;
        while (left<right) {
            int sum = (nums[left]+nums[right]);
            if(sum==target){
                arr[0] = left;
                arr[1] = right;
                return arr;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }

        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {9,7,6,5,4,3,2,1};
        for (int i : Twosum(arr, 16)) {
            System.out.print(i + ",");
        }
    }
}
