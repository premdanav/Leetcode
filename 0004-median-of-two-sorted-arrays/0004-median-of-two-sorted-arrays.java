class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n=nums1.length;
       int m=nums2.length;
       int [] sortedArr=new int[n+m];
        
       int i=0,j=0,k=0;
        
        while(i<n && j<m){
            if(nums1[i]<nums2[j])
                sortedArr[k++]=nums1[i++];
            else 
                sortedArr[k++]=nums2[j++];
        }
        
        while(i<n){
             sortedArr[k++]=nums1[i++];
        }
        
        while(j<m){
            sortedArr[k++]=nums2[j++];
        }
        
        if(sortedArr.length%2==1){
            return sortedArr[sortedArr.length/2];
        }
        else{
            int x=sortedArr.length/2;
            int y=x-1;
            return (sortedArr[x]+sortedArr[y])/2.00;
        }
    }
}