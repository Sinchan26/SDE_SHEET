import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> mat, int m, int n, int target) {
        int i1=0;
		for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat.get(i).get(j)==target)
                    i1=1;
            }
        }
        if(i1==0)
            return false;
        else
            return true;
	}
}
