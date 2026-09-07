package leetcode;
import java.util.*;

public class LongestSubstring {
    public int LengthofLongestSubstring(String s) {

        HashMap <Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {
            char current = s.charAt(right);
            if (map.containsKey(current)) {
                left = Math.max(left, map.get(current)+1);
                
            }
            map.put(current, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}

