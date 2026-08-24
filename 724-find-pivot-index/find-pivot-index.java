class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int arr[] = new int[nums.length+1];
        Arrays.fill(arr,0);
        for(int i=1;i<=nums.length;i++){
            arr[i]=arr[i-1]+nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            if(arr[i]==arr[n]-arr[i+1]) return i;
        }
        return -1;
    }
}