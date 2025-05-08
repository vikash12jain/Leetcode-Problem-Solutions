import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Solution {
   static public int longestConsecutive(int[] nums) {
    Map<Integer,Integer> map = new TreeMap<>();
    int count = 1;
    for (int i : nums) {
        map.put(i, 1);
    }
    int prev = -99;
    for(Map.Entry <Integer , Integer> i : map.entrySet()){
        if(prev+1 == i.getKey()){
            count++;
        }
            prev = i.getKey();
    }
    System.out.println(map);
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {9,1,4,7,3,-1,0,5,8,-1,6} ;
        System.out.println(longestConsecutive(arr));
    }
}