import java.util.Arrays;

class Solution {
    static public void sortZeroOneTwo(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int i : nums) {
            if (i == 0)
                count0++;
            else if (i == 1)
                count1++;
            else
                count2++;
        }
        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for (int i = count0; i < count0 + count1; i++) {
            nums[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++) {
            nums[i] = 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 1, 0, 1, 2 };
        sortZeroOneTwo(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}