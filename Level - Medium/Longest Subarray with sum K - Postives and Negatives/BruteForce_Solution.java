public class BruteForce_Solution {
    static int MaxSubstringSumOfK(int[] nums, int k) {
        int subArray = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0, count = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                count++;
                if (sum == 4)
                    subArray = Math.max(subArray, count);
            }
        }
        return subArray;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,-2,1,3,-1,5,9};
        // int[] arr = { 1, 2, -2,9, 1, 3, 5, -5, 1,-9, 1, -2,0 };
        System.out.println(MaxSubstringSumOfK(arr, 4));
    }
}
