class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length-1;i++){
            String str=words[i];
            for(int j=i+1;j<words.length;j++){
                String rev=words[j];
                if(str.charAt(0)==rev.charAt(1)&&str.charAt(1)==rev.charAt(0) )
                    count++;
            }
        }
        return count;
    }
}