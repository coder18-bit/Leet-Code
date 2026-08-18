class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n ;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        if(k==n){
             return Arrays.stream(nums).max().getAsInt();
        }
        if(k==1){
            int maxVal=-1;
           for(int i=0;i<n;i++){
            if(map.get(nums[i])==1 && nums[i]>maxVal){
                maxVal=nums[i];
            }
           }
           return maxVal; 
        }
        n = n-1;
        if(map.get(nums[0])==1 && map.get(nums[n])>1){
            return nums[0];
        }
        if(map.get(nums[n])==1 && map.get(nums[0])>1){
            return nums[n];
        }
        if(map.get(nums[n])==1 && map.get(nums[0])==1){
            return Math.max(nums[n],nums[0]);
        }
        return -1;
        

    }
}