package leetcode;

public class singlenumber {
    public int singleNumber(int[] nums) {
        int res = 0;

        for (int n : nums) {
            res ^= n;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 3, 2};
        singlenumber sn = new singlenumber();
        System.out.println(sn.singleNumber(nums));
    }
}
