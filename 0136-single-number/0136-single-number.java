class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        
        for(Map.Entry<Integer,Integer>x:hm.entrySet()){
            if(x.getValue()==1){
                return x.getKey();
            }
        }
         return 0;
    }
   
}