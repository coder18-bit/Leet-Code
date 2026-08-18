class Solution {
    public void moveZeroes(int[] nums) {
       int cnt=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            cnt++;
        }
        else if(cnt>0){
            int t = nums[i];
            nums[i]=0;
            nums[i-cnt]=t;
        }
       }

            
            

        }
    }
