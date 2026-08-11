class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
       int left=0;
       int cnt=0,maxi=0;
       char [] ch = s.toCharArray();
       for(int right=0; right<s.length();right++){
        if(isVowel(ch[right])){
            cnt++;
        }
        if(right-left+1 == k){
            maxi=Math.max(cnt,maxi);
            if(isVowel(ch[left])){
                  cnt--;
            }
            left++;
            
        }
        
       }
       return maxi;


    }
}