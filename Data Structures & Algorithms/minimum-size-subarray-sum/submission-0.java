class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums[0] >= target)
        return 1;
        int l = 0 ,  sum = nums[0], ans = Integer.MAX_VALUE;

        for(int r = 1; r<nums.length; r++){
            sum += nums[r];
            while(l<=r && sum >= target){
                ans = Math.min(ans, r-l+1);
                sum -= nums[l];
                l++;
            }
        }
        return (ans==Integer.MAX_VALUE) ? 0 : ans;
    }
}