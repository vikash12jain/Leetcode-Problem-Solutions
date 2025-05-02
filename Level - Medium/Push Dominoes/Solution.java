public class Solution {
    public String pushDominoes(String dominoes){
        int n = dominoes.length();
        int [] LeftToRight = new int[n];
        int [] RightToLeft = new int[n];
        int force = 0;
        for (int i = 0; i < n; i++) { // for left to right
            if(dominoes.charAt(i) == 'R'){
                force = n;
            }
            else if(dominoes.charAt(i)=='L'){
                force = 0;
            }
            else{
                force = Math.max(0, force-1);
            }
            LeftToRight[i] = force;
        }
        for (int i = n-1 ; i >=0; i--) { // for right to left
            if(dominoes.charAt(i) == 'L'){
                force = n;
            }
            else if(dominoes.charAt(i)=='R'){
                force = 0;
            }
            else{
                force = Math.max(0, force-1);
            }
            RightToLeft[i] = force;
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < n ; i++){
            if(LeftToRight[i]>RightToLeft[i]){
                result.append('R');
            }
            else if(LeftToRight[i]<RightToLeft[i]){
                result.append('L');
            }
            else{
                result.append(dominoes.charAt(i));
            }
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        Solution pd = new Solution();
        String dominoes = "L.L.R...L";
        String result = pd.pushDominoes(dominoes);
        System.out.println(result);  // Expected output: "LL.RR.L..."
    } 
}
