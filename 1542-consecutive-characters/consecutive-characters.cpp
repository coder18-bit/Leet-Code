class Solution {
public:
    int maxPower(string s) {
        int ans=INT_MIN;
        int cnt=1;
        if(s.size()==1) return 1;
        for(int i=0;i<s.size()-1;i++){
            if(s[i]==s[i+1]) cnt++;
            else cnt=1;
            ans = max(ans,cnt);
        }
        return ans;
    }
};