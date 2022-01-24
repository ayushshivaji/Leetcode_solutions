class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)>='A'&&word.charAt(i)<='Z')
                count++;
        }
        if(count==0)
            return(true);
        else if(count == 1)
            return((word.charAt(0)>='A'&&word.charAt(0)<='Z')?true:false);
        else if(count==word.length())
            return(true);
        else
            return(false);
    }
}

//https://leetcode.com/problems/detect-capital/submissions/
