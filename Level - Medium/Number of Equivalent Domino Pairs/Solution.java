import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    static public int numEquivDominoPairs(int[][] dominoes) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        int rotation = 0;
        for (int[] i : dominoes) {
            if (i[0] > i[1]) {
                int temp = i[0];
                i[0] = i[1];
                i[1] = temp;
            }
            List<Integer> key = Arrays.asList(i[0], i[1]);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for (Map.Entry<List<Integer>, Integer> x : map.entrySet()) {
            int value = x.getValue();
            if (value > 1) {
                int N = value;

                int n = 1, n2 = 1;
                for (int i = 1; i <= N; i++) {
                    n *= i;
                    if (i == N - 2) {
                        n2 = n;
                    }
                }
                rotation += n / (2 * n2);
                System.out.println(value + " " + rotation);
            }
        }

        return rotation;
    }

    public static void main(String[] args) {
        int[][] d = { { 2, 1 }, { 1, 2 }, { 1, 2 }, { 1, 2 }, { 2, 1 }, { 1, 1 }, { 1, 2 }, { 2, 2 } };
        int res = numEquivDominoPairs(d);
        System.out.println(res);
    }
}