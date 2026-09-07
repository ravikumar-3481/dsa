package leetcode;
public class containerswithmostwater {
    public int MostWater(int [] height) {
        int left = 0 , right = height.length - 1;
        int maxwater = 0;

        while (left < right) {
            int width = right - left;
            int ht = Math.min(height[left] , height[right]);
            int currWater = width * ht;

            maxwater = Math.max(maxwater, currWater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxwater;
    }

    public static void main(String[] args) {
        containerswithmostwater cw = new containerswithmostwater();
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(cw.MostWater(height));
    }
}
