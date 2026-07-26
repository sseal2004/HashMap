class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();

        for(int num:nums) set.add(num);

       int longest =0;

        for(int num : set){//traverse the set
           if(!set.contains(num-1)){//start of a sequence
           int current = num;//store num 
           int length = 1;// as till now one element is been considered
           while(set.contains(current+1)){//include the preceeding elements
                length++;
                current++;
           }
           longest = Math.max(length,longest);
           }

        }
        return longest;
    }
}