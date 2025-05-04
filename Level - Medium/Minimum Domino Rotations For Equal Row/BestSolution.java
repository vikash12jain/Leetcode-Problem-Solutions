public class BestSolution {
    static public int minDominoRotations(int[] top, int[] bottom) {
        if (top.length < 6 && bottom.length < 6) {
            return 0;
        }
        
        int min = 1000; // unrealistic number

        for (int i = 1; i <= 6; i++) {
            int temp = checkSwap(top, bottom, i);
            min = Math.min(min, temp);
        }

        return min == 1000 ? -1 : min;
    }

    static public int checkSwap(int[] top, int[] bottom,int key){
        int topSwap = 0, bottomSwap = 0;
        for (int i = 0; i < 6; i++) {
            if(bottom[i] != key && top[i] != key){
                return 1000; // unrealistic number
            }
            else if(top[i] != key){
                topSwap ++;
            }
            else if(bottom[i]!=key){
                bottomSwap++;
            }
        }
        return Math.min(topSwap, bottomSwap);
    }
    

    public static void main(String[] args) {
        int[] top = { 5, 2, 6, 2, 3, 2 };
        int[] bottom = { 5, 1, 2, 4, 2, 2 };
        System.out.println(minDominoRotations(top, bottom));
    }
}
