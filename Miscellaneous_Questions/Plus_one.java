class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length,len=n-1;int count=0;
        for(int i=0;i<n;i++)
            if(digits[i]==9)
                count++;
        if(digits[n-1]!=9){
            digits[n-1]++;
            return(digits);
        }
        else if(n==count){
            int[] arr = new int[n+1];
            arr[0]=1;
            return(arr);
        }
        else{
            while(digits[len]==9){
                digits[len]=0;
                len--;
            }
            digits[len]++;
            return(digits);
        }
    }
}

//https://leetcode.com/problems/plus-one/submissions/
