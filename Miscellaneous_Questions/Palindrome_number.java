class Solution {
    public boolean isPalindrome(int x) {
        return(x==reverse(x));
    }
    public int reverse(int x){
        int t=0;
        while(x>0)
        {
            t=t*10+x%10;
            x=x/10;
        }
        return t;
    }
}

//https://leetcode.com/problems/palindrome-number/submissions/
