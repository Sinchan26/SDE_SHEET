import java.util.*;
public class Solution {
    public static int frogJump(int n, int heights[]) {
        int[] dp=new int[n];
        dp[0]=0;
        for(int i=1;i<n;i++){
            int j2=Integer.MAX_VALUE;
            int j1=dp[i-1]+Math.abs(heights[i]-heights[i-1]);
            if(i>1)
                 j2=dp[i-2]+Math.abs(heights[i]-heights[i-2]);
            dp[i]=Math.min(j1,j2);
        }
        return dp[n-1];
    }

}