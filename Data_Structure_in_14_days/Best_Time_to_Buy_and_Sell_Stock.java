class Solution {
    public int maxProfit(int[] nums) {
        // int[] nums={7,6,4,3,1,4};
        int min=Integer.MAX_VALUE;
        int max_diff=-1;
        int curr_diff=-1;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i])
                min=nums[i];
            curr_diff=nums[i]-min;
            if(curr_diff>max_diff)
                max_diff=curr_diff;
        }
        if(max_diff<0)
            max_diff=0;
        return(max_diff);
    }
}
