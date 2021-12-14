class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // int[][] mat=new int[][]{{4,2},{3,4},{5,6},{7,8}};
        // int r=2,c=4;
        if(r*c!=mat.length*mat[0].length||(r==mat.length&&c==mat[0].length)){
            return(mat);
        }
        int count_c=0;
        int count_r=0;
        int[][] result = new int[r][c];
        int[] temp = new int[c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(count_c==c){
                    count_c=0;
                    // print(temp);
                    result[count_r++]=temp;
                    temp = new int[c];
                    temp[count_c++]=mat[i][j];
                }
                else{
                    temp[count_c++]=mat[i][j];
                    // print(count_c);
                }
            }
            result[count_r]=temp;

        }
        // result[0]=mat[0];
        return(result);
    }
}

//https://leetcode.com/problems/reshape-the-matrix/submissions/
