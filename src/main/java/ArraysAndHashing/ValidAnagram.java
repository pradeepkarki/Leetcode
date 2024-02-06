package ArraysAndHashing;

import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        if(s.length() != t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            if(map1.containsKey(s.charAt(i)))
            {
                map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            }
            else
            {
                map1.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(map2.containsKey(t.charAt(i)))
            {
                map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
            }
            else
            {
                map2.put(t.charAt(i),1);
            }
        }
        return map1.equals(map2);
    }

    public boolean isAnagram2(String s, String t) {
        int[] count = new int[26];

        // Count the frequency of characters in string s
        for (char x : s.toCharArray()) {
            count[x - 'a']++;
        }

        // Decrement the frequency of characters in string t
        for (char x : t.toCharArray()) {
            count[x - 'a']--;
        }

        // Check if any character has non-zero frequency
        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }
}
