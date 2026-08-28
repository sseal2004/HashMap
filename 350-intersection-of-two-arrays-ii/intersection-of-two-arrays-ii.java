class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer>map1= new HashMap<>();
        Map<Integer,Integer>map2= new HashMap<>();

        for(int n : nums1){
            map1.put(n,map1.getOrDefault(n,0)+1);
        }
        for(int n2: nums2){
            if(map1.containsKey(n2) && map1.get(n2)>0)
            {
                map2.put(n2,map2.getOrDefault(n2,0)+1);
                map1.put(n2,map1.get(n2)-1);
            }
        }
        int size=0;
        for(int k:map2.values()){
            size += k;
        }

        int []arr= new int[size];
        int i=0;
        for(int k: map2.keySet()){
            int count = map2.get(k);
            while(count>0){
                arr[i++]=k;
                count--;
            }
        }
        return arr;
        
    }
}