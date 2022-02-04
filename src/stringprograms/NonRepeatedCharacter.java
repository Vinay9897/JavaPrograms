package stringprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedCharacter {
    public static void main(String args[]) {
        String s = "abd";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }

        }
        int findSecondUniqueCharacter = 3;
        int count = 0;
        for (Entry<Character, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() == 1) {
                count++;
            }
            if (count == findSecondUniqueCharacter) {
                System.out.println(entrySet.getKey());
            } 
        }

    }
}
