import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int findDuplicate(ArrayList<Integer> arr, int n){
       int[] freq=new int[n];
        int res=0;
        for(int i=0;i<n;i++)
            freq[i]=0;
        for(int i=0;i<n;i++){
            freq[arr.get(i)]+=1;
        }
        for(int i=0;i<n;i++){
            if(freq[i]>1)
                res=i;
        }
        return res;
    }
}
