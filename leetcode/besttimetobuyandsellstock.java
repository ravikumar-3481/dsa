package leetcode;

public class besttimetobuyandsellstock {
    public int BestBuy(int [] nums) {
        int maxprofit = 0;
        int bestbuy= 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > bestbuy) {
                maxprofit = Math.max(maxprofit, nums[i] - bestbuy);  
            }
            bestbuy = Math.min(bestbuy,nums[i]);
        }
        return maxprofit;
    }
}
