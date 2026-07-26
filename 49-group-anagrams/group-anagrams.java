class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map =  new HashMap<>();
        for(String w:strs){
            char[]arr= w.toCharArray();
            Arrays.sort(arr);
            String s = new String(arr); 
            if(!map.containsKey(s)){
            map.put(s,new ArrayList<>());
            }
            map.get(s).add(w); 
             
        }
        return new ArrayList<>(map.values());
        
    }
}
