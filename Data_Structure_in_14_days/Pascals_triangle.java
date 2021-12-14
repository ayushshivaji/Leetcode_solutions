class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        // temp.add(1);
        // lst.add(temp);
        // if(numRows==1) 
        //     return(lst);
        // temp.add(1);
        // lst.add(temp);
        // if(numRows==2)
            // return(lst);
        for(int i=0;i<numRows;i++){
            temp=new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i)
                    temp.add(1);
                else
                    temp.add((lst.get(i-1).get(j-1))+(lst.get(i-1).get(j)));
            }
            lst.add(temp);
        }
        return(lst);
    }
}

//https://leetcode.com/problems/pascals-triangle/submissions/
