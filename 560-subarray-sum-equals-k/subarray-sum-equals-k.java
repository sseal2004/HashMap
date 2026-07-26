class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>map = new HashMap<>();
        map.put(0,1);
        int psum =0;int count=0;
        for(int num:nums){
            psum += num;
            int rem = psum -k;
            if(map.containsKey(rem)) count += map.get(rem); // if found 

             map.put(psum,map.getOrDefault(psum,0)+1 );
        }
        return count;
    }
}