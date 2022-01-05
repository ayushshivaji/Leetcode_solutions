class Solution {
    public int mySqrt(int x) {
        int start=1,end=x,mid=0;
        if(x==0)
            return(0);
        while(start<=end){
            mid = start + (end - start) / 2;
            // System.out.println(mid);
            // smid=mid*mid;
            if(mid==x/mid)
                return(mid);
            else if(mid<x/mid)
                start=mid+1;
            else
                end=mid-1;
        }
        // if(x<mid)
            return(end);
        // else
        //     return(mid+1);
    }
}

//https://leetcode.com/problems/sqrtx/
