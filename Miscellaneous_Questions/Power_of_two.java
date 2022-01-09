class Solution {
    public boolean isPowerOfTwo(int n) {
        float result = (float)(Math.log(n) / Math.log(2));
        int result_n = (int)(Math.log(n) / Math.log(2));
        if(n==1)
            return(true);
        else if(n%2==1)
            return(false);
        else if(result-result_n==0)
            return(true);
        else
            return(false);
    }
}

//https://leetcode.com/problems/power-of-two/submissions/
