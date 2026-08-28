class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set1= new HashSet<>();
        HashSet<Integer>set2= new HashSet<>();
        HashSet<Integer>result= new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int n : nums1) set1.add(n);
        for(int j : nums2) set2.add(j);
        for(int m : set2){
            if(!set1.contains(m))
            list1.add(m);
        }
        for(int i : set1){
            if(!set2.contains(i))
            list2.add(i);
        }

        List<List<Integer>>reslist = new ArrayList<List<Integer>>();
        reslist.add(list2);
        reslist.add(list1);


        return reslist;
    }
}