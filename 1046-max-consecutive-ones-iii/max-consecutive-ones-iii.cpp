class Solution {
public:
    int longestOnes(vector<int>& nums, int k) {
        int left=0,right=0,mx=0;
        int z=0;
        for(int right=0;right<nums.size();right++){
            if(nums[right]==0){
                z++;
            }
            while(z>k){
                if(nums[left]==0){
                    z--;
                }
                left++;
            }
            mx= max(mx,right-left+1);
        }
        return mx;
    }
};