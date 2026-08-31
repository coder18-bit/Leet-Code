class Solution {
    public static boolean canEat(int [] piles, int hours_have,int k){
        long hoursNeeded =0;
        for(int pile : piles){
            hoursNeeded += (int)Math.ceil((double)pile/k);
        }
        return hoursNeeded <= hours_have;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
    int high = Arrays.stream(piles).max().getAsInt();
    while(low<high){
        int mid = (low+high)/2;
        if(canEat(piles,h,mid)){
            high=mid;
        }
        else{
            low=mid+1;
        }
    }
    return low;
    }
}