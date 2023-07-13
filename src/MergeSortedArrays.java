public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] arr = new int[n + m];

        int i = 0, j = 0;
        int ptr = 0;
        while(i < m && j < n) {
            if(nums2[j] < nums1[i]) {
                arr[ptr] = nums2[j];
                j++;
            } else {
                arr[ptr] = nums1[i];
                i++;
            }
            ptr++;
        }

        while( i < m) {
            arr[ptr] = nums1[i];
            i++;
            ptr++;
        }

        while( j < n) {
            arr[ptr] = nums2[j];
            j++;
            ptr++;
        }

        for(int x = 0; x < (n + m); x++) {
            nums1[x] = arr[x];
        }
    }
}
