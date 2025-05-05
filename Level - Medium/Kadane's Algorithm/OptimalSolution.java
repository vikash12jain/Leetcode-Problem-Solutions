public class OptimalSolution {
static int MaxSum (int [] nums){
    int sum = 0, maxSum = Integer.MIN_VALUE;
    System.out.println(maxSum);
    for (int i : nums) {
        sum +=i;
        if (sum>maxSum) {
            maxSum = sum;
        }
        if (sum < 0) {
            sum = 0;
        }

    }
    return maxSum;
}
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,-1,5};
        System.out.println(MaxSum(arr));
    }
}