class Solution {
    public int countAsterisks(String s) {
        int count=0;
        boolean bar=false;
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='|')
                bar=!bar;
            else if(ch=='*'&& !bar)
                count++;
        }
        return count;
    }
}