class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int cnt=0;
        int left=0;
        double currentSum=0;
        for(int right=0;right<nums.length;right++){
            currentSum +=nums[right];
            if(right>=k-1){
                double cAvg = currentSum/k;
                if(cAvg >= threshold){
                    cnt++;
                }
                currentSum -= nums[left];
                left++;
            }
        }
        return cnt;
    }
}