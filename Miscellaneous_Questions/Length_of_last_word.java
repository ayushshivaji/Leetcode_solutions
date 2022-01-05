class Solution {
    public int lengthOfLastWord(String s) {
        String[] st = s.strip().split(" ",0);
        return(st[st.length-1].length());
    }
}

//https://leetcode.com/problems/length-of-last-word/submissions/
