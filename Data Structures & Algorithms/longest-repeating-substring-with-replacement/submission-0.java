class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int ans = 0;
        //HashMap<Character,Integer> count = new HashMap<>();
        int count[] = new int[26];
        int maxF = 0;
        for(int r = 0; r<s.length(); r++ ){
            char ch = s.charAt(r);
           // count.put(ch,count.getOrDefault(ch,0)+1);
            count[ch-'A'] = count[ch-'A'] +1;
            maxF = Math.max(maxF, count[ch-'A']);

            while((r-l+1) - maxF > k){
                char left = s.charAt(l);
                count[left-'A'] = count[left-'A'] -1;
                l++;
            }

            ans = Math.max(r-l+1 , ans);
        }
        
        return ans;
    }
}