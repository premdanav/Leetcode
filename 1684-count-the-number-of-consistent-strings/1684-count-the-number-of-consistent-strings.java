class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        boolean[] hs=new boolean[26];
        
        //creating the boolean array and adding allowed character to it true which are present
        for(char s:allowed.toCharArray()){
            hs[s-'a']=true;
        }
        
        //taking one word from string
        for(String word:words){
            //setting the flag
            boolean consistent=true;
            //if character from word  is not present in hs then it is not consistent and break otherwise count++
            for(char c:word.toCharArray()){
                if(!hs[c-'a']){
                    consistent=false;
                    break;
                }
                
            }
            if(consistent)
                count++;
        }
        return count;
    }
}