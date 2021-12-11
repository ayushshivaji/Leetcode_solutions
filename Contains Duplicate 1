class Solution {
    public boolean containsDuplicate(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(min>i)
                min=i;
            if(max<i)
                max=i;
        }
        boolean[] visited = new boolean[max-min+1];
        for(int i:nums){
            if(visited[i-min])
                return true;
            visited[i-min]=true;
        }
        return false;
    }
}
