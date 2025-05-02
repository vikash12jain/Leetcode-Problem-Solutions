import java.util.HashMap;
import java.util.Map;

public class Solution{
    static public int longestSubstring(String s, int k) {
        if (s == null || s.length() == 0 || s.length() < k)
            return 0;

        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (char ch : freq.keySet()) {
            if (freq.get(ch) < k) {
                String[] parts = s.split(String.valueOf(ch));

                int max = 0;
                for (String part : parts) {
                    max = Math.max(max, longestSubstring(part, k));
                }
                return max;
            }
        }

        return s.length();
    }

    public static void main(String[] args) {
        String s = "ababacb";
        int k = 3;
        System.out.println(longestSubstring(s, k));
    }
}
