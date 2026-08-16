class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer>mp = new HashMap<>();
        
        for(int []m : matches){
            mp.putIfAbsent(m[0],0);
            mp.put(m[1],mp.getOrDefault(m[1],0)+1);
        }
        List<Integer> zero = new ArrayList<>();
        List<Integer> ones = new ArrayList<>();

        for(int player : mp.keySet())
        {
            if(mp.get(player)==0){
                zero.add(player);
            }
            if(mp.get(player)==1){
                ones.add(player);
            }
        }
        Collections.sort(zero);
        Collections.sort(ones);
        return List.of(zero,ones);
    }
}