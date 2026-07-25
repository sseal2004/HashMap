class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map =  new HashMap<>();
        for(String w:strs){
            char[]arr= w.toCharArray();
            //because all the anagrams becomes same after sorting
            Arrays.sort(arr);
            String s = new String(arr); //sorted word from arr added
            if(!map.containsKey(s)){
            map.put(s,new ArrayList<>());//add the word into map 
            }
            map.get(s).add(w); //fetch those word from map and add them to list
             
        }
        return new ArrayList<>(map.values());
        
    }
}