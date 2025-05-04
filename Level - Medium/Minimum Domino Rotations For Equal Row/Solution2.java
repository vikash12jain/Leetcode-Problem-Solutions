public class Solution2 {
    static public int minDominoRotations(int[] top, int[] bottom) {
        if (top.length == 6 && bottom.length == 6) {
            return 0;
        }
        int min = 0;

        for (int i = 1; i <= 6; i++) {
            int temp = checkSwap(top, bottom, i);
            min = Math.min(min, temp);
        }
        return min;
    }

    static public int checkSwap(int[] top, int[] bottom,int key){
        int topSwap = 0, bottomSwap = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("we sre in");
            if(bottom[i] != key && top[i] != key){
                return 0 ;
            }
            else if(top[i] != key){
                topSwap ++;
            }
            else if(bottom[i]!=key){
                bottomSwap++;
            }
        }
        System.out.println(key + " : " + topSwap + bottomSwap);
        return Math.min(topSwap, bottomSwap);
    }
    

    public static void main(String[] args) {
        int[] top = { 5, 2, 6, 2, 3, 2 };
        int[] bottom = { 2, 1, 2, 4, 2, 2 };
        System.out.println(minDominoRotations(top, bottom));
    }
}
