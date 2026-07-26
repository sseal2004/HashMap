class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map= new HashMap<>();
        int majority=0;int result=0;
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>majority){
                result=num;
                majority=map.get(num);
            }
        }
       return result;
    }
}