class Solution {
    public String addBinary(String a, String b) {
        String res="";
        int n=a.length()-1;
        int m=b.length()-1;
        int sum=0,carry=0;
        while(n>=0&&m>=0)
        {
            sum=(a.charAt(n--)-'0')+(b.charAt(m--)-'0')+carry;
            carry=0;
            if(sum>=2)
            {
                sum-=2;
                carry=1;
            }
            res+=String.valueOf(sum);
            // System.out.println(res);
        }
        while(n>=0)
        {
            sum=(a.charAt(n--)-'0')+carry;
            carry=0;
            if(sum>=2)
            {
                sum-=2;
                carry=1;
            }
            res+=String.valueOf(sum);
            // System.out.println(res);
        }
        while(m>=0)
        {
            sum=(b.charAt(m--)-'0')+carry;
            carry=0;
            if(sum>=2)
            {
                sum-=2;
                carry=1;
            }
            res+=String.valueOf(sum);
            // System.out.println(res);
        }
        if(carry!=0)
            res+=String.valueOf(carry);
        // res=reverse(res);
        String rev="";
        for(int i=res.length()-1;i>=0;i--)
            rev+=res.charAt(i);
        return(rev);
    }
}

//https://leetcode.com/problems/add-binary/submissions/
