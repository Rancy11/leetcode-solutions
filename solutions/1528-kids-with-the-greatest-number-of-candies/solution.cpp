class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
               int n=candies.size();

        vector<bool>solution(n,false);
        int maxx=INT_MIN;
        maxx=*max_element(candies.begin(),candies.end());
        for(int i=0; i<n;i++){
            if(candies[i]+extraCandies>=maxx){
                solution[i]=true;

            }
        }
                    return solution;

    }
};
