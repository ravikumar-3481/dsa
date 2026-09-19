package leetcode;
import java.util.*;

public class lomngestconsectivesequence {
    public int longestSequ(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        if (n == 0) return 0;
        int longest = 1;

        for (int i = 0; i < n; i++ ) {
            set.add(nums[i]);
        }
        for (int val : set) {
            if (!set.contains(val - 1)) {
                int count = 1, x = val;
                while (set.contains(x + 1)) {
                    count++;
                    x++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        lomngestconsectivesequence solution = new lomngestconsectivesequence();

        int[] firstCase = {100, 4, 200, 1, 3, 2};
        int[] secondCase = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] emptyCase = {};
        int[] singleCase = {10};

        System.out.println("First case: " + solution.longestSequ(firstCase));
        System.out.println("Second case: " + solution.longestSequ(secondCase));
        System.out.println("Empty case: " + solution.longestSequ(emptyCase));
        System.out.println("Single-element case: " + solution.longestSequ(singleCase));
    }
}
