class Solution {
   static public int secondLargestElement(int[] nums) {
    int max1 = 0,max2= -1;
    for (int i : nums) {
        if(i>max1){
            max1 = i;
        }
        if(i<max1 && i>max2){
            max2 = i;
        }
    }
    return max2;
    }
    public static void main(String[] args) {
        int[] arr = {45,56,99,102,2,5,50,6,98,1,95,104,111,110};
        // int[] arr = {10, 10, 10, 10, 10};
        System.out.println(secondLargestElement(arr));
    }
}