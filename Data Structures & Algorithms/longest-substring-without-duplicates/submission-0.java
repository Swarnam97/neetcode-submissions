class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count[] = new int[128];
        int left = 0;
        int ans = 0;

        for(int i=left; i<s.length(); i++){
            char ch = s.charAt(i);
            count[ch] ++;
            while(count[ch] > 1){
                count[s.charAt(left)]--;
                left ++;
            }
            ans = Math.max(ans,i-left+1);
        }

        return ans;
    }
}
