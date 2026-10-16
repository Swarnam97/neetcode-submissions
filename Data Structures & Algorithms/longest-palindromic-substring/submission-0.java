class Solution {
    int dp[][];
    private int check(String s, int i , int j){
        if(i>j)
        return 1;

        if(dp[i][j] != -1)
        return dp[i][j];

        if(s.charAt(i) == s.charAt(j))
        return dp[i][j] = check(s,i+1,j-1);
        else
        return 0;

    }
    public String longestPalindrome(String s) {
        int maxLen = 1;
        int sp = 0;
        dp = new int[1001][1001];

        for(int i=0; i<1001; i++){
            Arrays.fill(dp[i] , -1);
        }
        
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){

                if(check(s,i,j) == 1){
                    if(j-i+1 > maxLen){
                        maxLen = Math.max(maxLen , j-i+1);
                        sp = i;
                    }
                    
                }
            }
        }
       

        return s.substring(sp,sp+maxLen);
    }
}