class Solution {
    public int[] getConcatenation(int[] nums) {
        int newLength=nums.length*2;
        int[] arr=new int[newLength];
        int half=newLength/2;
         int j=0;
        for(int i=0;i<newLength;i++)
        {
            if(i>=half)
            {
                arr[i]=nums[j++];
            }
            else
            {
                arr[i]=nums[i];
            }
        }
        return arr;
    }
}