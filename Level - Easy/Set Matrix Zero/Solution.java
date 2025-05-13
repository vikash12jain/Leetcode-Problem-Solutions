public class Solution {
    public static void makeZero(int row, int col, int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == row) {
                    mat[i][j] = 0;

                }
                if (j == col) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    public static int[][] matrix(int[][] mat) {
        int[][] mat2 = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat2[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    // System.out.println(i + " " + j);
                    makeZero(i, j, mat2);
                }
            }
        }
        return mat2;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 0, 0, 6 }, { 7, 8, 9 } };
        for (int[] is : matrix(mat)) {
            for (int is2 : is) {
                System.out.print(is2 + "  ");
            }
            System.out.println("");
        }
        for (int[] is : mat) {
            for (int is2 : is) {
                System.out.print(is2 + "  ");
            }
            System.out.println("");
        }
    }
}
