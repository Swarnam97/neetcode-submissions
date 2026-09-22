class Solution {
    int findPivot(int[] nums){
        int l = 0 , r = nums.length - 1 , m ;

        while(l < r){
             m = l + (r-l)/2;
            if(nums[m] > nums[r]){
                l = m + 1;
            }
            else
            r = m;
        }

        return r;
    }

    int binarySearch(int[] nums, int l, int r, int target){

        while(l <= r){
            int m = l + (r-l)/2;
            if(nums[m] == target)
            return m;
            if(nums[m] <= target){
                l = m+ 1;
            }
            else
            r = m - 1;
        }
        return -1;
    }

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length;
        int pivot = findPivot(nums);

        int idx = binarySearch(nums,0,pivot - 1,target);
        if(idx != -1)
        return idx;

        idx = binarySearch(nums,pivot,r-1, target);
        return idx;
        
    }
}