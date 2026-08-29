class Solution {
    public int singleNonDuplicate(int[] nums) {
       int low=0;
       int high=nums.length-1;
       if(nums.length==1){
        return nums[0];
       } 
       while(low<high){
        int mid=(low+high)/2;
        if(nums[mid]==nums[mid^1]){
            low= mid+1;
        }
        else{
            high=mid;
        }
       }
       return nums[low];
    }
}