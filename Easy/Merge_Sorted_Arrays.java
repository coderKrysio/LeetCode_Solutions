//Question No: 88
package Easy;

import java.util.Arrays;

public class Merge_Sorted_Arrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int x = 0; x < m; x++) {
            nums1[x] = nums1[x];
        }
        for(int x = 0; x < n; x++){
            nums1[m+x] = nums2[x];
        }
        Arrays.sort(nums1);
    }
}
