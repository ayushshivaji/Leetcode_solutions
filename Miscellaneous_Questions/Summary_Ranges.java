class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ls = new ArrayList<>();
        if(nums.length==0)
            return(new ArrayList<String>(){});
        int prev=nums[0];
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(++prev==nums[i]){
                count++;
                continue;
            }
            if(count==0)
                ls.add(""+(prev-1));
            else
            ls.add(prev-++count+"->"+nums[i-1]);
            prev=nums[i];
            count=0;
        }
        if(prev-count!=prev)
            ls.add(prev-count+"->"+prev);
        else
            ls.add(""+prev);
        // System.out.println(prev);
        return(ls);
    }
}

//https://leetcode.com/problems/summary-ranges/submissions/
