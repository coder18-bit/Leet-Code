class Solution {
    public int[] getAverages(int[] nums, int k) {
        int left=0;
        long sum=0;
        int arr [] = new int [nums.length];
        int windowsize = 2*k+1;
        Arrays.fill(arr,-1);
        for(int right=0; right< nums.length;right++){
            
            sum+=nums[right];
            if(right-left+1 == windowsize){
                int ag = (int)(sum/windowsize);
                int mid = left+k;
                arr[mid]=ag;
                sum-=nums[left];
                left++;
            }
           
        }
        
        return arr;
    }
}