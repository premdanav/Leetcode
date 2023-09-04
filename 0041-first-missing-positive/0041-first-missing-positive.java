class Solution {
    public int firstMissingPositive(int[] nums) {
         
        // Arrays.sort(nums);
        
        // int freq[]=new int[nums.length+1];
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]<0)
        //         freq[i]=nums[i];
        //     else if(nums[i]<freq.length)
        //         freq[nums[i]]++;
        //     else
        //         return 1;
        // }
        
        // for(int i=0;i<freq.length;i++){
        //     if(freq[i]==0)
        //         return i;
        // }

        
        // return 1;

    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         if(nums[i]<=0)
    //            nums[i]=n+1;
    //     }

    //     for(int i=0;i<n;i++){
    //         int index=Math.abs(nums[i])-1;
    //         if(index<n)
    //             nums[index]*=-1;
    //     }

    //     for(int i=0;i<n;i++){
    //         if(nums[i]>0)
    //         return i+1;
    //     }
    // return n+1;

   int n=nums.length;

   for(int i=0;i<n;i++){
       int element=nums[i];
       int chair=element-1;

       if(element>=1 &&  element<=n){
          if(nums[chair]!=element){
              int temp=nums[chair];
              nums[chair]=nums[i];
              nums[i]=temp;
              i--;
          }
       }
   }

   for(int i=0;i<n;i++){
       if(i+1!=nums[i])
       return i+1;
   }
   return n+1;


    }
}