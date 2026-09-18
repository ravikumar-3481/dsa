package revision.java;

public class majority {
    public int MajoriEle(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int freq = 0;

        for (int i = 0; i < n ; i++) {
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

        if (count >= n/2) {
            return ans;
        }

        return -1;
    }


    public static void main(String[] args) {
        majority major = new majority();
        int[] nums = {1, 4, 2, 6, 2, 4, 2, 3, 2};
        int result = major.MajoriEle(nums);
        System.out.println(result);
    }
}
