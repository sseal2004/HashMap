class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashSet<Character>jewelSet = new HashSet<>();
        for(char j : jewels.toCharArray()){
            jewelSet.add(j);
        }
        for(char s : stones.toCharArray()){
            if(jewelSet.contains(s)) count++;
        }
        return count;
    }
}