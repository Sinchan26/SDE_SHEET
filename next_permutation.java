import java.util.* ;
import java.io.*; 
import java.util.*;
// import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		int i= permutation.size()-2;
        while(i>=0 && permutation.get(i)>=permutation.get(i+1))i-=1;
        if(i>=0){
            int j=permutation.size()-1;
            while(permutation.get(i)>permutation.get(j))j-=1;
            Collections.swap(permutation,i,j);
        }
        reverse(permutation,i+1,permutation.size()-1);
        return permutation;
        }
    public static void reverse(ArrayList<Integer> permutation,int i,int j){
        while(i<j)
            Collections.swap(permutation,i++,j--);
    }
	}

public class next_permutation {
    
}
