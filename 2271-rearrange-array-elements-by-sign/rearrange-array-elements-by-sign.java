class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []arr = new int[nums.length];int pos=0;int neg=1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]>0){ insert(arr,nums[i],pos);pos+=2 ;}
           else {insert(arr,nums[i],neg);neg+=2;}
        }
        return arr;
    }
    public static void insert(int[]arr,int element,int index){
        arr[index] = element;
    }
}