class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0;char c;int flag=0;
        while(true){
            if(strs.length==1&&strs[0]=="")
                return("");
            else if(strs.length==1)
                return(strs[0]);
            for(int j=0;j<strs.length;j++)
            {
                if(i>=strs[j].length())
                {flag=1;break;}
                if(strs[0]!=""&&strs[0].charAt(i)!=strs[j].charAt(i)){
                    flag=1;break;}
                else if (strs[j]==""){
                    flag=1;i=0;break;}
            }
            if(flag==1)
                break;
            else
                i++;
        }
        // System.out.print(i);
        return(strs[0].substring(0,i));
    }
}

//https://leetcode.com/problems/longest-common-prefix/submissions/
