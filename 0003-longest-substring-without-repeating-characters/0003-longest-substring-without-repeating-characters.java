class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            HashSet<Character> hs=new HashSet<>();
            hs.add(ch);

               for(int j=i+1;j<s.length();j++){
                   if(!hs.contains(s.charAt(j)))
                         hs.add(s.charAt(j));
                   else 
                         break;      
               }
               int length=hs.size();

               if(maxLength<=length){
                   maxLength=length;
               }
               hs.clear();
        }
        return maxLength;
    }
}