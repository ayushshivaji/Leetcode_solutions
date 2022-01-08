class Solution {
    public int climbStairs(int n) {
        if(n<3)
            return(n==1?1:2);
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        System.out.print(n);
        for(int i=3;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];
        return(dp[n]);
    }
}

//https://leetcode.com/problems/climbing-stairs/submissions/
