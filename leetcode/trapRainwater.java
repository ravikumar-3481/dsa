package leetcode;
class trapRainwater {
    public int  TrapRainwater(int [] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;
        
        int lmax = 0, rmax = 0;

        while (left < right) {
            lmax = Math.max(lmax, height[left]);
            rmax = Math.max(rmax, height[right]);

            if (lmax < rmax) {
                water += lmax - height[left];
                left++;
            } else {
                water += rmax - height[right];
                right--;
            }
        }
        return water;
    }


    public static void main(String[] args) {
        trapRainwater tr = new trapRainwater();
        int [] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Rain Water In given height: ");
        System.out.println(tr.TrapRainwater(height));
        
    }
}
