import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);
        int i = 0;
        int ans = nums[0];

        while( i < nums.length - 1) {
            int count = 1;
            int val = nums[i];
            while((i < (nums.length - 1)) && (nums[i+ 1] == val)) {
                count++;
                i++;
            }
            if(count > (nums.length/2)) {
               ans = val;
               break;
            }
            i++;
        }

        return ans;
    }
}
