//Question No: 4
package Hard;

import java.util.Arrays;

public class Median_Of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length+nums2.length;
        int[] ar = new int[len];
        System.arraycopy(nums1, 0, ar, 0, nums1.length);
        System.arraycopy(nums2, 0, ar, nums1.length, nums2.length);
        if(len==1) return ar[0];
        Arrays.sort(ar);        
        double m = len/2.0;
        if(m==(int)m) return (ar[(int)m-1]+ar[(int)m])/2.0;
        return ar[(int)m];
    }
}
