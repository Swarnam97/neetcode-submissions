class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        int pre_prev = 0;
        int pre = nums[0];
        int curr = nums[0];

        for(int i=2; i<=n; i++){
            int steal = pre_prev + nums[i-1];
            int skip = pre;
            curr = Math.max(steal,skip);

            pre_prev = pre;
            pre = curr;
        }

        return curr;
    }
}