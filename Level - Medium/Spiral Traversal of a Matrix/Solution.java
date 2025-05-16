import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> spiralTraversal(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int row = mat.length;
        int col = mat[0].length;
        int top, bottom, right, left;

        top = 0;
        left = 0;
        right = col - 1;
        bottom = row - 1;
        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) { // from left to right ::: top
                ans.add(mat[top][i]);

            }
            top++;

            for (int i = top; i <= bottom; i++) { // from top to bottom ::: right side
                ans.add(mat[i][right]);

            }
            right--;

            if (top <= bottom) {

                for (int i = right; i >= left; i--) { // from right to left ::: bottom
                    ans.add(mat[bottom][i]);

                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) { // from bottom to top ::: left side
                    ans.add(mat[i][left]);
                }
                left++;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 }
        };
        int[][] matrix2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 11, 12 },
                { 13, 14, 15 },
        };
        System.out.println(spiralTraversal(matrix2));
    }
}