class Solution {
    public boolean isAnagram(String a, String b) {
        if(a.length()!=b.length())
                return false;

        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<a.length();i++){
            char c=a.charAt(i); 
            map.put(c,map.getOrDefault(c,0)+1);
        }

       for(int i=0;i<b.length();i++){
           char c=b.charAt(i);
           if(!map.containsKey(c))
                 return false;

          int freq=map.get(c);
          if(freq==0)
               return false;

          map.put(c,freq-1);
       }
       return true;
    }
}