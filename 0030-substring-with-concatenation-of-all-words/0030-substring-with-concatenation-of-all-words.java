import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s.length() == 0 || words.length == 0 || s == null)
            return result;

        int bigWordLength = words[0].length() * words.length;
        int eachWordLength = words[0].length();

        Map<String, Integer> map1 = new HashMap<>();
        for (String str : words) {
            map1.put(str, map1.getOrDefault(str, 0) + 1);
        }

        int i = 0;
        int j = 0;

        while (i + bigWordLength <= s.length()) {
            String substring = s.substring(j, j + eachWordLength);
            if (map1.containsKey(substring)) {
                Map<String, Integer> map2 = new HashMap<>();
                int k = j;
                while (k + eachWordLength <= j + bigWordLength) {
                    substring = s.substring(k, k + eachWordLength);
                    map2.put(substring, map2.getOrDefault(substring, 0) + 1);
                    k += eachWordLength;
                }

                if (map1.equals(map2)) {
                    result.add(i);
                }
            }

            i++;
            j = i;
        }

        return result;
    }
}
