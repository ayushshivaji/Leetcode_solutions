class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        // int[] nums1={1,2,2,1};
        // int[] nums2={2,2};
        HashMap<Integer,Integer> hm1 = new HashMap<>();
        HashMap<Integer,Integer> hm2 = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();
        int temp;
        for(int i:nums1){
            if(hm1.containsKey(i)){
                temp=hm1.get(i);
                hm1.put(i,++temp);
            }
            else
            hm1.put(i,1);
        }
        for(int i:nums2){
            if(hm2.containsKey(i)){
                temp=hm2.get(i);
                hm2.put(i,++temp);
            }
            else
            hm2.put(i,1);
        }
        for(int key:hm1.keySet()){
            if(hm2.containsKey(key)){
                temp=Math.min(hm2.get(key),hm1.get(key));
                while(temp-->0)
                    result.add(key);
            }
        }
        // System.out.print(result);
        // return(list.toArray(result));
        int[] array = new int[result.size()];
        for(int i = 0; i < result.size(); i++) array[i] = result.get(i);
        return(array);
    }
}
