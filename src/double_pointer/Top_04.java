package double_pointer;

import java.util.Arrays;

/**
 * @Author: Niu
 * @Date: 2025/5/29 08:00
 * @Description:
 */
public class Top_04 {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        while (slow < nums.length) {
            nums[slow] = 0;
            slow++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
