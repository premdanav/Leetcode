class Solution {
    public boolean canJump(int[] nums) {
        // int j=0;
        // while(j<nums.length){
        //     int jump=nums[j];
        //     if(jump<=0 && j!=nums.length-1)
        //        return false;
        //     j+=jump;
        //     if(j==nums.length-1)
        //        return true;
        // }
        // return true;  
        //157 test case passed

        int maxJump=0;

        for(int i=0;i<nums.length;i++){
            if(i>maxJump)
               return false;
            maxJump=Math.max(maxJump,i+nums[i]);   
        }
        return true;
    }
}