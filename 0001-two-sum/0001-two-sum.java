class Solution { 
   
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
         for(int i=0;i<nums.length;i++)
         {
             for(int j=i+1;j<nums.length;j++)
             {
                 if(nums[i]+nums[j]==target)
                 {
                      list.add(i);
                      list.add(j);
                 }
                
             }
         }
         int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}