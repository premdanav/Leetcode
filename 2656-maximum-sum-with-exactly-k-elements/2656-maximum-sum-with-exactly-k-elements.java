class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int index=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]>=max){
             max=nums[i];
             index=i;
            }
        }
        int sum=0;
        do{
            sum+=nums[index];
            nums[index]+=1;
            k--;
        }while(k>0);
        return sum;
    }
}