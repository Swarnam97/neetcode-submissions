class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int i=0 ;i <nums.length;i++){
            int ele = target - nums[i];

            if(mp.containsKey(ele)){
                return new int[]{mp.get(ele),i};
            }
            mp.put(nums[i],i);
        }
        return new int[]{-1,-1};
}
}