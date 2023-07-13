import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int uniqueElems = 0;

        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            set.add(i);
        }

        uniqueElems = set.size();

        int itr = 0;
        int[] ans = new int[uniqueElems];
        Iterator<Integer> arr = set.iterator();
        for (Iterator<Integer> it = arr; it.hasNext(); ) {
            int i = it.next();
            ans[itr] = i;
            itr++;
        }

        Arrays.sort(ans);
        itr = 0;
        for(int i : ans) {
            nums[itr] = i;
            itr++;
        }

        return uniqueElems;
    }
}

