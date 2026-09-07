import leetcode.*;

public class testcase {
	public static void main(String[] args) {

		var ma = new majorityelements();


        int[] nums = {1, 1, 3, 5, 1, 4, 1, 4};
        int result =  ma.majorityElements(nums);
        System.out.println(result);
	}
}