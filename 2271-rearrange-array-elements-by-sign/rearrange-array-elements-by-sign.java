class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] ans = new int[nums.length];
        int posindx=0;
        int negidx=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[negidx]=nums[i];
                negidx+=2;
            }
            else{
                ans[posindx]=nums[i];
                posindx+=2;
            }
        }
        return ans;
    }
}