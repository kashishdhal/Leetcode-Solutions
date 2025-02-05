class Solution {
    public String getSmallestString(int n, int k) {
        char[] ch = new char[n];
        for(int i=0;i<n;i++) {
            ch[i]='a';
            k--;
        }
        int currChar=0;
        while(k>0) {
            currChar=Math.min(25,k);
            ch[--n]+=currChar;
            k-=currChar;
        }
        return String.valueOf(ch);
    }
}
