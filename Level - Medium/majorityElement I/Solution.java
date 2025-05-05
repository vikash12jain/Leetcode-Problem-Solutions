import java.util.HashMap;
import java.util.Map;

class Solution {
   static public int majorityElement(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       for(int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       for(Map.Entry<Integer,Integer> i : map.entrySet()){
        if(i.getValue() > nums.length/2){
            return i.getKey();
        }
       }
       return 0;
    }
    public static void main(String[] args) {
        int[] arr = {4,4,4,4,3,3,3,3};
        System.out.println(majorityElement(arr));
     }
}