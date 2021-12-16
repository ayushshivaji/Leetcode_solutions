class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] temp;
        int t;
        for(int i=0;i<board.length;i++){
            temp=new int[10];
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.')
                    continue;
                t=board[i][j]-'0';
                if(temp[t]!=0)
                    return(false);
                else
                    temp[t]++;
            }
        }
        for(int i=0;i<board.length;i++){
            temp=new int[10];
            for(int j=0;j<board[0].length;j++){
                if(board[j][i]=='.')
                    continue;
                t=board[j][i]-'0';
                if(temp[t]!=0)
                    return(false);
                else
                    temp[t]++;
            }
        }
        // int rcount=3;
        // int ccount=3;
        for(int k=0;k<9;k+=3)
        {
            for(int l=0;l<9;l+=3)
            {
                temp=new int[10];
                for(int i=k;i<k+3;i++)
                {
                    for(int j=l;j<l+3;j++)
                    {
                        if(board[i][j]=='.')
                            continue;
                        t=board[i][j]-'0';
                        if(temp[t]!=0)
                            return(false);
                        else
                            temp[t]++;
                    }
                }
            }
        }
        return(true);
    }
}

//https://leetcode.com/problems/valid-sudoku/submissions/
