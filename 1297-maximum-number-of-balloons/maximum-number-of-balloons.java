class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character,Integer>map= new HashMap<>();
        for(char t : text.toCharArray()){
            map.put(t,map.getOrDefault(t,0)+1);
        }
        //take min b,a,l,o,n character keys
        int a = map.getOrDefault('a',0);
        int b=map.getOrDefault('b',0);
        int l= map.getOrDefault('l',0)/2;
        int o = map.getOrDefault('o',0)/2;
        int n= map.getOrDefault('n',0);

            return Math.min(Math.min(b, a), Math.min(Math.min(l, o), n));
    };
}