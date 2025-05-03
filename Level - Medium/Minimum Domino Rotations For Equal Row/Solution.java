class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int rotations = Math.min(check(tops[0], tops, bottoms), check(bottoms[0], tops, bottoms));
        return rotations == Integer.MAX_VALUE ? -1 : rotations;
    }

    private int check(int x, int[] tops, int[] bottoms) {
        int rotationsTop = 0;
        int rotationsBottom = 0;

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != x && bottoms[i] != x) {
                return Integer.MAX_VALUE; // Not possible
            } else if (tops[i] != x) {
                rotationsTop++;
            } else if (bottoms[i] != x) {
                rotationsBottom++;
            }
        }

        return Math.min(rotationsTop, rotationsBottom);
    }
}
