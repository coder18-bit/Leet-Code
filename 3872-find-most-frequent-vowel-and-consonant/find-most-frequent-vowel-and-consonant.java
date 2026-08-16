class Solution {
    public int maxFreqSum(String s) {
       HashMap<Character,Integer> mp = new HashMap<>();

       for(char ch : s.toCharArray()){
        mp.put(ch, mp.getOrDefault(ch,0)+1);
       }
       int maxVowel=0, maxConst=0;
       for(char ch : mp.keySet()){
        if("aeiou".indexOf(ch) != -1){
            maxVowel = Math.max(maxVowel,mp.get(ch));
        }
        else{
            maxConst= Math.max(maxConst,mp.get(ch));
        }
       }
       return maxConst+maxVowel;


    }
}