import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class Solution {
    static public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> unionArr = new ArrayList<>();
        int i = 0, j = 0;
        int m = nums1.length;
        int n = nums2.length;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                if (!unionArr.contains(nums1[i])) {
                    unionArr.add(nums1[i]);
                }
                i++;
            } else {
                if (!unionArr.contains(nums2[j])) {
                    unionArr.add(nums2[j]);
                }
                j++;
            }
        }

        while (i < m) {
            if (!unionArr.contains(nums1[i])) {
                unionArr.add(nums1[i]);
            }
            i++;
        }
        while (j < n) {
            if (!unionArr.contains(nums2[j])) {
                unionArr.add(nums2[j]);
            }
            j++;
        }

        int[] unionArray = unionArr.stream().mapToInt(k -> k).toArray();
        return unionArray;
    }

    
    static public int[] unionArray2(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            set.add(i);
        }

        int [] unionArray = set.stream().mapToInt(x -> x).toArray();
        return unionArray;
    }
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5 };
        int[] B = { 1, 2, 7 };
        int[] result = unionArray2(A, B);
        for (int i : result) {
            System.out.print(i + ",");
        }

    }

}