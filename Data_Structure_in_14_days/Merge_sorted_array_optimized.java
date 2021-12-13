class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1=m-1;
        int tail2=n-1;
        int here=m+n-1;
        while(tail1>=0&&tail2>=0){
            if(nums1[tail1]<nums2[tail2])
                nums1[here--]=nums2[tail2--];
            else
                nums1[here--]=nums1[tail1--];
        }
        while(tail2>=0)
            nums1[here--]=nums2[tail2--];
        
    }
}
