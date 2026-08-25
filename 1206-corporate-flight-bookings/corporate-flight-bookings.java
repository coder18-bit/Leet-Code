class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int diff [] = new int [n+1];
        int s= bookings.length;
       for(int [] arr : bookings){
        int l = arr[0];
        int r = arr[1];
        int val = arr[2];
        diff[l-1]+=val;
        diff[r]-=val;
       }
       int [] prefix = new int[n];
       prefix[0]=diff[0];
       for(int i=1;i<diff.length-1;i++){
        prefix[i] = diff[i]+prefix[i-1];
       }
       
       return prefix;
    }
}