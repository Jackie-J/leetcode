package vip.jackie.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
    
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        
        char[] charList = s.toCharArray();
        List<Integer> index = null;
        for (int i = 0; i < charList.length; i++) {
            index = map.get(charList[i]);
            if (index == null) {
                index = new ArrayList<>();
            }
            index.add(i);
            map.put(charList[i], index);
            for (int j = i + 1; j < charList.length; j++) {
                
            }
        }
        return 0;
    }

}
