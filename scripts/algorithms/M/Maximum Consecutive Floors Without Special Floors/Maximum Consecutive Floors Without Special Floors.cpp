class Solution {
public:
    int maxConsecutive(int bottom, int top, vector<int>& special) {
        
        int res(0), n(size(special));
        sort(begin(special), end(special));
        
        for (int i=1; i<n; i++) {
            res = max(res, special[i]-special[i-1]-1);
        }
                
        return max({res, special[0]-bottom, top-special[n-1]});
    }
};
