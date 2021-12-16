class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count1= new int[26];
        int[] count2= new int[26];
        for(char c:ransomNote.toCharArray())
            count1[c-'a']++;
        for(char c:magazine.toCharArray())
            count2[c-'a']++;
        int i=0;
        for(char c:ransomNote.toCharArray())
            if(!(count1[c-'a']<=count2[c-'a']))
                return(false);
        return(true);
    }
}

//https://leetcode.com/problems/ransom-note/submissions/
