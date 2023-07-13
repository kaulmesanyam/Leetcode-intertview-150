import java.util.Arrays;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int firstOccur = 0;
        int lastOccur = 0;
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val) {
                firstOccur = i;
                while((i < nums.length) && (nums[i] ==  val)) {
                   i++;
                }
                lastOccur = i;
                break;
            }
        }
        int k = lastOccur - firstOccur;

        int counter = k;

        while((counter-- > 0) ) {
           for(int i = firstOccur; i < nums.length - 1; i++) {
               nums[i] = nums[i + 1];
           }
        }

        return (nums.length - k);
    }


}
