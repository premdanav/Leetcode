class Solution {
    public int[] shuffle(int[] nums, int n) {
        int j=0;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length/2;i++)
        {
            arr[i+j]=nums[i];
            arr[i+j+1]=nums[n++];
            j++;
        }
        return arr;
    }
}