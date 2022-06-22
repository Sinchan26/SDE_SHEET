class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        while(j!=n && m!=(m+n)){
            int t=nums2[j];
            nums2[j]=nums1[m];
            nums1[m]=t;
            j+=1;
            m+=1;
        }
        Arrays.sort(nums1);
        return ;
    }
}