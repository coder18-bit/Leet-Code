class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s1.length() > s2.length()){
        return false;
       } 
       HashMap<Character,Integer>count1 = new HashMap<>();
       HashMap<Character,Integer>count2= new HashMap<>();
       for(char ch : s1.toCharArray()){
        count1.put(ch,count1.getOrDefault(ch,0)+1);
       }
       int left=0;
       int k=s1.length();
       for(int right=0;right < s2.length();right++){
        char ch = s2.charAt(right);
        count2.put(ch,count2.getOrDefault(ch,0)+1);
        if(right-left+1 > k){
            char chleft = s2.charAt(left);
            count2.put(chleft,count2.get(chleft)-1);

            if(count2.get(chleft)==0){
                count2.remove(chleft);
            }
            left++;
        }
        if(count1.equals(count2)){
            return true;
        }
       }
       return false;
    }
}