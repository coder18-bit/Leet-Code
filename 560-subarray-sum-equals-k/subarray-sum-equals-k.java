class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefix=0;
        int cnt=0;
        HashMap<Integer,Integer>map= new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            prefix+=num;
           
            if(map.containsKey(prefix-k)){
                cnt+= map.get(prefix-k);
            }
             map.put(prefix,map.getOrDefault(prefix,0)+1);
        }
            
        return cnt;
    }
    

}
