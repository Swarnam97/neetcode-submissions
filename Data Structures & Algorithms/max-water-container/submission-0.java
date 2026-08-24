class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0, r = n-1;
        int ans = 0;
        while(l < r){
            int minH = Math.min(height[l] , height[r]);
            int area =  minH * (r-l);
            ans = Math.max(area,ans);
            while(l<r && height[l] <= minH)
            l++;
            while(l<r && height[r] <= minH)
            r--;
            
        }

        return ans;
    }
}