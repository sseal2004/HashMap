class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map= new HashMap<>();
        int maxfreq=0;int sum =0;
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int freq: map.values()) maxfreq = Math.max(freq,maxfreq);
        for(int freq: map.values()) if(freq==maxfreq) sum+=freq;
        return sum;
    }
}