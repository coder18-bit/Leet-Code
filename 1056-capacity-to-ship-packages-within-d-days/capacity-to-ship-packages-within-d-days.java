class Solution {
    public static boolean isEnoughdays(int [] arr,int days,int capacity){
       int cnt = 1;
        int currentWeight = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > capacity) {
                return false;
            }
            if (currentWeight + arr[i] > capacity) {
                cnt++;
                currentWeight = arr[i];
            } else {
                currentWeight += arr[i];
            }
        }

        return cnt <= days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high= Arrays.stream(weights).sum();
       while(low<high){
        int mid=(low+high)/2;
        if(isEnoughdays(weights,days,mid)){
            high=mid;
        }
        else{
            low=mid+1;
        }
       }
    return low;
    }
}