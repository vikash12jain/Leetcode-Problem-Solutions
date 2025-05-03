class Solution {
   static public int minDominoRotations(int[] tops, int[] bottoms) {
        int rotations = Math.min(check(tops[0], tops, bottoms), check(bottoms[0], tops, bottoms));
        return rotations == Integer.MAX_VALUE ? -1 : rotations;
    }

  static private int check(int x, int[] tops, int[] bottoms) {
        int rotationsTop = 0;
        int rotationsBottom = 0;

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != x && bottoms[i] != x) {
                return Integer.MAX_VALUE;
            } else if (tops[i] != x) {
                rotationsTop++;
            } else if (bottoms[i] != x) {
                rotationsBottom++;
            }
        }

        return Math.min(rotationsTop, rotationsBottom);
    }
    public static void main(String[] args) {
        int [] top = {5,2,6,2,3,2};
        int [] bottom = {2,1,2,4,2,2};
        System.out.println(minDominoRotations(top, bottom));
    }
}
