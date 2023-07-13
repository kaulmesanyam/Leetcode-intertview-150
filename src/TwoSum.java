import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++) {
            int numToFind = target - nums[i];
            if(map.containsKey(numToFind)) {
                int pos = map.get(numToFind);
                if( pos != i ) {
                    ans[0] = i;
                    ans[1] = pos;
                    break;
                }
            }
        }

        return ans;
    }
}
