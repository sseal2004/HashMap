class Solution {
    public List<Integer> intersection(int[][] nums) {
        ArrayList<Integer>list = new ArrayList<>();
        int[]freq = new int[1001];
        int n = freq.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                freq[nums[i][j]]++;
            }
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==nums.length) list.add(i);
        }
        return list;

    }
}