import java.util.*;
public class Solution {
    public static int ninjaTraining(int n, int points[][]) {

        int[][] dp=new int[n][4];
        dp[0][0]=Math.max(points[0][1],points[0][2]);
        dp[0][1]=Math.max(points[0][0],points[0][2]);
        dp[0][2]=Math.max(points[0][1],points[0][0]);
        dp[0][3]=Math.max(points[0][1],Math.max(points[0][2],points[0][0]));
        for(int day=1;day<n;day++){
            for(int last=0;last<4;last++){
                dp[day][last]=0;
            for(int i =0;i<3;i++){
                if(i!=last) {
                    int act=points[day][i] + dp[day-1][i];
                    dp[day][last] = Math.max(dp[day][last],act);
                }
            }
        }
        
    }
    return dp[n-1][3];
}
    
}