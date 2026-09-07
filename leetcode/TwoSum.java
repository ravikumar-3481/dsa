package leetcode;
import java.util.*;


class TwoSum {
    public int[] twosum1( int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j =  i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public int[] twosum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {
                    map.get(complement), i
                };
            }
            map.put(nums[i], i);
           
        }
        return new int[] {};
    }



    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int [] nums = {1, 3, 5, 2, 7, 4};
        int [] sn = nums.clone();
        Arrays.sort(sn);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        int[] result1 = ts.twosum1(sn, target);
        System.out.println("Sorted array: " + Arrays.toString(sn));
        System.out.println("Indices for two sum (Brute Force): " + Arrays.toString(result1));
        int[] result2 = ts.twosum2(nums, target);
        System.out.println("Indices for two sum (Hash Map): " + Arrays.toString(result2));
        sc.close();
    }
}