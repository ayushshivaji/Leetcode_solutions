class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==']')
                if(ch.empty()||ch.peek()!='[')
                    return(false);
                else
                    ch.pop();
            else if(s.charAt(i)=='}')
                if(ch.empty()||ch.peek()!='{')
                    return(false);
                else
                    ch.pop();
            else if(s.charAt(i)==')')
                if(ch.empty()||ch.peek()!='(')
                    return(false);
                else
                    ch.pop();
            else
                ch.push(s.charAt(i));
        }
        if(ch.empty())
        return(true);
        return(false);
    }
}

//https://leetcode.com/problems/valid-parentheses/submissions/
