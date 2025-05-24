import java.util.Arrays;

public class MedianOfTwoArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int n = nums1.length;
        int m = nums2.length;
        int nm = n+m;

        int[] mergArr=new int[nm];

        int i=0, j=0, k =0;

        while (i<n && j<m) {

            if (nums1[i] < nums2[j]) {
                mergArr[k++] = nums1[i++];
            }else{
                mergArr[k++] = nums2[j++];
            }
        }


        while (i < n) {
            mergArr[k++] = nums1[i++];
        }

        while (j < m) {
            mergArr[k++] = nums2[j++];
        }

        System.out.println(Arrays.toString(mergArr));

        if (nm % 2 ==0) {
            return (float) ((mergArr[nm/2]) + mergArr[nm/2-1])/2;
        }else{
            return (float) mergArr[nm/2];
        }



    }

    public static void main(String[] args) {
        int[] nums1_2 = {2};
        int[] nums2_2 = {};

        System.out.println(findMedianSortedArrays(nums1_2, nums2_2));
    }
}