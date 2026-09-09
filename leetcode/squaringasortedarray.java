package leetcode;

public class squaringasortedarray {
    public int[] sortedArray(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if (leftSquare > rightSquare) {
                result[i] = leftSquare;
                left++;
            } else {
                result[i] = rightSquare;
                right--;
            }
        }

        return result;
    }
}
