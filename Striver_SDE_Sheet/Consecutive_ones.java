class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                count++;
            if(nums[i]==0){
                max = max<count?count:max;
                count=0;
            }
             max = max<count?count:max;
        }
        return(max);
    }
}

//https://leetcode.com/problems/max-consecutive-ones/submissions/
