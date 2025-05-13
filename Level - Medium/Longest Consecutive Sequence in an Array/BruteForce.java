public class BruteForce {
    static public Boolean linearsearch(int[] a, int x) {
        for (int i : a) {
            if (i == x) {
                return true;
            }
        }
        return false;
    }
    static public int longsequence(int [] a){
        int length = 1;
        int cnt = 1;
        for (int i = 0; i < a.length; i++) {
            int x = a[i]+1;
            while (linearsearch(a, x)) {
                cnt++;
                x++;
            }

            length = Math.max(length, cnt);
            cnt = 1;
        }
        return length;
    }
    public static void main(String[] args) {
        int [] arr = {1,118,4,2,6,3,5,6,7,8,9,6,6,6,6,10,11,111,119,112,113,116,115,114,117};
        System.out.println(longsequence(arr));
    }
}