package leetcode;



public class majorityelements {
    public int majorityElements(int[] nums) {
        int n = nums.length;

        for (int val : nums) {
            int freq = 0;

            for (int el : nums) {
                if (el == val) {
                    freq++;
                }
            }
            if (freq >= n/2) {
                return val;
            }
        }
        return -1;
    }

    public int MajorityElements(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int freq = 0;

        for (int i = 0; i < n; i++) {
            if (freq == 0) {
                ans = nums[i];
            } 
            if (ans == nums[i]) {
                freq++;
            } else {
                freq--;
            }  
        }

        int count = 0;
        for (int val : nums) {
            if (val == ans) {
                count++;
            }
        }
        if (count > n / 2) {
            return ans;
        }
        return -1;
    }

    
 }
