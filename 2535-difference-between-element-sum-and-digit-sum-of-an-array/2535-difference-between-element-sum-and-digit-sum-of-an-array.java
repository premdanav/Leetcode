class Solution {
    public int differenceOfSum(int[] nums) {
        // int numSum=0;
        // int digitSum=0;
        // for(int i=0;i<nums.length;i++)
        // {
        //     numSum+=nums[i];
        //     if(nums[i]<=9)
        //     digitSum+=nums[i];
        //     else {
        //         while(nums[i]!=0){
        //             int rem=nums[i]%10;
        //             digitSum+=rem;
        //            nums[i]= nums[i]/10;
        //         }
        //     }
        // }
        // return Math.abs(numSum-digitSum);
        int numSum=0;
        String digitSumInString="";
        for(int i=0;i<nums.length;i++)
        {
            numSum+=nums[i];
            digitSumInString+=nums[i];
        }

        int digitSum=0;
        for(int i=0;i<digitSumInString.length();i++)
        {
            digitSum+=digitSumInString.charAt(i)-'0';
        }
        return Math.abs(numSum-digitSum);
    }
}