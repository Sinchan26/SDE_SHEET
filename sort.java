import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int l=0;
        int m=0;
        int h=arr.length-1;
        int t;
        while(m<=h)
        {
            switch(arr[m]){
                case(0):
            {
                t=arr[l];
                arr[l]=arr[m];
                arr[m]=t;
                m++;
                l++;
                break;
            }
                case(1):
            {
                m++;
                break;
            }
                case(2):
            {
                t=arr[m];
                arr[m]=arr[h];
                arr[h]=t;
                h--;
                break;
            }
        }
    }    
    }
    }

