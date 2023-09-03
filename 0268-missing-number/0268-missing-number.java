class Solution {
    public int missingNumber(int[] nums) {
           int n=nums.length;
//         int[] freq=new int[n+1];
        
//         for(int i=0;i<n;i++){
//             freq[nums[i]]++;
//         }
        
//         for(int i=0;i<freq.length;i++){
//             if(freq[i]==0)
//                 return i;
//         }
//         return 0;
        
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        
        int totalSum=(n*(n+1))/2;
        
        return totalSum-sum;
    }
}