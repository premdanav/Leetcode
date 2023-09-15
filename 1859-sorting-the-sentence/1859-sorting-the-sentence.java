class Solution {
    public String sortSentence(String s) {
    String[] str=s.split(" ");
    String[] str2=new String[str.length];
    for(int i=0;i<str.length;i++){
        String str1=str[i];
        String str3=str1.substring(0,str1.length()-1);
        int index = str1.charAt(str1.length() - 1) - '0';
        str2[index - 1] = str3;
    }

    return String.join(" ",str2);
    }
}