class Solution {
public:
    string reverseWords(string s) {
        string help = "";
        string ans = "";
        int n = s.size();
        for(int i=n-1;i>=0;i--)
        {
            if(s[i] == ' ')
            {
                if(help.size()!=0)
                {
                    reverse(help.begin(),help.end());
                    ans+=help;
                    ans+=" ";
                    help = "";
                }
                
            }
            else{ 
                    help += s[i];
                }
        }
        if(help.size()!=0)
        {
            reverse(help.begin(),help.end());
            ans+=help;
        }
        if(!ans.empty() && ans[ans.size()-1] == ' ')
        {
            ans.pop_back();
        }
        return ans;
        
    }
};
