class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        if(n > s2.length())
        return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i=0; i<n; i++){
            char c = s1.charAt(i);
            count1[c-'a'] ++;
        }

        int l = 0, r = 0;

        while(r < s2.length()){
            char c = s2.charAt(r);
            count2[c-'a']++;

            if(r-l+1 == n){
                if(Arrays.equals(count1,count2))
                return true;
                count2[s2.charAt(l) - 'a']--;
                l++;
            }
            r++;
        }
        return false;
    }
    
}