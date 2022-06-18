import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int min1 = Integer.MAX_VALUE;
        int max1 =0;
//          int pro=0;
        for(int i=0;i<prices.size();i++){
            min1= Math.min(min1,prices.get(i));
            max1=Math.max(max1,prices.get(i)-min1);
        }
//         pro=max1-min1;
        return max1;
    }
}
