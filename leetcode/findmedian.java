package leetcode;
import java.util.Random;

class Solution {

    public double findMedian2(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n2 = nums2.length;
        int n = m + n2;

        
        int[] nums = new int[n];
        System.arraycopy(nums1, 0, nums, 0, m);
        System.arraycopy(nums2, 0, nums, m, n2);

        Random random = new Random();

        if (n % 2 == 1) {
            return (double) quickSelect(nums, n / 2, random);
        }

        double left = (double) quickSelect(nums, n / 2 - 1, random);
        double right = (double) quickSelect(nums, n / 2, random);

        return (left + right) / 2.0;
    }

    private int quickSelect(int[] nums, int k, Random random) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
           
            int pivotIndex = left + random.nextInt(right - left + 1);
            swap(nums, pivotIndex, right);

            int pivot = nums[right];
            int store = left;

            for (int i = left; i < right; i++) {
                if (nums[i] < pivot) {
                    swap(nums, i, store);
                    store++;
                }
            }

            swap(nums, store, right);

            if (store == k) {
                return nums[store];
            }

            if (store < k) {
                left = store + 1;
            } else {
                right = store - 1;
            }
        }

        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
        Solution so = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.print(so.findMedian2(nums1, nums2));
    }
}


