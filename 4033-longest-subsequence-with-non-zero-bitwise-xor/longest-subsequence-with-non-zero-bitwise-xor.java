class Solution {
    public int longestSubsequence(int[] nums) {
        int x=0,z=0;
        int n= nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) z++;
            x^=nums[i];
        }
        if(z==n) return 0;
        else{
            if(x==0) return n-1;
            else return n;
        }
        

    }
}