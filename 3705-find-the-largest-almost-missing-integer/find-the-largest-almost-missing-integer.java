class Solution {
    public int largestInteger(int[] nums, int k) {
       HashMap<Integer,Integer>map = new HashMap<>();
      
       int n=nums.length;
       int maxi=-1;
       for(int i=0;i<=n-k;i++){
         HashSet<Integer>set = new HashSet<>();
        for(int j=i;j<i+k;j++){
           set.add(nums[j]);
        }
        for(int x : set){
            map.put(x,map.getOrDefault(x,0)+1);
        }
       }
       for(Map.Entry<Integer,Integer> entry : map.entrySet() ){
        if(entry.getValue() == 1){
            maxi=Math.max(maxi,entry.getKey());
        }
       }
       return maxi; 
    }
}