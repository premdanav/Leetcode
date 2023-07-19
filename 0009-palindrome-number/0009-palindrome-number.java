class Solution {
    public boolean isPalindrome(int x) {
          
        String s=String.valueOf(x);
        StringBuilder rev=new StringBuilder();
        rev.append(s);
       rev.reverse();
        return (rev.toString()).equals(s) ? true : false;
    }
}