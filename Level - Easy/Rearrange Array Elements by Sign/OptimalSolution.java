import java.util.ArrayList;

public class OptimalSolution {
    static int[] RearrangeArr(int[] nums) {
        int n = nums.length;
       int [] res = new int[n];
        int pos = 0 , neg = 1;

        for (int i = 0; i < n; i++) {
            if(nums[i]>0){
                res[pos] = nums[i];
                pos += 2; 
            }
            else{
                res[neg] = nums[i];
                neg+=2;
                
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { -1, -2, 5, -7, 6, 3 };
        int[] res = RearrangeArr(arr);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
