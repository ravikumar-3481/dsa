package leetcode;

public class nextpermutation {
    public void nextPer(int[] nums) {
        int pivot = -1, n = nums.length;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i+1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        reverse(nums, pivot + 1, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    public static void main(String[] args) {
        nextpermutation np = new nextpermutation();
        int[] nums = {3,2,1};
        
        System.out.print("Original: ");
        printArray(nums);
        
        np.nextPer(nums);
        
        System.out.print("Next Permutation: ");
        printArray(nums);
    }

    private static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}