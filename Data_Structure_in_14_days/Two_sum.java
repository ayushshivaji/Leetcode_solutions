import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] nums={3,2,4};
        // int target = 6;
        int[] ar=new int[2];
        // Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length;i++){
            int t=target-nums[i];
            // print(nums[i]);
            // print(t);
            j=search(nums,t,i);
            if(j!=-1){
                ar[0]=i;
                ar[1]=j;
                return(ar);
                // print(ar);
                // break;
            }
        }
        return(ar);
    }

    static int search(int[] arr,int key,int ignore){
        for(int i=0;i<arr.length;i++){
            if(i==ignore)
                continue;
            if(arr[i]==key)
                return(i);
        }
        return(-1);
    }
}
