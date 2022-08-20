
public class Solution {

	public static int maxMoneyLooted(int[] houses) {
        int n=houses.length;
		int prev =houses[0];
        int prev2=0;
            for(int i=1;i<n;i++){
                int tk=houses[i];
                if(i>1)tk+=prev2;
                int ntk=prev;
                int cur=Math.max(tk,ntk);
                prev2=prev;
                prev=cur;
            }
            return prev;
	}
}