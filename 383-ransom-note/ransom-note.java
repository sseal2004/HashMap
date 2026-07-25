class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        Map<Character,Integer>magazineSet = new HashMap<>();
        for(char m : magazine.toCharArray()){
            magazineSet.put(m,magazineSet.getOrDefault(m,0)+1);
        }
        for(char r : ransomNote.toCharArray()){
            if(magazineSet.getOrDefault(r,0)>0){
             magazineSet.put(r,magazineSet.get(r)-1);
            }else {return false;}
        }
        
        return true;
    }
}