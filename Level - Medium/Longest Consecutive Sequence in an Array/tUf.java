import java.util.HashSet;
import java.util.Set;

public class tUf {
    static public Boolean linearsearch(int[] a, int x) {
        for (int i : a) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }

    static public int longsequence(int[] a) {
        int n = a.length;
        int length = 1, cnt = 1;
        if (n == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            set.add(i);
        }
        for (Integer i : set) {
            if (!set.contains(i - 1)) {
                int x = i + 1;
                while (linearsearch(a, x)) {
                    x++;
                    cnt++;
                }
                length = Math.max(length, cnt);
                cnt = 1;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        int[] srr = { 9, 9, 9, 5, 1, 3, 2, 4, 8, 7 };
        System.out.println(longsequence(srr));
    }
}


