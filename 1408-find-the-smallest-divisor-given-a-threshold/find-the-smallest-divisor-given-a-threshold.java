class Solution {
    public static boolean istrue(int [] arr,int threshold,int req){
        int needed=0;
        for(int x : arr){
            needed += (int)Math.ceil((double)x/req);
        }
        return needed<=threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        while(low<high){
            int mid=(low+high)/2;
            if(istrue(nums,threshold,mid)){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
}