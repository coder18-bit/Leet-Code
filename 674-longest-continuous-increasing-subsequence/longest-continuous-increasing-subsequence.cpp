class Solution {
public:
    int findLengthOfLCIS(vector<int>& nums) {
        int cnt=1;
        int ans= INT_MIN;
        if(nums.size()==1) return 1;
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]<nums[i+1]) cnt++;
            else  cnt=1;
            ans=max(ans,cnt);
        }
        return ans;
    }
};