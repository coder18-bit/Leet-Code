class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int ans [] = new int [n];
        Arrays.fill(ans,0);
        int s= bookings.length;
       for(int i=0;i<s;i++){
        for(int j=bookings[i][0]-1;j<bookings[i][1];j++){
            ans[j]+=bookings[i][2];
        }
       }
       return ans;
    }
}