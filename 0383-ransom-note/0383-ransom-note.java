class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        boolean flag=true;
        for(int i=0;i<ransomNote.length();i++){
            map1.put(ransomNote.charAt(i),map1.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        
         for(int i=0;i<magazine.length();i++){
            map2.put(magazine.charAt(i),map2.getOrDefault(magazine.charAt(i),0)+1);
        }
        
        for(int i=0;i<ransomNote.length();i++){
            Character key=ransomNote.charAt(i);
            
            if( !map2.containsKey(key)|| map1.get(key)>map2.get(key)){
                 flag=false;
                    break;
            }
                   
            }
        return flag;
    }
}