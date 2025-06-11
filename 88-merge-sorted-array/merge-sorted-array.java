/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            for(int i=m, j=0; j<n; j++){
                nums1[i] = nums2[j];
                i++;
            }
        }
        Arrays.sort(nums1);
        return nums1;
    }
} */

/*class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
*/
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0, i=m;
        while(j < n){
            nums1[i] = nums2[j];
            i++;
            j++;
        }
        Arrays.sort(nums1);
    }
}