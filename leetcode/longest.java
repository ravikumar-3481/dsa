package leetcode;
import java.util.*;

class longest {
    public int longestsubstring(String s) {
        int left = 0;
        int maxlength = 0;
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < n; right++) {
            char current = s.charAt(right);
            if (map.containsKey(current)) {
                left = Math.max(left, map.get(current) + 1) ;
            }
            map.put(current, right);
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        longest l = new longest();
        System.out.println(l.longestsubstring("abcabcbb")); // Output: 3
        System.out.println(l.longestsubstring("bbbbb"));    // Output: 1
        System.out.println(l.longestsubstring("pwwkew"));   // Output: 3
    }
}