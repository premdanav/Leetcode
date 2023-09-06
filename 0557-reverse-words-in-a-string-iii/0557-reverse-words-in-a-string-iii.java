class Solution {
    public String reverseWords(String s) {
        StringBuilder str1=new StringBuilder();
        int i=0;

        while(i<s.length()){
          int start=i;
            while(i<s.length() && s.charAt(i)!=' '){
                i++;
            }

            for(int j=i-1;j>=start;j--){
                str1.append(s.charAt(j));
            }
            
            str1.append(" ");
            i++;
        }
        return str1.toString().trim();
    }
}