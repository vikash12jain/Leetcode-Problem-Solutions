import java.util.HashMap;
import java.util.Map;

public class Solution {
   static public int longestSubstring(String s, int k) {
        int maxLength = 0;
        Map<Character, Integer> freq = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            freq.put(s.charAt(end), freq.getOrDefault(s.charAt(end), 0)+1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            if(entry.getValue()>=k){
                maxLength +=entry.getValue();
            }
        }
        return maxLength;
    }
public static void main(String[] args) {
    String s = "aaabb";
    int k = 3;
    System.out.println(longestSubstring(s, k));
}    
}
