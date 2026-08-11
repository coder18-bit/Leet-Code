class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        map<char,int>map1;
        int maxi=0;
        int left=0;
        for(int right=0;right<s.size();right++){
            map1[s[right]]++;
            while(map1[s[right]]> 1){
                map1[s[left]]--;
                left++;
            }
            maxi= max(maxi,right-left+1);
        }
        return maxi;
    }
};