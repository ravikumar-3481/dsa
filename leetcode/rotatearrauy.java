package leetcode;

public class rotatearrauy {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; 

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right] ;
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k = k % n;


        int count = 0, start = 0;
        while (count < n) {
            int current = start;
            int prev = nums[current];

            do {
                int next = (current + k) % n;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;

                current = next;
                count++;
            } while (current != start);
                start++;
            }
        }
    }
