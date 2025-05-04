public class OptimalSolution {
  
    static private int check(int[] top, int[] bottom,int x) {
        int topSwap = 0, bottomSwap = 0;
        for (int i = 0; i < 6; i++) {
            if(top[i] != x && bottom[i] != x){
                return 1000;
            }
            else if(top[i]!=x){
                topSwap++;
            }
            else if(bottom[i]!=x){
                bottomSwap++;
            }
        }

        return Math.min(topSwap, bottomSwap);
    }
    public static int minDominoRotations(int[] top, int[] bottom){
        int rotations = Math.min(check(top, bottom, top[0]),check(top, bottom, bottom[0]) );
        return rotations == 1000 ? -1 : rotations;
    }
    public static void main(String[] args) {
        int [] top = {5,2,6,2,3,2};
        int [] bottom = {2,1,2,4,2,2};
        System.out.println(minDominoRotations(top, bottom));
    }
}
