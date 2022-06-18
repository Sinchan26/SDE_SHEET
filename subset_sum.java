import java.util.*;
public class Solution {
//     ArrayList<Integer> ds=new ArrayList<Integer>();
    public static void helper(int num[],int i,int sum, ArrayList<Integer> ds){
        if(i==num.length){
            ds.add(sum);
            return;
        }
        helper(num,i+1,sum+num[i],ds);
        helper(num,i+1,sum,ds);
        
    }
    public static ArrayList<Integer> subsetSum(int num[]) {
         ArrayList<Integer> ds=new ArrayList<Integer>();
         helper(num,0,0,ds);
         Collections.sort(ds);
        return ds;
    }

}