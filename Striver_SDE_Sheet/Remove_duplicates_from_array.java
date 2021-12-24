class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[j])
                nums[++j]=nums[i];
        }
        return(j+1);
    }
}

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/
