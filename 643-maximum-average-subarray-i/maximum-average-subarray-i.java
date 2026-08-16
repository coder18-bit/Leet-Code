class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int left =0;
       double currentSum=0;
       double mxAvg = -1000000000;
       for(int right =0; right < nums.length;right++){
        currentSum += nums[right];
        if(right >= k-1){
            double cAvg = currentSum/k;
            mxAvg = Math.max(mxAvg,cAvg);
            currentSum -= nums[left];
            left++;
        }
       }
       return mxAvg;

    }
}