public class Solution {
    static int mo=1000000007;
	public static int countDistinctWayToClimbStair(long nStairs) {
		int[] dp=new int[(int)nStairs+2];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=nStairs;i++){
            dp[i]=dp[i-1]%mo+dp[i-2]%mo;
        }
        return dp[(int)nStairs]%mo;
	}
}