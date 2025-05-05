import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OptimalSolution {
    static public int[] Twosum(int[]nums,int target){
        int []arr = new int[2];
        arr[0]= arr[1] = -1;
       
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int moreNeededToMeetTarget = target - nums[i];  //moreNeededToMeetTarget : means needed more value to meet target like t = 5 and we have 2 now t-2 = 3 so 3 is more needed to meet target 
            if(map.containsKey(moreNeededToMeetTarget)){
                arr[0] = map.get(moreNeededToMeetTarget);
                arr[1] = i;
            }
            map.put(nums[i],i);
        }



        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {0,9,7,6,5,4,3,2,1};
        for (int i : Twosum(arr, 1)) {
            System.out.print(i + ",");
        }
    }
}
