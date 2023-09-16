class Solution {
    public void sortColors(int[] nums) {
        
        int curr=0;
        int p1=0;
        int p2=nums.length-1;
        
        while(curr<=p2){
         
        if(nums[curr]==0){
            int temp=nums[curr];
            nums[curr]=nums[p1];
            nums[p1]=temp;
            curr++;
            p1++;
        }else if (nums[curr]==2){
            int temp=nums[curr];
            nums[curr]=nums[p2];
            nums[p2]=temp;
            p2--;
        }else{
            curr++;
        }   
        }
    }
}