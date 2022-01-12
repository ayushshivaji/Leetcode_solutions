class Solution {
    public int addDigits(int num) {
        // int sum=0;
        if(num==0)
            return(0);
        while(countDigits(num)!=1){
            num=sumDigits(num);
        }
        return(num);
    }
    public int countDigits(int n){
        int count = 0;
        while(n>0){
            n=n/10;
            count+=1;
        }
        return(count);
    }
    public int sumDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return(sum);
    }
}

//https://leetcode.com/problems/add-digits/submissions/
