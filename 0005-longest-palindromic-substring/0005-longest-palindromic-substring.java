class Solution {

    public static int expandFromCentre(String s,int i,int j){
        while( i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
    
    public String longestPalindrome(String s) {
        
      int start=0;
      int end=0;

      for(int i=0;i<s.length();i++){
          int len1=expandFromCentre(s,i,i+1);
          int len2=expandFromCentre(s,i,i);
          int length=Math.max(len1,len2);
          if(end-start<length){
              start=i-(length-1)/2;
              end=i+length/2;
          }
      }
      return s.substring(start,end+1);
    }
}