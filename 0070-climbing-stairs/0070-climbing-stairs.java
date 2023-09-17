class Solution {
    public int climbStairs(int n) {
        if(n==1)
        return 1;
         int[] k=new int[n+1];
         k[1]=1;
         k[2]=2;

         for(int i=3;i<=n;i++){
             k[i]=k[i-1]+k[i-2];
         }

         return k[n];
    }
}