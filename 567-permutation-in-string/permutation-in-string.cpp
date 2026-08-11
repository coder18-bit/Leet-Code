class Solution {
public:
    bool checkInclusion(string s1, string s2) {
        if(s1.size()>s2.size()){
            return false;
        }
        map<char,int>count1;
        map<char,int>count2;
        for(char ch : s1){
            count1[ch]++;
        }
        int k = s1.size();
        int left=0;
        for(int right=0;right<s2.size();right++){
            count2[s2[right]]++;
            if(right-left+1 > k){
                count2[s2[left]]--;

                if(count2[s2[left]]==0){
                    count2.erase(s2[left]);
                }
                left++;
            }
            if(count1==count2){
                return true;
            }
            
        }
        return false;
    }
};