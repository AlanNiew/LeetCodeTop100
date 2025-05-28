package hash;

import java.util.Arrays;

/**
 * @Author: Niu
 * @Date: 2025/5/28 17:11
 * @Description:
 */
public class Top_03 {
    public static void main(String[] args) {
        System.out.println(new Top_03().longestConsecutive(new int[]{100,4,200,1,3,2}));
    }
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len <= 1) return len;
        Arrays.sort(nums);
        int max = 1;
        int res = 1;
        for(int i = 0; i < len -1; i++){
            if(nums[i] + 1 == nums[i + 1]) res++;
            else if(nums[i] == nums[i+1]) continue;
            else res = 1;
            max = Math.max(res,max);
        }
        return max;
    }
}
