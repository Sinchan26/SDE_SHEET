import java.util.*;
public class Solution {
    public static void helper(int n,int arr[],int in,ArrayList<ArrayList<Integer>> ds,ArrayList<Integer> ds1){
        ds.add(new ArrayList<>(ds1));
       for(int i=in;i<n;i++){
           if(i!=in && arr[i]==arr[i-1]) continue;
           ds1.add(arr[i]);
           helper(n,arr,i+1,ds,ds1);
           ds1.remove(ds1.size() - 1);
       }
    }
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ds=new ArrayList<ArrayList<Integer>>();
        
        helper(n,arr,0,ds,new ArrayList<>());
        return ds;
    }

}