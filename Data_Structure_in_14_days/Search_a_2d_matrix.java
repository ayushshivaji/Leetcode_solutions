class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int len=matrix.length*matrix[0].length;
        int low=0,mid,high=len-1;
        int i,j;
        while(low<=high){
            mid=(low+high)/2;
            i=mid/matrix[0].length;
            j=mid%matrix[0].length;
            if(matrix[i][j]==target)
                return(true);
            else if(matrix[i][j]<target)
                low = mid+1;
            else
                high=mid-1;
        }
        return(false);
    }
}

//https://leetcode.com/problems/search-a-2d-matrix/submissions/
