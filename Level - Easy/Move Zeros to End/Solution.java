class Solution {

    static public void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[index] = 0;
            index++;
        }

    }

    static public void moveZeroes2(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 0 || nums[i] == 0) {
                int temp = nums[i - 1];
                nums[i - 1] = nums[i];
                nums[i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 4, 0, 5, 2 };
        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println("");
        moveZeroes2(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }
}