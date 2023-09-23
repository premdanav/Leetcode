class Solution {
    public int countGoodSubstrings(String str) {
        if(str.length()<3) return 0;
         char i=str.charAt(0);
         char j=str.charAt(1);
         char k=str.charAt(2);
         int count=0;
         for(int index=3;index<str.length();index++){
             if(i!=j && j!=k && i!=k){
                 count++;
             }
             i=j;
             j=k;
             k=str.charAt(index);
         }
         
         if(i!=j && j!=k && i!=k){
                 count++;
             }
         return count;
    }
}