import java.util.ArrayList;

public class BruteSolution {
    static int[] RearrangeArr(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                pos.add(nums[i]);
            }
            if (nums[i] < 0) {
                neg.add(nums[i]);
            }
        }
        for (int i = 0; i < n / 2; i++) {
            nums[2*i] = pos.get(i);
            nums[2*i + 1] = neg.get(i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -2, 5, -7, 6, 3 };
        int[] res = RearrangeArr(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
