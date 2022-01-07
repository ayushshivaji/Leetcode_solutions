class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            if(hm.containsKey(i))
                hm.put(i,hm.get(i)+1);
            else
                hm.put(i,1);
        }
    
        for(int i:hm.keySet())
            if(hm.get(i)==1)
                return(i);
        return(0);
    }
}

//https://leetcode.com/problems/single-number/submissions/
