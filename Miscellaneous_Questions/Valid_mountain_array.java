class Solution {
    public boolean validMountainArray(int[] arr) {
        int maxi=0,max=arr[0];
        if(arr.length<3)
            return(false);
        for(int i=1;i<arr.length;i++)
            if(max<arr[i])
            {
                max=arr[i];
                maxi=i;
            }
        if(maxi==arr.length-1||maxi==0)
            return(false);
        for(int i=0;i<maxi;i++){
            if(arr[i]>=arr[i+1])
                return(false);
        }
        for(int i=maxi;i<arr.length-1;i++)
            if(arr[i]<=arr[i+1])
                return(false);
        return(true);
    }
}

//https://leetcode.com/problems/valid-mountain-array/solution/
