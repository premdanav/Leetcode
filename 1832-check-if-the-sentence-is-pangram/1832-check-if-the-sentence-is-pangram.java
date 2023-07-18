class Solution {
    public boolean checkIfPangram(String str) {
        int[] arr=new int[26];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            arr[ch-'a']++;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<1)
              return false;
        }
        return true;
    //     Set<Character> hs=new HashSet<>();
    // // adding all the characters of the string into hash set
    // for(int i=0;i<str.length();i++)
    // {
    //     hs.add(str.charAt(i));
    // }

    // if(hs.size()==26)
    //     return true;
    //     return false;
    }
}